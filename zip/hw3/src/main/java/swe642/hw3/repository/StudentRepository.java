package swe642.hw3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import swe642.hw3.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
}