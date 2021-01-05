package com.example.jsondbpractice.ServicesImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jsondbpractice.model.User;
import com.example.jsondbpractice.repositry.UserRepositry;
@Service
public class UserServices {
	@Autowired
	private UserRepositry repo;
	public UserServices() {
			
	}
	public void save(User user) {
		repo.save(user);
		System.out.println("save");
	}
	public void save1(List<User> users){
		
		repo.saveAll(users);
				
		
		
	}
}
