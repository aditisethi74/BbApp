package net.Bloodbank.BbApp.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
@Setter
@Getter
@Entity
@Table(name = "donor")
public class Donor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	//@Column(name = "gender")
	//private String gender;
	@Column(name = "age")
	private int age;
	//@Column(name = "blood_group")
	//private String bloodGroup;
	@Column(name = "e_mail")
	private String eMail;
	@Column(name = "contact_number")
	private String contactNumber;
	@Column(name = "city")
	private String city;
	@Column(name = "address")
	private String address;
	
	 @Enumerated(EnumType.STRING)
	//private  GenderType genderType;
	 private GenderType gender;
	 
	@Enumerated(EnumType.STRING)
	private  BloodGroupType bloodGroupType;
	
		
	

}
