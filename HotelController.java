package com.hotelapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hotelapp.model.Book;
import com.hotelapp.service.BookService;
import com.hotelapp.service.HotelService;

@RestController
public class HotelController {
	@Autowired
	HotelService hotelService;
	
	@GetMapping("/hotels")
	public List<Hotel> showAllHotels(){
		return hotelService.getAllHotels();
		
	}
	@GetMapping("/hotels-by-name/{name}")
	public List<Hotel> showHotelsByName(@PathVariable("name")String author){
		return hotelService.getByAuthor(author);
		
	}
	
	@GetMapping("/hotels-by-cuisine/{cuisine}")
	public List<Hotel> showBooksByCuisine(@PathVariable("cuisine")String category){
		return hotelService.getByCuisine(cuisine);
		
	}
	
	@GetMapping("/hotels-by-Id/{hotelId}")
	public Hotel showById(@PathVariable("hotelId")int id){
		return HotelService.getById(id);
		
	}



}