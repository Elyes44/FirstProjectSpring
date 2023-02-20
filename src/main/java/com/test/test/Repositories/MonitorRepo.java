package com.test.test.Repositories;

import com.test.test.entity.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonitorRepo extends JpaRepository <Monitor,Integer> {
}
