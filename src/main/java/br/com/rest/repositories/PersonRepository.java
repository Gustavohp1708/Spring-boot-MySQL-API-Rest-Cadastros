package br.com.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rest.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{}
