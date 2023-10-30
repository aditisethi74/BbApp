package net.Bloodbank.BbApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BbAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(BbAppApplication.class, args);

	}
}
