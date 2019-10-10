package com.ustg.manytomany;

import java.util.List;

import javax.persistence.*;

@Entity
@Table
public class Course {

	@Id
	@Column
	private int cid;
	@Column
	private String cname;

	@ManyToMany(cascade=CascadeType.ALL,mappedBy="course")
	
	private List<Student> student;
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

}
