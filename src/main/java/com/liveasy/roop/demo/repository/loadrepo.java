package com.liveasy.roop.demo.repository;

import com.liveasy.roop.demo.entity.Load;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface loadrepo extends JpaRepository<Load, Long> {
    List<Load> findByShipperId(String shipperId);}
