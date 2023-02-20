package com.test.test.Interfaces;

import com.test.test.entity.Monitor;

import java.util.List;

public interface IMonitor {

    List<Monitor> getAllMonitor();

    Monitor createMonitor(Monitor Monitor);

    Monitor updateMonitor(long id, Monitor Monitor);

    void deleteMonitor(long id);

    Monitor getMonitorById(long id);
}
