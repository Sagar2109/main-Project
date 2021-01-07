package com.example.booking.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="movie_table")
@Entity
 public class CustomerModel  {
	public CustomerModel() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	@Column(length = 24,nullable = false)
	String customername;
	@Column(length = 14)
	String mobileno;
	@Column(length = 48,nullable = false)
	String email;
	@Column(length = 24,nullable = false)
	String movienm;
	@Column(length = 8,nullable = false)
	String time;
	@Column(length = 4,nullable = false)
	int price;
	@Column(length = 2,nullable = false )
	int totalticktes;
	@Column(length = 4,nullable = false)
	int totalprize;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMovienm() {
		return movienm;
	}
	public void setMovienm(String movienm) {
		this.movienm = movienm;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotalticktes() {
		return totalticktes;
	}
	public void setTotalticktes(int totalticktes) {
		this.totalticktes = totalticktes;
	}
	public int getTotalprize() {
		return totalprize;
	}
	public void setTotalprize(int totalprize) {
		this.totalprize = totalprize;
	}
}
