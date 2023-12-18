package net.Bloodbank.BbApp.service;
import net.Bloodbank.BbApp.dto.DonorDto;
import net.Bloodbank.BbApp.model.BloodGroup;
import java.util.List;
public interface DonorService {
List<DonorDto> findDonorByBloodGroupType(BloodGroup bloodGroupType);
DonorDto createDonor(DonorDto donorDto);
DonorDto getDonorById(int id);
List<DonorDto> getAllDonor();
DonorDto updateDonor(DonorDto donor , int id);
void deleteDonor(int id);

   
 
 


 
}



