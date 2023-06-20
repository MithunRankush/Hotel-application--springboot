package com.springbootproject.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootproject.demo.dao.FoodDao;
import com.springbootproject.demo.entity.Food;

@Service
public class FoodService {
	public FoodService() {
		System.out.println("I am FoodService");
	}

	@Autowired
	private FoodDao fdDao;

	public List<Food> getAll() {
		return fdDao.findAll();
	}

	public Food getById(Integer id) {
		return fdDao.findById(id).get();
	}

	public List<Food> removeId(Integer id) {
		
		
		if (fdDao.existsById(id)) 
		{
			fdDao.deleteById(id);
			return getAll();
		}
		return null;
	}

	public Food saveData(Food food) {
		
		return fdDao.save(food);
	}
	
	public boolean Update(int id,Food d) 
	{
		Optional<Food> op = fdDao.findById(id);
		if(op!=null)
		{
			Food f = op.get();
			
			f.setFoodName(d.getFoodName());
			f.setPic(d.getPic());
			f.setPrice(d.getPrice());
			f.setRatings(d.getRatings());
			f.setType(d.getType());
			saveData(f);
			return true;
		}
		return false;
	}

}
