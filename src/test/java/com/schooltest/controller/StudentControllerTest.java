package com.schooltest.controller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.school.mongo.models.Student;
import com.school.mongo.resources.StudentController;

@RunWith(SpringRunner.class)
@WebMvcTest(StudentController.class)
public class StudentControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private StudentController stcontroller;
	
	@Test
	public void getStudents() {
		Student st = new Student();
		st.setId(1);
		
		//Optional<Student> stus=java.util.Collections.singletonList(st);
		//given(stcontroller.getStudentById(st.getId())).willReturn(stus);
		
	}

	
	
}
