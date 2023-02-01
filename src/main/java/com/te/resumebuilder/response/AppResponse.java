package com.te.resumebuilder.response;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
@Data
public class AppResponse {
	
	private boolean success;
	private String message;
	private Object listOfObj;

}
