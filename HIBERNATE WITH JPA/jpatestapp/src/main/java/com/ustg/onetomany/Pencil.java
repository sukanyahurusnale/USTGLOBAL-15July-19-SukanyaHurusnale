package com.ustg.onetomany;

import javax.persistence.*;

@Entity
@Table (name="pencil")
public class Pencil {
	
	@Id
	@Column
	private int pid;
	@Column
	private String pencilname;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPencilname() {
		return pencilname;
	}
	public void setPencilname(String pencilname) {
		this.pencilname = pencilname;
	}

}
