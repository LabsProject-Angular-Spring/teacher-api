package co.edu.unilibre.labsproject.teacher.service;

import java.util.List;

import co.edu.unilibre.labsproject.teacher.entity.Teacher;

public interface ITeacherService {
	public List<Teacher> getAllList();
	public Teacher getById(Long id);
}
