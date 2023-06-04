package feb.java.serverapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* @SpringBootApplication équivalent à :
 *   @Configuration 
 *   @EnableAutoConfiguration
 *   @ComponentScan
 *
 */
@SpringBootApplication
public class DemoOpenapiGenerator {

	public static void main(String[] args) {
		SpringApplication.run(DemoOpenapiGenerator.class, args);
	}

}
