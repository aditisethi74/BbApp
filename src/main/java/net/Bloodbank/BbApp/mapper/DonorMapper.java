package net.Bloodbank.BbApp.mapper;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.Bloodbank.BbApp.dto.DonorDto;
import net.Bloodbank.BbApp.model.Donor;

@AllArgsConstructor
@NoArgsConstructor
public class DonorMapper {
	private String bloodGroup;

// private String gender;
	public static DonorDto mapToDonorDto(Donor donor) {
		DonorDto donorDto = new DonorDto();
		donorDto.setId(donor.getId());
		donorDto.setFirstName(donor.getFirstName());
		donorDto.setLastName(donor.getLastName());
		donorDto.setEMail(donor.getEMail());
		donorDto.setAddress(donor.getAddress());
		donorDto.setAge(donor.getAge());
		donorDto.setBloodGroupType(donor.getBloodGroupType());
		donorDto.setCity(donor.getCity());
		donorDto.setContactNumber(donor.getContactNumber());
		donorDto.setGender(donor.getGender());
		return donorDto;
	}

	public static Donor mapToDonor(DonorDto donorDto) {
		Donor donor = new Donor();
		donor.setId(donorDto.getId());
		donor.setFirstName(donorDto.getFirstName());
		donor.setLastName(donorDto.getLastName());
		donor.setEMail(donorDto.getEMail());
		donor.setAddress(donorDto.getAddress());
		donor.setAge(donorDto.getAge());
		donor.setBloodGroupType(donorDto.getBloodGroupType());
		donor.setCity(donorDto.getCity());
		donor.setGender(donorDto.getGender());
		donor.setContactNumber(donorDto.getContactNumber());
		return donor;

	}
}
