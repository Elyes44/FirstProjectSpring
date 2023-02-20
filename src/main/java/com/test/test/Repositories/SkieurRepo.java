package com.test.test.Repositories;


import com.test.test.entity.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkieurRepo extends JpaRepository <Skieur,Integer> {
}
