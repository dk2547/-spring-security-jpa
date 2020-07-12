package com.sam.springsecurityjpa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

	@GetMapping("/")
	public String home() {
		return "<h1>Welcome</h1><br><a href='/user'>user</a><br><a href='/admin'>admin</a>";
	}

	@GetMapping("/user")
	public String user() {
		return "<h1>Welcome User</h1><br><a href='/logout'>logout</a><br><a href='http://localhost:8080/'>home</a>";
	}

	@GetMapping("/admin")
	public String admin() {
		return "<h1>Welcome Admin</h1><br><a href='/logout'>logout</a><br><a href='http://localhost:8080/'>home</a>";
	}
}
