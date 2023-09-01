package com.skcet.flightbooking.service;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

//import com.skcet.flightbooking.entity.FlightEntity;
import com.skcet.flightbooking.repository.PassengerRepository;

public class PassengerService {
@Autowired
private PassengerRepository passengerRepository;
	//JPQL
	
//		public List<FlightEntity> getAllPassengersUsingJPQL(){
//			return passengerRepository.getAllPassengersUsingJPQL();
//		}
	    public String updateinfo(String type,int id1) {
	    	passengerRepository.updateinfo(type,id1);
	    	return "updated";
	    }
}
