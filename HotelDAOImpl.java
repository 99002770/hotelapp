package com.hotelapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hotelapp.model.Hotel;
@Service
public class HotelDAOImpl implements HotelDAO{

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return showHotelList();
	}

	@Override
	public List<Hotel> getByName(String name) {
		// TODO Auto-generated method stub
		List<Hotel> newHotelList=new ArrayList<>();
		for(Hotel hotel:showHotelList()) {
			if(hotel.getName().equals(name))
				newHotelList.add(hotel);
		}
		return newHotelList;
	}
	@Override
	public List<Hotel> getByCity(String city) {
		// TODO Auto-generated method stub
		List<Hotel> newHotelList=new ArrayList<>();
		for(Hotel hotel:showHotelList()) {
			if(hotel.getCity().equals(city))
				newHotelList.add(hotel);
		}
		return newHotelList;
	}
	@Override
	public List<Hotel> getByCuisine(String cuisine) {
		// TODO Auto-generated method stub
		List<Hotel> newHotelList=new ArrayList<>();
		for(Hotel hotel:showHotelList()) {
			if(hotel.getCuisine().equals(cuisine))
				newHotelList.add(hotel);
		}
		return newHotelList;
	}


	private Object showHotelList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hotel getById(int id) {
		for(Hotel hotel:showHotelList()) {
			if(hotel.getHotelId()==id)
				return hotel;
		}
		return null;
		
	}
	private List<Hotel> showHotelList(){
		return Arrays.asList(
				new Hotel(11,"One star","Bangalore","Indian"),
				new Hotel(12,"Two star","Mysore","Chinese"),
				new Hotel(13,"Three star","Goa"," Indian"),
				new Hotel(14,"Five Star","Mumbai","Chinese")
				);
	}

}