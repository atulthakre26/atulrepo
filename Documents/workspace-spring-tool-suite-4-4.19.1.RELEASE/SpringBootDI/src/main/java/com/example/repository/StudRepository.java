package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.Entity.StudentEntity;

import jakarta.transaction.Transactional;

public interface StudRepository extends JpaRepository<StudentEntity, Integer> {

	//public List<StudentEntity> findAll();
	
	@Query("delete from StudentEntity where id = :sid")
	@Modifying
	@Transactional
	public void deleteStudent(Integer sid);
	
	@Query(value = "insert into student_data(stu_id, stu_gender, stu_name, stu_rank) values(:id, :gender, :name, :rank)", nativeQuery = true)
	@Modifying
	@Transactional
	public void insertStudent(Integer id, String name, long rank, String gender);
	
}
