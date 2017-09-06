package com.zycus.ttt.model;

import java.util.List;

public class TTTResponse {

	private List<Error> errors;
	
	private boolean success;

	public List<Error> getErrors() {
		return errors;
	}

	public void setErrors(List<Error> errors) {
		this.errors = errors;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	
	
}
