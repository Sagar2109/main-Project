package com.example.booking.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
	public CustomerModel getfromid(int i) {
		//repo.getOne(arg0)
		Optional<CustomerModel> entity=repo.findById(i);
		if(entity.isPresent()) {
			return entity.get();
		}
		else
		{
			return null;
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

	public CustomerDto modelToDto(CustomerModel cd) {
		CustomerDto cm=new CustomerDto();
		
		cm.setId(cd.getId());
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
	
	
}
