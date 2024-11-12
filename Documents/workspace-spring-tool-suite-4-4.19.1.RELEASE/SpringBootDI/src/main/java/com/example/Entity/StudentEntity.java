package com.example.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student_data")
public class StudentEntity {
	
	@Id
	@Column(name = "Stu_id")
	private int id;
	
	public StudentEntity() {
		
	}
	
	public StudentEntity(int id, String name, long rank, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.rank = rank;
		this.gender = gender;
	}

	@Column(name = "Stu_name")
	private String name;
	
	@Column(name = "Stu_rank")
	private long rank;
	
	@Column(name = "Stu_gender")
	private String gender;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + ", rank=" + rank + ", gender=" + gender + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getRank() {
		return rank;
	}

	public void setRank(long rank) {
		this.rank = rank;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
