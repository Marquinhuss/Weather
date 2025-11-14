package com.gntech.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Embedded;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;

import lombok.Data;

@Entity
@Table(name = "weather_record")
@Data
public class WeatherRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   @Column(name = "payload", columnDefinition = "jsonb")
    private String payload;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
   @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "readingType", column = @jakarta.persistence.Column(name = "reading_type")),
        @AttributeOverride(name = "readingUnit", column = @jakarta.persistence.Column(name = "reading_unit"))
    })
    private Metadata metadata;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "status", column = @jakarta.persistence.Column(name = "api_status"))
    })
    private ApiInfo apiInfo;

}
