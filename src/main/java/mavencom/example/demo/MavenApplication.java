package mavencom.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;

@SpringBootApplication
public class MavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenApplication.class, args);

		String text = "";

		boolean isEmpty = StringUtils.isEmpty(text);
		System.out.println("Is text empty?" + isEmpty);
	}
}
