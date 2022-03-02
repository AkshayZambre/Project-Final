package com.app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.pojos.Mobiles;
import com.app.pojos.Users;

public interface MobileRepository extends JpaRepository<Mobiles, Integer>{

	
//	@Query("select m from Mobiles m")
	List<Mobiles> findAll();
}//













