package net.Bloodbank.BbApp.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
//import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DonorRequest {

	private int id;
	@NotNull(message = "is  REQUIRED")
	private String firstName;
	private String lastName;

	@NotNull(message = "Enter among MALE,FEMALE,OTHERS")
	 enum gender {
		MALE, FEMALE, OTHERS
	};
	

	@NotNull(message="Please Enter Valid BloodGroup Type")
	 enum bloodGroup{Apos,Aneg,Bpos,Bneg,ABpos,ABneg,Opos,Oneg};

	@Min(value = 18, message = "must be a greater than or equal to 18")
	@Max(value = 60, message = "must be less than or equal to 60")
	private int age;
	@NotEmpty(message = "Email cannot be empty")
	@Email(regexp = "^[a-zA-Z0-9_! #$%&'*+/=?`{|}~^. -]+@[a-zA-Z0-9. -]+$", message = "Email is not valid")
	private String eMail;
	private String address;
	private String city;

	@NotNull
	@Pattern(regexp = "^\\d{10}$", message = "Invalid mobile number entered")
	private String contactNumber;

}
