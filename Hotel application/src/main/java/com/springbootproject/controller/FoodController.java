package com.springbootproject.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbootproject.demo.entity.Food;
import com.springbootproject.demo.service.FoodService;
@CrossOrigin
@Controller
@RequestMapping("/")
public class FoodController {
	public FoodController()
	   {
		   System.out.println("I am FoodController");
	   }
    
	@Autowired
    private FoodService fdService;
	
	 @RequestMapping("/items")
	    public ResponseEntity<List<Food>> getAll() 
	    {
		 List<Food> obj=fdService.getAll();
			if(obj!=null && obj.size()>0) 
			{
	    	return ResponseEntity.status(200).body(obj);
			}
			else
			{
			return ResponseEntity.status(400).body(obj);
			}
	    }
	 @RequestMapping("/items/{id}")
	    public ResponseEntity<Food> getfood(@PathVariable("id") Integer id)
	    {
		  Food food= fdService.getById(id);
			if(food!=null) {
	    	return ResponseEntity.status(200).body(food);
			}
			else
			{
			return ResponseEntity.status(400).body(food);
			}
	    }
	 @RequestMapping("/delete/{id}")
	    public ResponseEntity<List<Food>> removeId(@PathVariable("id") Integer id)
	    {
	    	List<Food> list = fdService.removeId(id);
			if(list!=null) {
	    	return ResponseEntity.status(200).body(list);
			}
			else
			{
			return ResponseEntity.status(400).body(list);
			}
	    }
	 @RequestMapping("/create")
	    public ResponseEntity<Food> saveData(@RequestBody Food food) 
	    {
		 Food listData= fdService.saveData(food);
			if(listData!=null) {
	    	return ResponseEntity.status(200).body(listData);
			}
			else
			{
			return ResponseEntity.status(400).body(listData);
			}
	    }
	 @PutMapping("/update/{id}")
	    public ResponseEntity<Food> update(@PathVariable("id") Integer id ,@RequestBody Food d) 
	    {
			boolean value= fdService.Update(id ,d);
			if(value) {
	    	return ResponseEntity.status(200).body(d);
			}
			else
			{
			return ResponseEntity.status(400).body(d);
			}
	    }
}
