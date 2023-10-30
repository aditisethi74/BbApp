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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;
import net.Bloodbank.BbApp.dto.DonorDto;
import net.Bloodbank.BbApp.model.BloodGroup;
import net.Bloodbank.BbApp.service.DonorService;

@RestController
public class DonorControllor {
	@Autowired
	private DonorService donorService;

	@PostMapping("/donor")
	public ResponseEntity<DonorDto> createUser(@RequestBody @Valid DonorDto donorDto) {
		return new ResponseEntity<>(donorService.createDonor(donorDto), HttpStatus.CREATED);
	}

	@GetMapping("/donor/{id}")
	public ResponseEntity<DonorDto> getDonorById(@PathVariable int id) {
		DonorDto donorDto = donorService.getDonorById(id);
		return new ResponseEntity<>(donorDto, HttpStatus.OK);
	}
	@GetMapping("/donor")
	public ResponseEntity<List<DonorDto>> getAllDonor(@RequestParam(required = false) BloodGroup bloodGroupType) {
		List<DonorDto> donor = null;
		if (bloodGroupType == null)
			donor = donorService.getAllDonor();
		else
			donor = donorService.findDonorByBloodGroupType(bloodGroupType);
		return new ResponseEntity<>(donor, HttpStatus.OK);
	}

	@PutMapping("/donor/{id}")

	public ResponseEntity<DonorDto> updateDonor(@PathVariable int id, @RequestBody() @Valid DonorDto donorDto) {
		donorDto.setId(id);

		DonorDto updatedDonor = donorService.updateDonor(donorDto);
		return new ResponseEntity<>(updatedDonor, HttpStatus.OK);
	}

	@DeleteMapping("/donor/{id}")
	public ResponseEntity<String> deleteDonor(@PathVariable int id) {
		donorService.deleteDonor(id);
		return new ResponseEntity<>("Donor successfully deleted!", HttpStatus.OK);
	}
}
