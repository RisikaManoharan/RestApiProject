package com.skcet.flightbooking.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.skcet.flightbooking.entity.PassengerEntity;

import jakarta.transaction.Transactional;

public interface  PassengerRepository extends JpaRepository<PassengerEntity,Integer>{
	 @Modifying
	    @Transactional
	    @Query(value="update passenger_entity set passenegr_mail=?1 where passenger_id=?2",nativeQuery = true)
	    public int updateinfo(String newmail,int oldid);
}