package com.bilgeadam.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Dept {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private boolean isPaid;

	private Date paiDate;

	private int delayTime;

	private double amount;

	@OneToOne
	@JoinColumn(name = "borrow_id", referencedColumnName = "id")
	private Borrow borrow;

	public Dept(long id, boolean isPaid, Date paiDate, int delayTime, double amount, Borrow borrow) {
		super();
		this.id = id;
		this.isPaid = isPaid;
		this.paiDate = paiDate;
		this.delayTime = delayTime;
		this.amount = amount;
		this.borrow = borrow;
	}

	public Dept(boolean isPaid, Date paiDate, int delayTime, double amount, Borrow borrow) {
		super();
		this.isPaid = isPaid;
		this.paiDate = paiDate;
		this.delayTime = delayTime;
		this.amount = amount;
		this.borrow = borrow;
	}

	public Dept() {
		super();
	}

	@Override
	public String toString() {
		return "Dept [id=" + id + ", isPaid=" + isPaid + ", paiDate=" + paiDate + ", delayTime=" + delayTime
				+ ", amount=" + amount + ", borrow=" + borrow + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isPaid() {
		return isPaid;
	}

	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}

	public Date getPaiDate() {
		return paiDate;
	}

	public void setPaiDate(Date paiDate) {
		this.paiDate = paiDate;
	}

	public int getDelayTime() {
		return delayTime;
	}

	public void setDelayTime(int delayTime) {
		this.delayTime = delayTime;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Borrow getBorrow() {
		return borrow;
	}

	public void setBorrow(Borrow borrow) {
		this.borrow = borrow;
	}

}
