package com.ibm.Dbs.repository;

import com.ibm.Dbs.entity.HistoricalEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoricalEventRepository extends JpaRepository<HistoricalEvent, Long> {
    //
}