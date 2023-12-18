package net.Bloodbank.BbApp.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import net.Bloodbank.BbApp.dto.DonorDto;
import net.Bloodbank.BbApp.model.Donor;
import net.Bloodbank.BbApp.repository.DonorRepository;


/*	//@ExtendWith(MockitoExtension.class)
	public class DonorServiceTest {

	    @Mock
	    private DonorRepository donorRepository;

/*	   @InjectMocks
	    private DonorServiceImpl donorServiceImpl;

	    @BeforeEach
	    public void setup(){
	        //employeeRepository = Mockito.mock(EmployeeRepository.class);
	        //employeeService = new EmployeeServiceImpl(employeeRepository);
	    	
	    	
	    	
	     /*  donor = Donor.builder()
	                .id(1)
	                .firstName("Ramesh")
	                .lastName("kumar")
	                .email("ramesh@gmail.com")
	                .contactNo("3456219823")
	                .city("chd")
	                .address("234/21")
	                .gender("Male")
	                .bloodGroup("O_pos")
	                .age(45)
	                .build();
	
}
	    // JUnit test for saveDonor method
	    @DisplayName("JUnit test for saveDonor method")
	    @Test
	    public void givenDonorObject_whenSaveDonor_thenReturnDonorObject(){
	        // given - precondition or setup
	        DonorDto donor;
			given(donorRepository.findById(donor.getId()))
	                .willReturn(Optional.empty());

	        given(DonorRepository.save(donor)).willReturn(donor);

	        System.out.println(DonorRepository);
	        System.out.println(DonorService);

	        // when -  action or the behaviour that we are going test
	        DonorDto savedDonor = donorService.saveDonor(donorDto);

	        System.out.println(savedDonor);
	        // then - verify the output
	        assertThat(savedDonor).isNotNull();
	    }     
	     // JUnit test for saveEmployee method
	        @DisplayName("JUnit test for saveEmployee method which throws exception")
	        @Test
	        public void givenExistingEmail_whenSaveEmployee_thenThrowsException(){
	            // given - precondition or setup
	            given(donorRepository.findById(donor.getId()))
	                    .willReturn(Optional.of(donor));

	            System.out.println(donorRepository);
	            System.out.println(donorService);

	            // when -  action or the behaviour that we are going test
	            org.junit.jupiter.api.Assertions.assertThrows(DonorNotFoundException.class, () -> {
	                donorService.saveDonor(donor);
	            });

	            // then
	            verify(donorRepository, never()).save(any(Donor.class));
	        }   
	        
	        // JUnit test for getAllEmployees method
	        @DisplayName("JUnit test for getAllEmployees method")
	        @Test
	        public void givenEmployeesList_whenGetAllEmployees_thenReturnEmployeesList(){
	            // given - precondition or setup

	            Donor donor1 = donor.builder()
	                    .id(2L)
	                    .firstName("Tony")
	                    .lastName("Stark")
	                    .email("tony@gmail.com")
	                    .build();

	            given(donorRepository.findAll()).willReturn(List.of(donors,donor1));

	            // when -  action or the behaviour that we are going test
	            List<Donor> donorList = donorService.getAllDonor();

	            // then - verify the output
	            assertThat(donorList).isNotNull();
	            assertThat(donorList.size()).isEqualTo(2);
	        }

	     // JUnit test for getAllEmployees method
	        @DisplayName("JUnit test for getAllEmployees method (negative scenario)")
	        @Test
	        public void givenEmptyEmployeesList_whenGetAllEmployees_thenReturnEmptyEmployeesList(){
	            // given - precondition or setup

	            Employee employee1 = Employee.builder()
	                    .id(2L)
	                    .firstName("Tony")
	                    .lastName("Stark")
	                    .email("tony@gmail.com")
	                    .build();

	            given(employeeRepository.findAll()).willReturn(Collections.emptyList());

	            // when -  action or the behaviour that we are going test
	            List<Employee> employeeList = employeeService.getAllEmployees();

	            // then - verify the output
	            assertThat(employeeList).isEmpty();
	            assertThat(employeeList.size()).isEqualTo(0);
	        }

	        // JUnit test for getDonorById method
	        @DisplayName("JUnit test for getDonorById method")
	        @Test
	        public void givenDonorId_whenGetDonorById_thenReturnDonorObject(){
	            // given
	            given(donorRepository.findById(1)).willReturn(Optional.of(donor));

	            // when
	            Donor savedDonor = donorService.getDonorById(donor.getId()).get();

	            // then
	            assertThat(savedDonor).isNotNull();

	        }

	        // JUnit test for updateEmployee method
	        @DisplayName("JUnit test for updateDonor method")
	        @Test
	        public void givenDonorObject_whenUpdateDonor_thenReturnUpdatedDonor(){
	            // given - precondition or setup
	            given(donorRepository.save(donor)).willReturn(donor);
	            donor.setAge(45);
	            donor.setContactNo("4537890222");
	            donor.setAddress("235/23")
	            // when -  action or the behaviour that we are going test
	            Donor updatedDonor = donorService.updateDonor(donor);

	            // then - verify the output
	            assertThat(updatedDonor.getAge()).isEqualTo(45);
	            assertThat(updatedDonor.getContactNo("4537890222")).isEqualTo("4537890222");
	            assertThat(updateDonor.getAddress("235/23")).isEqualTo("235/23");
	        }

	        // JUnit test for deleteEmployee method
	        @DisplayName("JUnit test for deleteDonor method")
	        @Test
	        public void givenDonorId_whenDeleteDonor_thenNothing(){
	            // given - precondition or setup
	            int donorId = 1;

	            willDoNothing().given(donorRepository).deleteById(donorId);

	            // when -  action or the behaviour that we are going test
	            donorService.deleteDonor(donorId);

	            // then - verify the output
	            verify(donorRepository, times(1)).deleteById(donorId);
	        }
	    }*/
	    

	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	    
