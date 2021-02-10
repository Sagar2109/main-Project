package com.example.booking.repositry;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.booking.model.CustomerModel;

@Repository
@Transactional
public interface CustomerRepositry extends JpaRepository<CustomerModel, Integer>{
	
	
}
