package net.Bloodbank.BbApp.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
//import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import net.Bloodbank.BbApp.model.BloodGroup;

import net.Bloodbank.BbApp.model.Gender;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DonorDto {
	private int id;

	@NotNull(message = "Invalid Name: Name cannot be  NULL; enter valid name")
	@Size(min = 3, max = 30, message = "Invalid FirstName: Must be of 3 - 30 characters")
	private String firstName;
	private String lastName;
	@NotNull(message = "Invalid gender field:  Choose among MALE,FEMALE,OTHERS")
	@Enumerated(EnumType.STRING)
	private Gender gender;
	@Enumerated(EnumType.STRING)
	private BloodGroup bloodGroupType;
	@Min(value = 18, message = "Invalid Age: It must be a greater than or equal to 18")
	@Max(value = 60, message = "Invalid Age: It must be less than or equal to 60")
	private int age;
	@Email(message = "Invalid email format")
	private String eMail;
	private String address;
	private String city;
	@NotBlank(message = "Invalid Phone number: Empty number")
	@NotNull(message = "Invalid Phone number: Number is NULL")
	@Pattern(regexp = "^\\d{10}$", message = "Invalid phone number")
	private String contactNumber;
}
