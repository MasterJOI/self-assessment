package com.self_assessment.core.exceptions.custom;

import lombok.Getter;

@Getter
public class IdNotFoundException extends RuntimeException {

	public IdNotFoundException(String message) {
		super(message);
	}

}
