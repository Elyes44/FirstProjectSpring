package com.test.test.Repositories;

import com.test.test.entity.Abonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AbonRepo extends JpaRepository<Abonnement,Integer>{
}
