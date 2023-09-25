package com.ss.adminservice.repository;

import com.ss.adminservice.entity.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus, Long> {
}