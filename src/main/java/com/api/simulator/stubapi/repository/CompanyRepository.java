package com.api.simulator.stubapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.simulator.stubapi.entity.Company;


public interface CompanyRepository extends JpaRepository<Company, String> {

}
