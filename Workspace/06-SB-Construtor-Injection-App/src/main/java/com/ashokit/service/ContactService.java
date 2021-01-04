package com.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.dao.ContactDao;

@Service
public class ContactService {

	private ContactDao dao;

	public ContactService() {
		System.out.println("** ContactService ::0-Param Constructor **");
	}

	@Autowired
	public ContactService(ContactDao dao) {
		System.out.println("** ContactService ::1-Param Constructor **");
		this.dao = dao;
	}

	public void printName(Integer cid) {
		String name = dao.findNameById(cid);
		System.out.println(name);
	}
}
