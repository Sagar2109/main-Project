package com.example.booking.ServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.booking.Dto.CustomerDto;
import com.example.booking.Service.CustomerService;
import com.example.booking.model.CustomerModel;
import com.example.booking.repositry.CustomerRepositry;
@Service
public class CustomerImpl implements CustomerService{

	@Autowired
	CustomerRepositry repo;
//	@Autowired(required = true)
//	CustomerModel cm;
	
	@Override
	public CustomerModel CreateAndInsert(CustomerDto dt) {
	//	dt.setTotalprize(dt.getPrice()*dt.getTotalticktes());
		return repo.save(DtoToModel(dt));
	}
	
	@Override
	public List<CustomerModel> Display() {
		return repo.findAll();
	}
	@Override
	public void deletefromdb(int i) {
		repo.deleteById(i);;
	}
	@Override
	public CustomerModel update(CustomerDto cc) {
		//int ii=Integer.parseInt(i);
		CustomerModel mod=CreateAndInsert(cc);
		return mod;
	}
	@Override
	public ResponseEntity<?> getfromid(int i) {
		//repo.getOne(arg0)
		Map<String, Object> map = new HashMap<String, Object>();
	try {
		if (i>0) {
			Optional<CustomerModel> entity=repo.findById(i);
			map.put("Code", "200");
			map.put("ID:", entity.get());
			return ResponseEntity.ok(map);
		} 
		else {
			map.put("Code", "404");
			map.put("ID:", "Is Not Found");
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
		}
	}catch (Exception e) {
		map.put("Code", "404");
		map.put("ID:", "Is Not Found");
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
	}
	}
	public CustomerModel DtoToModel(CustomerDto cd) {
		CustomerModel cm=new CustomerModel();
		
		if(cd.getId() !=' '||cd.getId()>0) {
		    cm.setId(cd.getId());
		}
		
		cm.setCustomername(cd.getCustomername());
		cm.setMobileno(cd.getMobileno());
		cm.setEmail(cd.getEmail());
		cm.setMovienm(cd.getMovienm());
		cm.setTime(cd.getTime());
		cm.setPrice(cd.getPrice());
		cm.setTotalticktes(cd.getTotalticktes());
		cm.setTotalprize(cd.getPrice()*cd.getTotalticktes());
			return cm;
		}

//	public CustomerDto modelToDto(CustomerModel cd) {
//		CustomerDto cm=new CustomerDto();
//		
//		cm.setId(cd.getId());
//		cm.setCustomername(cd.getCustomername());
//		cm.setMobileno(cd.getMobileno());
//		cm.setEmail(cd.getEmail());
//		cm.setMovienm(cd.getMovienm());
//		cm.setTime(cd.getTime());
//		cm.setPrice(cd.getPrice());
//		cm.setTotalticktes(cd.getTotalticktes());
//		cm.setTotalprize(cd.getPrice()*cd.getTotalticktes());
//			return cm;
//		}
	
	
}
