package com.ashokit.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.domain.Students;
import com.ashokit.entity.Student;
import com.ashokit.exception.NoDataFoundException;
import com.ashokit.repository.StudentRepository;

@RestController
public class StudentRestController {

	@Autowired
	private StudentRepository stuRepo;

	@PostMapping(value = "/add", consumes = { "application/xml", "application/json" })
	public ResponseEntity<String> addStudent(@RequestBody Student student) {
		Student savedEntity = stuRepo.save(student);
		String response = "Student Saved With ID as : " + savedEntity.getSid();
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}

	@GetMapping(value = "/get/{sid}", produces = { "application/xml", "application/json" })
	public ResponseEntity<Student> getStudent(@PathVariable("sid") Integer sid) {
		Student s = null;
		Optional<Student> findById = stuRepo.findById(sid);
		if (findById.isPresent()) {
			s = findById.get();
		} else {
			throw new NoDataFoundException("Invalid Student ID");
		}
		return new ResponseEntity<>(s, HttpStatus.OK);
	}

	@GetMapping(value = "/students", produces = { "application/xml", "application/json" })
	public ResponseEntity<Students> getStudents() {

		List<Student> students = stuRepo.findAll();

		Students stds = new Students();
		stds.setStudents(students);

		return new ResponseEntity<>(stds, HttpStatus.OK);

	}

	@PutMapping(value = "/update", consumes = { "application/json", "application/xml" })
	public ResponseEntity<String> updateStudent(@RequestBody Student student) {
		stuRepo.save(student);
		String msg = "Record Updated Successfully..!!";
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

	@DeleteMapping(value = "/delete/{sid}")
	public ResponseEntity<String> deleteStudent(@PathVariable("sid") Integer sid) {
		stuRepo.deleteById(sid);
		String msg = "Record Deleted With Student ID : " + sid;
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
}
