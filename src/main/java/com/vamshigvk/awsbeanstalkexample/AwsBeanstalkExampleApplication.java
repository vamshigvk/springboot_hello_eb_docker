package com.vamshigvk.awsbeanstalkexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class AwsBeanstalkExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsBeanstalkExampleApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value="name",defaultValue="Vamshi") String name){
		return String.format("Hello %s!! welcome to the HomePage",name);
	}

}
