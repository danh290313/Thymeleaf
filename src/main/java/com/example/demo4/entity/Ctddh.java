package com.example.demo4.entity;
// Generated Dec 14, 2022, 9:49:56 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Ctddh generated by hbm2java
 */
@Entity
@Table(name = "ctddh", catalog = "thoitrang")
public class Ctddh implements java.io.Serializable {

	private CtddhId id;
	private Dondathang dondathang;
	private Mathang mathang;
	private int soluong;
	private int dongia;

	public Ctddh() {
	}

	public Ctddh(CtddhId id, Dondathang dondathang, Mathang mathang, int soluong, int dongia) {
		this.id = id;
		this.dondathang = dondathang;
		this.mathang = mathang;
		this.soluong = soluong;
		this.dongia = dongia;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "maddh", column = @Column(name = "MADDH", nullable = false, length = 10)),
			@AttributeOverride(name = "mamh", column = @Column(name = "MAMH", nullable = false, length = 10)) })
	public CtddhId getId() {
		return this.id;
	}

	public void setId(CtddhId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MADDH", nullable = false, insertable = false, updatable = false)
	public Dondathang getDondathang() {
		return this.dondathang;
	}

	public void setDondathang(Dondathang dondathang) {
		this.dondathang = dondathang;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MAMH", nullable = false, insertable = false, updatable = false)
	public Mathang getMathang() {
		return this.mathang;
	}

	public void setMathang(Mathang mathang) {
		this.mathang = mathang;
	}

	@Column(name = "SOLUONG", nullable = false)
	public int getSoluong() {
		return this.soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	@Column(name = "DONGIA", nullable = false)
	public int getDongia() {
		return this.dongia;
	}

	public void setDongia(int dongia) {
		this.dongia = dongia;
	}

}