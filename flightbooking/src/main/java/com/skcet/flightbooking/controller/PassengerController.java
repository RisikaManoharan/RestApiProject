package com.skcet.flightbooking.controller;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

//import com.skcet.flightbooking.entity.FlightEntity;
import com.skcet.flightbooking.service.PassengerService;

public class PassengerController {
	@Autowired
	private PassengerService passengerService;
	//JPQL
	
//		@GetMapping("/getFlightsUsingJPQL")
//		public List<FlightEntity> getAllFlightsUsingJPQL(){
//			return passengerService.getAllFlightsUsingJPQL();
//		}
	    @PutMapping("updatepassenger/{newmail}/{old}")
	    public String updateinfo(@PathVariable String newmail,@PathVariable int old) {
	    	passengerService.updateinfo(newmail , old);
	    	return "updated";
	    }
}
