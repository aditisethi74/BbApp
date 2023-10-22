package net.Bloodbank.BbApp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;
import net.Bloodbank.BbApp.dto.DonorRequest;
import net.Bloodbank.BbApp.service.DonorService;

@RestController
public class DonorControllor {
	@Autowired
	private DonorService donorService;

	// ----> API using DTO <-------

	@PostMapping("/donor")
	public ResponseEntity<DonorRequest> createUser(@RequestBody @Valid DonorRequest donorRequest) {
		return new ResponseEntity<>(donorService.createDonor(donorRequest), HttpStatus.CREATED);

		// DonorRequest savedDonor = donorService.createDonor(donorRequest);
		// return new ResponseEntity<>(savedDonor, HttpStatus.CREATED);
	}

	@GetMapping("/donor/{id}")
	public ResponseEntity<DonorRequest> getUserById(@PathVariable int id) {
		DonorRequest donor = donorService.getDonorById(id);
		return new ResponseEntity<>(donor, HttpStatus.OK);
	}

	@GetMapping("/donor")
	public ResponseEntity<List<DonorRequest>> getAllDonor() {
		List<DonorRequest> donor = donorService.getAllDonor();
		return new ResponseEntity<>(donor, HttpStatus.OK);
	}

	@PutMapping("/donor/{id}")

	public ResponseEntity<DonorRequest> updateDonor(@PathVariable int id,
			@RequestBody() @Valid DonorRequest donorRequest) {
		donorRequest.setId(id);

		DonorRequest updatedDonor = donorService.updateDonor(donorRequest);
		return new ResponseEntity<>(updatedDonor, HttpStatus.OK);
	}

	@DeleteMapping("/donor/{id}")
	public ResponseEntity<String> deleteDonor(@PathVariable int id) {
		donorService.deleteDonor(id);
		return new ResponseEntity<>("Donor successfully deleted!", HttpStatus.OK);
	}

}
