package com.cg.cassandra;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table
public class Customer {
	@PrimaryKey
	private int id;
	private String firstname;
	private String lastname;
	private int age;
	private String feedback;
	private int rating;
	
	public Customer(){}
	
	public Customer(int id, String firstname, String lastname, int age, String feedback, int rating ){
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.feedback = feedback;
		this.rating = rating;
		
		
	}
	
	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return this.id;
	}
	
	public void setFirstname(String firstname){
		this.firstname = firstname;
	}
	
	public String getFirstname(){
		return this.firstname;
	}
	
	public void setLastname(String lastname){
		this.lastname = lastname;
	}
	
	public String getLastname(){
		return this.lastname;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return this.age;
	}
	
	@Override
	public String toString() {
		return String.format("Customer[id=%d, firstName='%s', lastName='%s', age=%d, feedback='%s', rating=%d]", this.id,
				this.firstname, this.lastname, this.age,this.feedback, this.rating);
	}
}
