package com.springbootproject.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Food {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String foodName;
	int price;
	String type;
	int ratings;
	String pic;
	public Food()
	{
		System.out.println("Im constructor");
	}
	public Food(int id, String foodName, int price, String type, int ratings, String pic) {
		super();
		this.id = id;
		this.foodName = foodName;
		this.price = price;
		this.type = type;
		this.ratings = ratings;
		this.pic = pic;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
    
}
