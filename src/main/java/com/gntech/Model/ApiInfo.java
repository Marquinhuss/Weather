package com.gntech.Model;

import jakarta.persistence.Embeddable;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@Embeddable
public class ApiInfo {

	@JsonProperty("status")
	private String status;

}
