package com.test.test.Repositories;


import com.test.test.entity.Inscrit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscritRepo extends JpaRepository<Inscrit,Integer> {
}
