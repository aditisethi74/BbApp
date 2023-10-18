package net.Bloodbank.BbApp.controller;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


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
	
	
	// @GetMapping("/donor")
	/*
	 * public List<Donor> getAllDonor() { 
	 * List<Donor> donors=donorService.findAll();
	 * entityToDto(donors).findAll();
	 */
	
	 /* public List<DonorRequest> getAllDonor() {
	   List<Donor>donors=donorService.findAll();
	   for(Donor donor:donors) {
	   DonorRequest dtos=donorService.entityToDto(donor);
	   }
	  //List<DonorRequest>dtoList=new ArrayList<>();
	
	   return   dtos; }
	   
	 
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
	}*/

	/*
	  @PostMapping("/donor") 
	  public ResponseEntity<Donor> createDonor(@RequestBody Donor donor) {
	  Donor donorCreated=donorService.createDonor(donor);
	  return new ResponseEntity<>(donorCreated,HttpStatus.CREATED); 
	  }

	
	  @GetMapping("/donor/{id}") 
	  public ResponseEntity<Donor>getDonorById(@PathVariable int id) {
	   Donor donor = donorService.getDonorById(id);
	  return new ResponseEntity<>(donor,HttpStatus.OK);
	  
	  }
	
	  /*@GetMapping("/donor")
	    public ResponseEntity<List<Donor>> getAllDonor(){
	        List<Donor> donor = donorService.getAllDonor();
	        return new ResponseEntity<>(donor, HttpStatus.OK);
	    }/*
	  
	  @PutMapping("{id}")
	    
	    public ResponseEntity<Donor> updateDonor(@PathVariable int id, @RequestBody Donor donor){
	        donor.setId(id);
	        Donor updatedDonor = donorService.updateDonor(donor);
	        return new ResponseEntity<>(updatedDonor, HttpStatus.OK);
	    }
	  
	  @DeleteMapping("{id}")
	    public ResponseEntity<String> deleteDonor(@PathVariable int id){
	        donorService.deleteDonorById(id);
	        return new ResponseEntity<>("Donor successfully deleted!", HttpStatus.OK);
	  } */
	  
	// Api using dto
	  
	  @PostMapping("/donor")
	    public ResponseEntity<DonorRequest> createUser(@RequestBody DonorRequest donorRequest){
	        DonorRequest savedDonor = donorService.createDonor(donorRequest);
	        return new ResponseEntity<>(savedDonor, HttpStatus.CREATED);
	    }
	  
	  @GetMapping("{id}")
	    public ResponseEntity<DonorRequest> getUserById(@PathVariable int id){
	     DonorRequest   donor = donorService.getDonorById(id);
	        return new ResponseEntity<>(donor, HttpStatus.OK);
	  }
	  
	  @GetMapping("/donor")
	    public ResponseEntity<List<DonorRequest>> getAllDonor(){
	        List<DonorRequest> donor = donorService.getAllDonor();
	        return new ResponseEntity<>(donor, HttpStatus.OK);
	  }
	
	  @PutMapping("{id}")
	    
	    public ResponseEntity<DonorRequest> updateDonor(@PathVariable int id ,
	                                           @RequestBody DonorRequest donorRequest){
	        donorRequest.setId(id);
	        DonorRequest updatedDonor = donorService.updateDonor(donorRequest);
	        return new ResponseEntity<>(updatedDonor, HttpStatus.OK);
	  }
	
	  @DeleteMapping("{id}")
	    public ResponseEntity<String> deleteUser(@PathVariable int id){
	        donorService.deleteDonor(id);
	        return new ResponseEntity<>("User successfully deleted!", HttpStatus.OK);
	    }
	  
	  
	  
	  
	  
	  
	  
	  
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


//@DeleteMapping("/donor/{id}")
//public ResponseEntity<HttpStatus> deleteDonor(@PathVariable int id) {
	// Donor donor =donorService.findById(id);
	//donorService.deleteById(id);
	//return new ResponseEntity<>(HttpStatus.NO_CONTENT);

}
///}

/*@PutMapping("/donor{id}")
public ResponseEntity<DonorRequest> updateDonor(@PathVariable int id, @RequestBody DonorRequest donorRequestDetails) {
	Donor updateDonor = donorService.findById(id);
	updateDonor.setAddress(donorDetails.getAddress());
	updateDonor.setAge(donorDetails.getAge());
	updateDonor.setContactNumber(donorDetails.getContactNumber());
	donorService.save(updateDonor);
	return ResponseEntity.ok(updateDonor);*/
//}
