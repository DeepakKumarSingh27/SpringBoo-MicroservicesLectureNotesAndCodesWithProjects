package in.ashokit.service;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Address;
import in.ashokit.entity.Employee;
import in.ashokit.repository.AddressRepository;
import in.ashokit.repository.EmployeeRepository;
import jakarta.transaction.Transactional;

@Service
public class EmployeeService {
	private EmployeeRepository empRepo;
	private AddressRepository addrRepo;

	public EmployeeService(EmployeeRepository empRepo, AddressRepository addrRepo) {
		super();
		this.empRepo = empRepo;
		this.addrRepo = addrRepo;
	}

	@Transactional(rollbackOn = Exception.class)
	public void saveData() {
		Employee emp = new Employee();
		emp.setEmpId(205);
		emp.setEmpName("Deepak");
		emp.setEmpsal(5000.00);
		empRepo.save(emp);
		//int i = 10 / 0;
		Address adr = new Address();
		adr.setAddrId(505);
		adr.setEmpId(205);
		adr.setCity("Bangalore");
		adr.setState("KA");
		adr.setCountry("India");
		addrRepo.save(adr);
	}

}
