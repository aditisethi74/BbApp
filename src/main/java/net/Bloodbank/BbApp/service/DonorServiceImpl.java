package net.Bloodbank.BbApp.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.Bloodbank.BbApp.dto.DonorRequest;
import net.Bloodbank.BbApp.mapper.DonorMapper;
//import lombok.RequiredArgsConstructor;
import net.Bloodbank.BbApp.model.Donor;
import net.Bloodbank.BbApp.repository.DonorRepository;

@Service




public class DonorServiceImpl implements DonorService {
	@Autowired private DonorRepository donorRepository;


	public DonorServiceImpl(DonorRepository donorRepository) {
		super();
		this.donorRepository = donorRepository;
	}



	
	
///------>Methods Implemented Using DTO <-------------------
	
	@Override
	public DonorRequest createDonor(DonorRequest donorRequest) {
		 // Convert DonorRequest into Donor JPA Entity
        Donor donor = DonorMapper.mapToDonor(donorRequest);

        Donor savedDonor = donorRepository.save(donor);

        // Convert Donor JPA entity to DonorRequest
        DonorRequest savedDonorRequest = DonorMapper.mapToDonorRequest(savedDonor);

        return savedDonorRequest;
    }
		
	@Override
    public DonorRequest getDonorById(int id) {
        Optional<Donor> optionalDonor = donorRepository.findById(id);
        Donor donor = optionalDonor.get();
        
        return DonorMapper.mapToDonorRequest(donor);
    }	
		
	  @Override
	    public List<DonorRequest> getAllDonor() {
	        List<Donor> donor = donorRepository.findAll();
	        return donor.stream().map(DonorMapper::mapToDonorRequest)
	                .collect(Collectors.toList());
	    }
	
	  @Override
	    public DonorRequest updateDonor(DonorRequest donorRequest) {
	        Donor existingDonor = donorRepository.findById(donorRequest.getId()).get();
	        existingDonor.setAddress(donorRequest.getAddress());
	        existingDonor.setAge(donorRequest.getAge());
	        existingDonor.setContactNumber(donorRequest.getContactNumber());
	        
	        Donor updatedDonor = donorRepository.save(existingDonor);
	        return DonorMapper.mapToDonorRequest(updatedDonor);
	  }
	
	
	  @Override
	    public void deleteDonor(int id ) {
	        donorRepository.deleteById(id);
	    }
	
		  
		  
		  
		  
	  }
	
	

	

