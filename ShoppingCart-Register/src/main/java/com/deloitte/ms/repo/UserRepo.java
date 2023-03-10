package com.deloitte.ms.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.deloitte.ms.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, String>{

//	@Query("Select * from Customer c where c.username=:username")
//	public List<User> getAllCustomersBasedOnUsername(String username);
//	@Query("Select * from Customer where username=:username")
	
//	public List<User> findByUsername(String username);
	
	@Query(value = "select * from customer where username=:username", nativeQuery =true)
	public List<User> getAllCustomerBasedOnUsername(String username);
	
}
