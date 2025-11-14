package com.gntech.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Transient;
import lombok.Data;

@Data
@Embeddable
public class Metadata {

 @Transient
    private List<String> stations;

    @JsonProperty("reading_type")
    private String readingType;

    @JsonProperty("reading_unit")
    private String readingUnit;

}