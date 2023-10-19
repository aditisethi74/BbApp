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
	
	 public static DonorRequest mapToDonorRequest(Donor donor){
	        DonorRequest donorRequest = new DonorRequest();
	donorRequest.setId(donor.getId());
	donorRequest.setFirstName(donor.getFirstName());
	donorRequest.setLastName(donor.getLastName());
	donorRequest.setEMail(donor.getEMail());
	donorRequest.setAddress(donor.getAddress());
	donorRequest.setAge(donor.getAge());
	//donorRequest.setBloodGroup(donor.getBloodGroup());
	donorRequest.setCity(donor.getCity());
	donorRequest.setContactNumber(donor.getContactNumber());
	//donorRequest.setGender(donor.getGender());
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
	// donor.setBloodGroup(donorRequest.getBloodGroup());
     donor.setCity(donorRequest.getCity());
     //donor.setGender(donorRequest.getGender()); 
     donor.setContactNumber(donorRequest.getContactNumber());	
     return donor;
	 
	 }
}
