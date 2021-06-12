package com.school.mongo.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.school.mongo.models.Student;
import com.school.mongo.repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	private StudentRepository studentrepo;

	@PostMapping("/addStudent")
	public String saveStudent(@RequestBody Student student) {
		studentrepo.save(student);
		return "Saved student successfully " + student.getId();
	}

	@GetMapping("/getStudents")
	public List<Student> getStudents() {
		return studentrepo.findAll();
	}

	@GetMapping("/getStudentById/{id}")
	public Optional<Student> getStudentById(@PathVariable int id) {
		return studentrepo.findById(id);
	}

	@PutMapping("/updateStudent")
	public String updateStudent(@RequestBody Student student) {
		studentrepo.save(student);
		return "Successfully updated " + student.getStName();
	}

	@DeleteMapping("/deleteStudentById/{id}")
	public String deleteStudentById(@PathVariable int id) {
		studentrepo.deleteById(id);
		return "Student with " + id + " deleted successfully";
	}
}
