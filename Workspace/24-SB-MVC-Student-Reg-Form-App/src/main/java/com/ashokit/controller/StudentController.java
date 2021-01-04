package com.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.binding.Student;
import com.ashokit.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/student")
	public String loadForm(Model model) {

		Student s = new Student();

		model.addAttribute("student", s);
		model.addAttribute("genders", studentService.getGenders());
		model.addAttribute("courses", studentService.getCourses());
		model.addAttribute("timings", studentService.getTimings());

		return "registration";
	}

	@PostMapping("/studentReg")
	public String handeRegisterBtn(Student s, Model model) {
		System.out.println(s);

		model.addAttribute("name", s.getFname() + " " + s.getLname());

		return "success";
	}

}
