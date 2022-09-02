package com.example.osfix.repository;

import com.example.osfix.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ApplicationRepository extends JpaRepository<Application, Long> {
    List<Application> findAllByClientId(Long clientId);
}
