package com.gntech.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WeatherResponse {

    private Metadata metadata;

    private List<Item> items;

    @JsonProperty("api_info")
    private ApiInfo apiInfo;

}
