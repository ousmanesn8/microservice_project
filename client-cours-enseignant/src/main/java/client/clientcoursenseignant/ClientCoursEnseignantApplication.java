package client.clientcoursenseignant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("client.clientcoursenseignant")
public class ClientCoursEnseignantApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientCoursEnseignantApplication.class, args);
	}

}
