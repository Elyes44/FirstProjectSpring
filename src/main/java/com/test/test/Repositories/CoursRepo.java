package com.test.test.Repositories;

import com.test.test.entity.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CoursRepo extends JpaRepository<Cours,Integer> {
}





