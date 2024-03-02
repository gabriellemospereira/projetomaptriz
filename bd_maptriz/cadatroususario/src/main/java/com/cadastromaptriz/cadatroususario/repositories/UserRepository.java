package com.cadastromaptriz.cadatroususario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastromaptriz.cadatroususario.entities.User;

public interface  UserRepository extends JpaRepository<User, Long> {

}
