package com.example.backend.repositories;

import com.example.backend.models.entitie.Program;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramRepository extends JpaRepository<Program,Long> {
         Program findFirstByCurrent(String current);
}
