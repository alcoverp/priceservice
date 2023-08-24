package com.bharath.springcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.springcloud.model.Price;

public interface PriceRepository extends JpaRepository<Price, Long> {
	Price findByCode(String code);
}
