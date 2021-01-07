package com.example.booking.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.ui.Model;

import com.example.booking.Dto.CustomerDto;
import com.example.booking.model.CustomerModel;

public interface CustomerService {
		
	 public CustomerModel getfromid(int i);
	
	 CustomerModel CreateAndInsert(CustomerDto dt);
		
		void deletefromdb(int i);
		
		CustomerModel update(CustomerDto cc);

		List<CustomerModel> Display();
	}	

		

	
