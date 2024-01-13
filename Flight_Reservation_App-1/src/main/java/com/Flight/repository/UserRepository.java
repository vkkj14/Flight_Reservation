package com.Flight.repository;




import org.springframework.data.jpa.repository.JpaRepository;


import com.Flight.entity.User;
public interface UserRepository extends JpaRepository<User, Long>{
User findByEmail(String emailId);



}