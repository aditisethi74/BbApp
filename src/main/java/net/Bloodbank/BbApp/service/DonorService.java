package net.Bloodbank.BbApp.service;
import net.Bloodbank.BbApp.dto.DonorRequest;
import net.Bloodbank.BbApp.model.Donor;

import java.util.List;



public interface DonorService {
//Donor createDonor(Donor donor);
//List<Donor> getAllDonor();
//Donor getDonorById(int id);
//Donor updateDonor(Donor donor);
//void deleteDonorById(int id);
// Donor dtoToEntity(DonorRequest donorRequest);  
// DonorRequest entityToDto(Donor donor );
///list of methods using dto
//list of all A_positive donors();
	//List<Donor>  getA_positiveDonor();
	//List<Donor>  getA_negativeDonor();
	//List<Donor>  getB_positiveDonor();
	//List<Donor>  getB_negativeDonor();
	//List<Donor>  getAB_positiveDonor();
	//List<Donor>  getAB_negativeDonor();
	//List<Donor>  getO_positiveDonor();
	//List<Donor>  getO_negativeDonor();
	
	
 DonorRequest createDonor(DonorRequest donorRequest);

 DonorRequest getDonorById(int id);

 List<DonorRequest> getAllDonor();

 DonorRequest updateDonor(DonorRequest donor);

 void deleteDonor(int id);
 
   
 
 
 
}



