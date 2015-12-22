package com.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.dao.StudentDao;
import com.mvc.model.Student;

@Controller
public class StudentController
{

	public StudentDao studentDao;
	
	@Autowired(required=true)
    @Qualifier(value="studentDao")
     public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	@RequestMapping(value="/employee/add",method=RequestMethod.POST)
	public @ResponseBody String addStudent(@RequestBody Student s1)
	{
		studentDao.addStudent(s1);
		return "insetred successfully";
		
		
	}
	
	
	
}

