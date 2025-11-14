package com.gntech.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Metadata {

    private List<Station> stations;

    @JsonProperty("reading_type")
    private String readingType;

    @JsonProperty("reading_unit")
    private String readingUnit;

}
