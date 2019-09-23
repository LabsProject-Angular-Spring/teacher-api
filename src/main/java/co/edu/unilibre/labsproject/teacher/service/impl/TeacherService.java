package co.edu.unilibre.labsproject.teacher.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unilibre.labsproject.teacher.entity.Teacher;
import co.edu.unilibre.labsproject.teacher.repository.ITeacherRepository;
import co.edu.unilibre.labsproject.teacher.service.ITeacherService;;


@Service
public class TeacherService implements ITeacherService{

	@Autowired
	private ITeacherRepository teacherRepository;
	
	@Override
	public List<Teacher> getAllList() {
		return teacherRepository.findAll();
	}

	@Override
	public Teacher getById(Long id) {
		return teacherRepository.findById(id).get();
	}
	
}
