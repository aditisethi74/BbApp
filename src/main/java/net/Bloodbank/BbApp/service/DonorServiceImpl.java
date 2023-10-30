package net.Bloodbank.BbApp.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.Bloodbank.BbApp.dto.DonorDto;
import net.Bloodbank.BbApp.mapper.DonorMapper;
import net.Bloodbank.BbApp.model.BloodGroup;
import net.Bloodbank.BbApp.model.Donor;
import net.Bloodbank.BbApp.repository.DonorRepository;

@Service
public class DonorServiceImpl implements DonorService {
	@Autowired
	private DonorRepository donorRepository;

	public DonorServiceImpl(DonorRepository donorRepository) {
		super();
		this.donorRepository = donorRepository;
	}

	@Override

	public DonorDto createDonor(DonorDto donorDto) {
		Donor donor = DonorMapper.mapToDonor(donorDto);
		Donor savedDonor = donorRepository.save(donor);
		DonorDto savedDonorDto = DonorMapper.mapToDonorDto(savedDonor);
		return savedDonorDto;
	}

	@Override
	public DonorDto getDonorById(int id) {
		Optional<Donor> optionalDonor = donorRepository.findById(id);
		Donor donor = optionalDonor.get();
		return DonorMapper.mapToDonorDto(donor);
	}

	@Override
	public List<DonorDto> getAllDonor() {
		List<Donor> donor = donorRepository.findAll();
		return donor.stream().map(DonorMapper::mapToDonorDto).collect(Collectors.toList());
	}

	@Override
	public DonorDto updateDonor(DonorDto donorDto) {
		Donor existingDonor = donorRepository.findById(donorDto.getId()).get();
		existingDonor.setAddress(donorDto.getAddress());
		existingDonor.setAge(donorDto.getAge());
		existingDonor.setContactNumber(donorDto.getContactNumber());
		Donor updatedDonor = donorRepository.save(existingDonor);
		return DonorMapper.mapToDonorDto(updatedDonor);
	}

	@Override
	public void deleteDonor(int id) {
		donorRepository.deleteById(id);
	}

	public List<DonorDto> findDonorByBloodGroupType(BloodGroup bloodGroupType) {
		List<Donor> donor = donorRepository.findDonorByBloodGroupType(bloodGroupType);
		return donor.stream().map(DonorMapper::mapToDonorDto).collect(Collectors.toList());

	}
}
