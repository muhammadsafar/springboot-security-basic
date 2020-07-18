package com.baharuddinfamily.learn.springbootsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainResources {

	@GetMapping("/")
	public String hallo() {
		return ("<h3>Welcome </h3>");
	}

	@GetMapping("/user")
	public String user() {
		return ("<h3>Welcome USER</h3>");
	}

	@GetMapping("/admin")
	public String admin() {
		return ("<h3>Welcome ADMIN</h3>");
	}

}
