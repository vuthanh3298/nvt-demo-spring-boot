package com.nvt.api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.nvt.model.User;

@RestController
public class LoginApi {
	@PostMapping("/api/check-login")
	public String checkLogin(@RequestBody User user) {
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		if(user.getUsername().equals("thanh") && user.getPassword().equals("1234")) {
			System.out.println("ok");
			return "ok";
		}
		return "err";
	}
}
