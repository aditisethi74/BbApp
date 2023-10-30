package net.Bloodbank.BbApp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import net.Bloodbank.BbApp.model.BloodGroup;
import net.Bloodbank.BbApp.model.Donor;

public interface DonorRepository extends JpaRepository<Donor, Integer> {
	List<Donor> findDonorByBloodGroupType(BloodGroup bloodGroupType);
}
