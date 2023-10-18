package net.Bloodbank.BbApp.service;
import net.Bloodbank.BbApp.dto.DonorRequest;
import net.Bloodbank.BbApp.model.*;
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
 DonorRequest createDonor(DonorRequest donorRequest);

 DonorRequest getDonorById(int id);

 List<DonorRequest> getAllDonor();

 DonorRequest updateDonor(DonorRequest donor);

 void deleteDonor(int id);
}



