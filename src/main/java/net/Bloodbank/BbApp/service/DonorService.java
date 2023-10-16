package net.Bloodbank.BbApp.service;
import net.Bloodbank.BbApp.dto.DonorRequest;
import net.Bloodbank.BbApp.model.*;
import java.util.List;



public interface DonorService {

List<Donor> findAll();
Donor findById(int id);
Donor save(Donor donor);
void deleteById(int id);
 Donor dtoToEntity(DonorRequest donorRequest);  
 DonorRequest entityToDto(Donor donor );




}