package com.gntech.weathertime.Json;

import java.io.InputStream;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gntech.Model.WeatherResponse;

public class WeatherDeserializeTest {

    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        try (InputStream is = WeatherDeserializeTest.class.getResourceAsStream("/com/gntech/weathertime/Json/JsonTeste.json")) {
            WeatherResponse resp = mapper.readValue(is, WeatherResponse.class);
            System.out.println("Metadata stations count: " + (resp.getMetadata()!=null && resp.getMetadata().getStations()!=null ? resp.getMetadata().getStations().size() : 0));
            System.out.println("Items count: " + (resp.getItems()!=null ? resp.getItems().size() : 0));
            if (resp.getItems()!=null && !resp.getItems().isEmpty()) {
                System.out.println("First timestamp: " + resp.getItems().get(0).getTimestamp());
                System.out.println("First reading count: " + (resp.getItems().get(0).getReadings()!=null ? resp.getItems().get(0).getReadings().size() : 0));
            }
            System.out.println("API status: " + (resp.getApiInfo()!=null ? resp.getApiInfo().getStatus() : "null"));
        }
    }

}
