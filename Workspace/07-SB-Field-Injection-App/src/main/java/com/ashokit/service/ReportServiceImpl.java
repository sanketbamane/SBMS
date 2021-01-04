package com.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.dao.ReportDao;

@Service
public class ReportServiceImpl implements ReportService {

	@Autowired
	private ReportDao reportDao = null;

	@Override
	public void generateReport(Integer userId) {
		String data = reportDao.findById(userId);
		System.out.println(data);
	}

}
