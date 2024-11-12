package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.entity.in.Student;
import com.example.Entity.StudentEntity;
import com.example.repository.StudRepository;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar;
import com.repositry.StudentRepostory;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//import org.hibernate.query.Page;
import org.springframework.*;
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.repository")
@ComponentScan
@EntityScan("com.example.Entity")
public class SpringBootDiApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context =
		SpringApplication.run(SpringBootDiApplication.class, args);
	
	StudRepository studentRepository = context.getBean(StudRepository.class);
	
	
	/*
	StudentEntity s1 = new StudentEntity(101, "Atul", 1l, 'm');
	StudentEntity s2 = new StudentEntity(102, "Nikhil", 2l, 'm');
    StudentEntity s3 = new StudentEntity(103, "Ankita", 3l, 'f');
    StudentEntity s4 = new StudentEntity(104, "Aditya", 4l, 'm');
    
    List<StudentEntity> student = Arrays.asList(s1,s2,s3,s4);*/
    
    //studentRepository.saveAll(student);
	
	//List<StudentEntity> ms = studentRepository.findAll();
	//ms.forEach(System.out::println);
	
	// Pagination Concept
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter the page no....");
	int pageNo = sc.nextInt();
	int pageSize = 3;
	
	
	PageRequest pr = PageRequest.of(pageNo-1, pageSize);
	Page<StudentEntity> findAll=  studentRepository.findAll(pr);
	List<StudentEntity> stu = findAll.getContent();
	stu.forEach(System.out::println);
	
	//studentRepository.insertStudent(22, "Arti", 2l, "Female");
	
	//System.out.println("Inserted.....");
	}

}
