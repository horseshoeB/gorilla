package com.horseshoe.gorilla.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.horseshoe.gorilla.web.entity.Command;

public interface CommandRepository extends JpaRepository<Command, Integer> {

}
