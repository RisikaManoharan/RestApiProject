package com.skcet.flightbooking.repository;


import java.util.List;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;

import com.skcet.flightbooking.entity.FlightEntity;

import jakarta.transaction.Transactional;


public interface FlightRepository extends JpaRepository<FlightEntity,Long>{
   
	      //JPQL
	
	    @Query("select f from FlightEntity f")
	   public List<FlightEntity> getAllFlightsUsingJPQL();
	    
	    
	    @Modifying
	    @Transactional
	    @Query(value="update flight_entity set class_type=?1 where flight_Id=?2",nativeQuery = true)
	    public int updateinfo(String newtype,int oldid);
	    
//	    @Modifying
//	    @Transactional
//	    @Query(value="delete from flight_entity where id=:s",nativeQuery=true)
//	    public int deleteinfo(@Param("s")int id);
}

