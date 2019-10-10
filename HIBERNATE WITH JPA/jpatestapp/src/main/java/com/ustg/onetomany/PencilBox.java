package com.ustg.onetomany;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "pencilbox")
public class PencilBox {
	@Id
	@Column
	private int bid;
	@Column
	private String boxname;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "bid", nullable = false)
	List<Pencil> pencil;

	public String getBoxname() {
		return boxname;
	}

	public void setBoxname(String boxname) {
		this.boxname = boxname;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public List<Pencil> getPencil() {
		return pencil;
	}

	public void setPencil(List<Pencil> pencil) {
		this.pencil = pencil;
	}

}
