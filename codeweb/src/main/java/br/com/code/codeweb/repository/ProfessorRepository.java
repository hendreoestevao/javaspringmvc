package br.com.code.codeweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.code.codeweb.models.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
		
}
