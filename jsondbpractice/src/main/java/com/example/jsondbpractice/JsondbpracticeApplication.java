package com.example.jsondbpractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.jsondbpractice.model.*;
import com.example.jsondbpractice.ServicesImpl.UserServices;
import com.google.gson.Gson;


@SpringBootApplication
public class JsondbpracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsondbpracticeApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(UserServices service) 
	{
		return arg->{
		String line="";
	String delimeter=";";
	try {
		BufferedReader reder= new BufferedReader(new FileReader("D:\\Users\\Downloads\\access-code.csv"));
		
		while ((line=reder.readLine())!=null) {
//			System.out.println("user:"+line);
			
			String userdata[]=line.split(delimeter);
			User us=new User(Integer.valueOf(userdata[0]), userdata[1], userdata[2]);
			
//			
			Gson gg=new Gson();

		String oo=gg.toJson(us);
      User user=gg.fromJson(oo, User.class);
      System.out.println(user.getId());
      service.save(user);  
			
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
};
//		 ObjectMapper mapper=new ObjectMapper();
//		 TypeReference<List<User>> typerefers= new TypeReference<List<User>>(){};
//		//InputStream strea=TypeReference.class.ge
////		 try {
////				List<User> users = mapper.readValue(oo,typerefers);
////				userService.save(users);
////				System.out.println("Users Saved!");
////			} catch (IOException e){
////				System.out.println("Unable to save users: " + e.getMessage());
////			}
//		};
		
		}
}
