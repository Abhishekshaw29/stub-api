package com.api.simulator.stubapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.simulator.stubapi.entity.ApiDetails;


public interface ApiDetailsRepository extends JpaRepository<ApiDetails, String> {

}
