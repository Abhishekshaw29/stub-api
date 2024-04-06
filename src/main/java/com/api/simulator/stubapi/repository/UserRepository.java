package com.api.simulator.stubapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.simulator.stubapi.entity.UserDetails;



public interface UserRepository  extends JpaRepository<UserDetails, String> {

}
