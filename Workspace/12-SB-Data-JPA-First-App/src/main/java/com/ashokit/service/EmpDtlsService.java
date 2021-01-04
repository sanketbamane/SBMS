package com.ashokit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.entity.EmpDtlsEntity;
import com.ashokit.repository.EmpDtlsRepository;

@Service
public class EmpDtlsService {

	@Autowired
	private EmpDtlsRepository empDtlsRepo;

	public void saveEmp() {

		EmpDtlsEntity entity = new EmpDtlsEntity();
		entity.setEmpId(104);
		entity.setEmpName("Cathiee");
		entity.setEmpSalary(15000.00);

		empDtlsRepo.save(entity);
	}

	public void getEmpById() {
		Optional<EmpDtlsEntity> findById = empDtlsRepo.findById(102);

		if (findById.isPresent()) {
			EmpDtlsEntity entity = findById.get();
			System.out.println(entity);
		} else {
			System.out.println("Record Not Found With Given ID");
		}
	}

	public void getAllEmps() {
		Iterable<EmpDtlsEntity> findAll = empDtlsRepo.findAll();
		findAll.forEach(entity -> {
			System.out.println(entity);
		});
	}

	public void deleteEmp() {
		empDtlsRepo.deleteById(103);
	}

	public void updateEmp() {

		EmpDtlsEntity entity = new EmpDtlsEntity();
		entity.setEmpId(102);
		entity.setEmpName("Smith");
		entity.setEmpSalary(30000.00);

		empDtlsRepo.save(entity);

	}

}
