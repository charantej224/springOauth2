package com.charan.springauthserver;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/users")
public class ResourceController {
	
	@GetMapping("/getUser")
	public User getUser(){
		return new User(100L,"Charan","My Adress");
		
	}
	
	@RequestMapping("/principal")
	  public Principal user(Principal principal) {
	    return principal;
	  }

}
