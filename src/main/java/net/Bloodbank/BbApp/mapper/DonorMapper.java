package net.Bloodbank.BbApp.mapper;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.Bloodbank.BbApp.dto.DonorRequest;
import net.Bloodbank.BbApp.model.Donor;
@AllArgsConstructor
@NoArgsConstructor
public class DonorMapper {
	
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private String eMail;
	private String address;
	private String city;
	private String contactNumber;
	private String bloodGroup;
	private String gender;
	 public static DonorRequest mapToDonorRequest(Donor donor){
     DonorRequest donorRequest = new DonorRequest();
	donorRequest.setId(donor.getId());
	donorRequest.setFirstName(donor.getFirstName());
	donorRequest.setLastName(donor.getLastName());
	donorRequest.setEMail(donor.getEMail());
	donorRequest.setAddress(donor.getAddress());
	donorRequest.setAge(donor.getAge());
	donorRequest.setBloodGroupType(donor.getBloodGroupType());
	donorRequest.setCity(donor.getCity());
	donorRequest.setContactNumber(donor.getContactNumber());
	donorRequest.setGenderType(donor.getGenderType());
	                 return donorRequest;
	 }
	 
	 public static Donor mapToDonor(DonorRequest donorRequest){
	        Donor donor = new Donor();
	 donor.setId(donorRequest.getId());
	 donor.setFirstName(donorRequest.getFirstName());
	 donor.setLastName(donorRequest.getLastName());
	 donor.setEMail(donorRequest.getEMail());
	 donor.setAddress(donorRequest.getAddress());
	 donor.setAge(donorRequest.getAge());
	 donor.setBloodGroupType(donorRequest.getBloodGroupType());
     donor.setCity(donorRequest.getCity());
     donor.setGenderType(donorRequest.getGenderType()); 
     donor.setContactNumber(donorRequest.getContactNumber());	
     return donor;
	 
	 }
}
