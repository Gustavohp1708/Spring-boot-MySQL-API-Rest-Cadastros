package br.com.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rest.model.PersonVO;

public interface PersonRepository extends JpaRepository<PersonVO, Long>{}
