package net.Bloodbank.BbApp;
//import net.Bloodbank.BbApp.dto.DonorRequest; 


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BbAppApplication  {
	@Bean
@Autowired	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	

	public static void main(String[] args) {
		SpringApplication.run(BbAppApplication.class, args);
		
		
		
		
		
	}

	

}