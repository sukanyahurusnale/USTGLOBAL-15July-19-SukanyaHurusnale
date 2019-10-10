package com.ustg.onetoone.beans;

import javax.persistence.*;

@Entity
@Table(name="votercard")
public class VoterCard {

	@Id
	@Column
	private int vid;
	
	@Column
	private String vname;
 
	@OneToOne(mappedBy="vc") //mapping with person birectional
	private Person person;
	
	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
