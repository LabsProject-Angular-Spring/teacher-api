package co.edu.unilibre.labsproject.teacher.controller;

import java.util.List;

import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unilibre.labsproject.teacher.entity.Teacher;
import co.edu.unilibre.labsproject.teacher.service.ITeacherService;

@RestController
public class TeacherController {
	@Value("${server.port}")
	private Long port;	
	
	@Autowired
	private ITeacherService teacherService;
	
	@GetMapping("/list")
	public List<Teacher> getList(){
		//return teacherService.getAllList();
		return teacherService.getAllList().stream().map(teacher -> {
			teacher.setPort(port);
			return teacher;
		}).collect(Collectors.toList());
	}
	
	@GetMapping("/{id}")
	public Teacher getById(@PathVariable Long id) {
		//return teacherService.getById(id);
		Teacher teacher = teacherService.getById(id);
		teacher.setPort(port);
		return teacher;
	}
	
}
