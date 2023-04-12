package com.ram.ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ram.ms.entity.UserCredential;

import java.util.Optional;

public interface UserCredentialRepository  extends JpaRepository<UserCredential,Integer> {
    Optional<UserCredential> findByName(String username);
}