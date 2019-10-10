package com.ustg.onetoone.beans;

import javax.persistence.CascadeType;
import javax.persistence.*;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Person {

	@Id
	@Column
	private int id;
	@Column
	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "vid")
	private VoterCard vc; // refrence of votercard class

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public VoterCard getVc() {
		return vc;
	}

	public void setVc(VoterCard vc) {
		this.vc = vc;
	}

}
