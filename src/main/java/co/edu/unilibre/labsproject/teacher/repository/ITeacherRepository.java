package co.edu.unilibre.labsproject.teacher.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unilibre.labsproject.teacher.entity.Teacher;

public interface ITeacherRepository extends JpaRepository<Teacher, Long>{

}
