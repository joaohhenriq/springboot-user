package br.com.user.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.user.models.User;
import br.com.user.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository ur;
	
	
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<User> fetch() {
		Iterable<User> userList = ur.findAll();
		return userList;
	}
	
	@PostMapping()
	public User register(@RequestBody @Validated User user) {
		return ur.save(user);
	}
	
	@DeleteMapping()
	public User delete(@RequestBody User user) {
		ur.delete(user);
		return user;
	}
	
}
