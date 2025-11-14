package com.gntech.Model;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Item {

    @JsonProperty("timestamp")
    private String timestamp;

    private List<String> readings;

}