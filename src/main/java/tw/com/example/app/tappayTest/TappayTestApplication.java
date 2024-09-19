package tw.com.example.app.tappayTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class TappayTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TappayTestApplication.class, args);
	}

}
