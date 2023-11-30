package com.example.H2project.repository;

import com.example.H2project.models.Monster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonsterRepository extends JpaRepository<Monster,Long>{
}
