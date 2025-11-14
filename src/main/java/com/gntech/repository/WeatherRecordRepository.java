package com.gntech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gntech.Model.WeatherRecord;

@Repository
public interface WeatherRecordRepository extends JpaRepository<WeatherRecord, Long> {

}
