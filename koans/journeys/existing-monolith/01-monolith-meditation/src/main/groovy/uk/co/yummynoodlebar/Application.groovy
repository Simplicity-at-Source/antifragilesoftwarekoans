package uk.co.yummynoodlebar

import org.springframework.boot.SpringApplication
import uk.co.yummynoodlebar.configuration.ApplicationConfiguration

class Application {
	static void main(String[] args) throws Exception {
	    SpringApplication.run(ApplicationConfiguration, args);
	  }
}