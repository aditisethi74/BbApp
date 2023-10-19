package net.Bloodbank.BbApp.dto;

import java.io.Serializable;
import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
import lombok.ToString;
import net.Bloodbank.BbApp.model.BloodGroupType;

import net.Bloodbank.BbApp.model.GenderType;
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DonorRequest {

	

	private int id;
	@NotNull(message = "Pls. Enter your name")
	private String firstName;
	private String lastName;

	/*@NotNull(message = "Enter among MALE,FEMALE,OTHERS")
	 public enum Gender implements Serializable{
		MALE, FEMALE, OTHERS
		
	}
private  String type;
	private void setGender(String type) {
	this.type=type;
	}
	 String getGender() {
		return this.type;
	}*/
	 // public  enum GenderType{Male,Female,Others};
	 @Enumerated(EnumType.STRING)
	private  GenderType genderType;
	 
	 
	 
	 
	 
	 
	/*  public ArrayList<String> genderIteration() {
	       GenderType[] genderType = GenderType.values();
	       ArrayList<String> stringGender = new ArrayList<String>();
	       for (GenderType gender : genderType) {
	           stringGender.add(gender.toString());
	       }
	       return stringGender;
	   }*/
	
	

	 
	 
	 @NotNull(message="is Required")
	//private enum  GroupType{A_pos,B_pos,O_pos,AB_pos,A_neg,B_neg,O_neg,AB_neg;};
	@Enumerated(EnumType.STRING)
	//private String bloodGroup;
	private BloodGroupType bloodGroupType;
	
	
	
	

	/*@NotNull(message="Please Enter Valid BloodGroup Type")
	public  enum BloodGroup {
		//O_POS("O+"), O_NEG("O-"), A_POS("A+"), A_NEG("A-"), B_POS("B+"), B_NEG("B-"), AB_POS("AB+"), AB_NEG("AB-");
	};	
	     private final String group;
	  
	     private void setBloodGroup(String group) {
	    	 this.group = group; 
	     }
	     public static BloodGroup getBloodGroup(  String group  ) {
	 		for (BloodGroup bloodGrp : BloodGroup.values()) {
	 			
	 				return bloodGrp;
	 			}
	    
	    }*/
	  
	     
	 
	@Min(value = 18, message = "must be a greater than or equal to 18")
	@Max(value = 60, message = "must be less than or equal to 60")
	private int age;
	@NotEmpty(message = "Email cannot be empty")
	@Email(regexp = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
	        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$", message = "Email is not valid")
	private String eMail;
	private String address;
	private String city;

	@NotNull
	@Pattern(regexp = "^\\d{10}$", message = "Invalid mobile number entered")
	private String contactNumber;

}
