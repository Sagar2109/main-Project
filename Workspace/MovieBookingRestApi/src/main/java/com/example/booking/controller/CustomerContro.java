package com.example.booking.controller;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.booking.Dto.CustomerDto;
import com.example.booking.Service.CustomerService;

@RestController
public class CustomerContro {
	@Autowired
    CustomerService service;
	@Cacheable(value="id")
	
	@GetMapping("/read/{id}")
	public ResponseEntity<?> rcreat(@PathVariable int id) {
		return service.getfromid(id);
	
	}
	@Cacheable(value="alldata")
	@GetMapping("/read")
	public ResponseEntity<?> rcreate() {
		Map<String, Object> map= new HashMap<String, Object>();
		if(!service.Display().isEmpty()) {
			map.put("Code:", "200");
			map.put("Status:", "True");
			map.put("Message:", "All customers Details are here");
			map.put("Data:",service.Display());
			return ResponseEntity.status(HttpStatus.OK).body(map);
		}
		else {
			map.put("Code:", "400");
			map.put("Status:", "FAlse");
			map.put("Message:", "DAta Not Found");
			return ResponseEntity.badRequest().body(map);
		}
	}
	
	@PostMapping("/create")
	public ResponseEntity<?> Create(@RequestBody CustomerDto cc) {
		Map<String, Object> map= new HashMap<String, Object>();
		//int id=cc.getId();
		String customerName=cc.getCustomername();
		String mobileNo=cc.getMobileno();
		String email=cc.getEmail();
		String movieNm=cc.getMovienm();
		String time=cc.getTime();
		int price=cc.getPrice();
		int totalTic=cc.getTotalticktes();
		int total=cc.getTotalprize();
		String regex = "^(.+)@[a-z](.+)$";
		
		if(customerName.isEmpty()) {
			map.put("Code:", 404);
			map.put("Message:", "CustomerName Required.");
			map.put("Status:", false);
			map.put("CustomerName:", customerName);
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
		}
		if(!mobileNo.matches("^[0-9]{10}"))
		{
			map.put("Code:", 404);
			map.put("Message:", "Mobile Number is Invaild");
			map.put("Status:", false);
			map.put("Mobile Number:", mobileNo);
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
		}
		if(! email.matches(regex))
		{
			map.put("Code:", 404);
			map.put("Message:", "Email is Invaild");
			map.put("Status:", false);
			map.put("Email:", email);
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
		}
		if(movieNm.isEmpty())
		{
			map.put("Code:", 404);
			map.put("Message:", "Movie Name is Invaild");
			map.put("Status:", false);
			map.put("Movie Name:", movieNm);
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
		}
		if(!time.matches("(1[012]|[1-9]):[0-5][0-9]")){
			map.put("Code:", 404);
			map.put("Message:", "Time is Invaild");
			map.put("Status:", false);
			map.put("Time:", time);
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
		}
		if(price<0)
		{
			map.put("Code:", 404);
			map.put("Message:", "");
			map.put("Status:", false);
			map.put("Price:", price);
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
		}
		if(totalTic<0 || total<0)
		{
			map.put("Code:", 404);
			map.put("Message:", "Toatal Invaild");
			map.put("Status:", false);
			map.put("Total:", total);
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
		}
		else {
			map.put("Code:", 200);
			map.put("Message:", "Insert SuccesFully");
			map.put("Status:", true);
			map.put("Data:", service.CreateAndInsert(cc));
			return ResponseEntity.status(HttpStatus.OK).body(map);
		}
		}
	@CachePut("add")
	@PutMapping("/update")
	public ResponseEntity<?> forUpdate(@RequestBody CustomerDto cc)  {
		//Executor
		Map<String, Object> map =new HashMap<String, Object>();
		int i=cc.getId();
		String customerName=cc.getCustomername();
		String mobileNo=cc.getMobileno();
		String email=cc.getEmail();
		String movieNm=cc.getMovienm();
		String time=cc.getTime();
		int price=cc.getPrice();
		int totalTic=cc.getTotalticktes();
		int total=cc.getTotalprize();
		String regex = "^(.+)@[a-z](.+)$";
		
		if(customerName.isEmpty()) {
			map.put("Code:", 404);
			map.put("Message:", "CustomerName Required.");
			map.put("Status:", false);
			map.put("CustomerName:", customerName);
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
		}
		if(!mobileNo.matches("^[0-9]{10}"))
		{
			map.put("Code:", 404);
			map.put("Message:", "Mobile Number is Invaild");
			map.put("Status:", false);
			map.put("Mobile Number:", mobileNo);
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
		}
		if(! email.matches(regex))
		{
			map.put("Code:", 404);
			map.put("Message:", "Email is Invaild");
			map.put("Status:", false);
			map.put("Email:", email);
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
		}
		if(movieNm.isEmpty())
		{
			map.put("Code:", 404);
			map.put("Message:", "Movie Name is Invaild");
			map.put("Status:", false);
			map.put("Movie Name:", movieNm);
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
		}
		if(!time.matches("(1[012]|[1-9]):[0-5][0-9]")){
			map.put("Code:", 404);
			map.put("Message:", "Time is Invaild");
			map.put("Status:", false);
			map.put("Time:", time);
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
		}
		if(price<0)
		{
			map.put("Code:", 404);
			map.put("Message:", "");
			map.put("Status:", false);
			map.put("Price:", price);
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
		}
		if(totalTic<0 || total<0)
		{
			map.put("Code:", 404);
			map.put("Message:", "Toatal Invaild");
			map.put("Status:", false);
			map.put("Total:", total);
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
		}
		try {
			
		if(i<0) {
			map.put("Code:", 404);
			map.put("Message:", "No Such variable found");
			map.put("Status:", false);
			map.put("Id:", i);
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
		}
		else {
		map.put("Code:", 200);
		map.put("Message:", "Insert SuccesFully");
		map.put("Status:", true);
		map.put("Data:", service.update(cc));
		return ResponseEntity.status(HttpStatus.OK).body(map);
		
		
		
		
		}}
		catch(Exception e) {
			map.put("Code:", 404);
			map.put("Message:", "No Such variable found");
			map.put("Status:", false);
			
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
			
		}
		
	}
	
	@CacheEvict(value="alldata")
	@GetMapping("/delete/{i}")
	public ResponseEntity<?> delete(@PathVariable int i) {
		Map<String, Object> map =new HashMap<String, Object>();
		//service.deletefromdb(i);
		try {
		if(i<0 ) {
			map.put("Code:", 404);
			map.put("Message:", "No Such variable found");
			map.put("Status:", false);
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(map);
		}
		else {
//		CustomerDto list= service.update(i);
		map.put("Code:", 200);
		map.put("Message:", "Delete Suceessfully This Record");
		map.put("Status:", true);
		map.put("Data:", service.getfromid(i));
		service.deletefromdb(i);
		return ResponseEntity.status(HttpStatus.OK).body(map);
		}}
		catch(Exception e) {
			map.put("Code:", 404);
			map.put("Message:", "No Such variable found");
			map.put("Status:", false);
			
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
			
		}
	}
	
//	@GetMapping("/upd")
//	public CustomerModel update(@RequestBody CustomerModel ff) {
//		Optional<CustomerModel> obj=firstrepo.findById(ff.getId());
//		CustomerModel obj1=obj.get();
//		obj1.setFirstname(ff.getFirstname());
//		obj1.setLastname(ff.getLastname());
//		firstrepo.save(obj1);
//		return obj1;
//	}
	}
