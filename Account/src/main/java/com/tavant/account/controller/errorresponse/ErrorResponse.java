package com.tavant.account.controller.errorresponse;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {
	
	private String message;
	private List<String> details;

}
