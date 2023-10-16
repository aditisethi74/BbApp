package net.Bloodbank.BbApp.controller;

import java.util.List;

//import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.Bloodbank.BbApp.dto.DonorRequest;
//import net.Bloodbank.BbApp.exception.ResourceNotFoundException;
import net.Bloodbank.BbApp.model.Donor;
import net.Bloodbank.BbApp.repository.DonorRepository;
import net.Bloodbank.BbApp.service.DonorService;
//import net.Bloodbank.BbApp.service.DonorService;

@RestController

public class DonorControllor {
	@Autowired
	private DonorService donorService;
	// @Autowired private DonorRequest donorRequest;
	
	// @GetMapping("/donor")
	/*
	 * public List<Donor> getAllDonor() { 
	 * List<Donor> donors=donorService.findAll();
	 * entityToDto(donors).findAll();
	 */
	
	  public List<DonorRequest> getAllDonor() {
	   List<Donor>donors=donorService.findAll();
	   List<DonorRequest> dtos=donorService.entityToDto(donors);
	   return dtos; 
	   }
	 
	@GetMapping("/donor/{id}")
	public ResponseEntity<DonorRequest> getDonorId(@PathVariable int id) {

		Donor donor = donorService.findById(id);
		DonorRequest dto = donorService.entityToDto(donor);
		return ResponseEntity.ok(dto);
	}

	@PostMapping("/donor")
	public DonorRequest createDonor(@RequestBody DonorRequest donorRequest) {
		Donor donor = donorService.dtoToEntity(donorRequest);
		donorService.save(donor);
		return donorService.entityToDto(donor);
	}

	/*
	 * @PostMapping("/donor") public Donor createDonor(@RequestBody Donor donor) {
	 * return donorService.save(donor); }
	 */

	/*
	 * @GetMapping("/donor/{id}") public ResponseEntity<Donor>
	 * getDonorId(@PathVariable int id) { Donor donor = donorService.findById(id);
	 * return ResponseEntity.ok(donor);
	 * 
	 * }
	 */

	/*@PutMapping("/donor{id}")
	public ResponseEntity<Donor> updateDonor(@PathVariable int id, @RequestBody Donor donorDetails) {
		Donor updateDonor = donorService.findById(id);
		updateDonor.setAddress(donorDetails.getAddress());
		updateDonor.setAge(donorDetails.getAge());
		updateDonor.setContactNumber(donorDetails.getContactNumber());
		donorService.save(updateDonor);
		return ResponseEntity.ok(updateDonor);*/
	//}

	/*@DeleteMapping("/donor/{id}")
	public ResponseEntity<HttpStatus> deleteDonor(@PathVariable int id) {
		// Donor donor =donorService.findById(id);
		donorService.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}*/


@DeleteMapping("/donor/{id}")
public ResponseEntity<HttpStatus> deleteDonor(@PathVariable int id) {
	// Donor donor =donorService.findById(id);
	donorService.deleteById(id);
	return new ResponseEntity<>(HttpStatus.NO_CONTENT);

}
}

/*@PutMapping("/donor{id}")
public ResponseEntity<DonorRequest> updateDonor(@PathVariable int id, @RequestBody DonorRequest donorRequestDetails) {
	Donor updateDonor = donorService.findById(id);
	updateDonor.setAddress(donorDetails.getAddress());
	updateDonor.setAge(donorDetails.getAge());
	updateDonor.setContactNumber(donorDetails.getContactNumber());
	donorService.save(updateDonor);
	return ResponseEntity.ok(updateDonor);*/
//}
