package com.bilgeadam.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Borrow {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)

	private long id;

	@Temporal(TemporalType.DATE)
	Date borrowDate;

	@Temporal(TemporalType.DATE)
	Date returnDate;

	@ManyToOne
	Student student;

	@ManyToOne
	Book book;

	public Borrow(Date borrowDate, Date returnDate, Student student, Book book) {
		super();
		this.borrowDate = borrowDate;
		this.returnDate = returnDate;
		this.student = student;
		this.book = book;
	}

	public Borrow() {
		super();
	}

	@Override
	public String toString() {
		return "Borrow [id=" + id + ", borrowDate=" + borrowDate + ", returnDate=" + returnDate + ", student=" + student
				+ ", book=" + book + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getBorrowDate() {
		return borrowDate;
	}

	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

}
