package com.example.ForumServer;

import com.example.ForumServer.user.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class ForumServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForumServerApplication.class, args);
	}


}
