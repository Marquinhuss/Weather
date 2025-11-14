package com.gntech.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Reading {

	@JsonProperty("station_id")
	private String stationId;

	private double value;

}
