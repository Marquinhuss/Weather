package com.gntech.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Station {

    private String id;

    @JsonProperty("device_id")
    private String deviceId;

    private String name;

    private Location location;

}
