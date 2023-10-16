package net.Bloodbank.BbApp.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.Bloodbank.BbApp.dto.DonorRequest;
//import lombok.RequiredArgsConstructor;
import net.Bloodbank.BbApp.model.Donor;
import net.Bloodbank.BbApp.repository.DonorRepository;

@Service




public class DonorServiceImpl implements DonorService {
	@Autowired private DonorRepository donorRepository;
    @Autowired private ModelMapper modelMapper;	
    //@Autowired private DonorRequest donorRequest;
	public DonorServiceImpl(DonorRepository donorRepository) {
		super();
		this.donorRepository = donorRepository;
	}
	public Donor dtoToEntity(DonorRequest donorRequest ) {
	Donor donor=this.modelMapper.map(donorRequest, Donor.class);
	return donor;
	}
	public DonorRequest entityToDto(Donor donor ) {
		DonorRequest dto=this.modelMapper.map(donor, DonorRequest.class);
		return dto;
		}
	
	
	@Override
	public List<Donor> findAll() {

		return donorRepository.findAll();
	}

	@Override
	public Donor findById(int id) {
		Optional<Donor> result = donorRepository.findById(id);
		Donor donor = null;
		if (result.isPresent()) {
			donor = result.get();
			
		}
		// else {
		// throw new runtimeException("the id not found-"+theId);
		// }
		return donor;
	}

	@Override
	public Donor save(Donor donor) {

		Donor dbUser = donorRepository.save(donor);
		return dbUser;
	}

	@Override
	public void deleteById(int id) {
		donorRepository.deleteById(id);

	}

	
}
