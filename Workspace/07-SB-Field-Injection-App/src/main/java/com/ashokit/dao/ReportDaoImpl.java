package com.ashokit.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ReportDaoImpl implements ReportDao {

	@Override
	public String findById(Integer id) {
		return "This is report data for user id :: " + id;
	}

	public ReportDaoImpl() {
		System.out.println("** ReportDaoImpl :: Constructor ** ");
	}
}
