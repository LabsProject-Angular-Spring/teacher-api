package co.edu.unilibre.labsproject.teacher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unilibre.labsproject.teacher.entity.Teacher;
import co.edu.unilibre.labsproject.teacher.service.ITeacherService;

@RestController
public class TeacherController {
	@Autowired
	private ITeacherService teacherService;
	
	@GetMapping("/list")
	public List<Teacher> getList(){
		return teacherService.getAllList();
	}
	
	@GetMapping("/{id}")
	public Teacher getById(@PathVariable Long id) {
		return teacherService.getById(id);
	}
	
}
