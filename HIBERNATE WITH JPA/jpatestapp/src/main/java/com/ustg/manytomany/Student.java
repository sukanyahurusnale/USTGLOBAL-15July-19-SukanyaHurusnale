package com.ustg.manytomany;

import java.util.List;

import javax.persistence.*;

@Entity
@Table
public class Student {
	@Id
	@Column
	private int sid;
	@Column
	private String sname;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Student_Course",joinColumns=@JoinColumn(name="sid"),
	inverseJoinColumns=@JoinColumn(name="cid"))
	
	private List<Course> course;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}

}
