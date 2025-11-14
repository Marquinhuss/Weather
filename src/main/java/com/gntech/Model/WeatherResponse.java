package com.gntech.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "Weather")
public class WeatherResponse {

    @Id
    private Long id;
    
    private Metadata metadata;

    private List<Item> items;

    @JsonProperty("api_info")
    private ApiInfo apiInfo;

}
