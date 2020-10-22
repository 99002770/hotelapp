package com.hotelapp.model;

public class Hotel {
	String Name;
	Integer Id;
	String City;
	String Cuisine;
	public Hotel() {
		super();
	}
	public Hotel(String Name,Integer Id,String City,String Cusinie) {
		super();
		this.Name = Name;
		this.Id = Id;
		this.City = City;
		this.Cuisine = Cuisine;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		this.Id = id;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		this.City = city;
	}
	public String getCuisine() {
		return Cuisine;
	}
	public void setCuisine(String cuisine) {
		this.Cuisine = cuisine;
	}
	@Override
	public String toString() {
		return "Hotel [Name=" + Name + ", Id=" + Id + ", City=" + City + ", Cuisine=" + Cuisine + "]";
	}
	

	}
