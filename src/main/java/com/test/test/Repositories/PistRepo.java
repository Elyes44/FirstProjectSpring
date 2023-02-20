package com.test.test.Repositories;

import com.test.test.entity.Piste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PistRepo extends JpaRepository<Piste,Integer> {

}
