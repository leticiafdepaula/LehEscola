package br.com.lehescola.aws_project01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

@SpringBootApplication(exclude= {UserDetailsServiceAutoConfiguration.class})
public class AwsProject01Application {

	public static void main(String[] args) {
		SpringApplication.run(AwsProject01Application.class, args);
	}

}
