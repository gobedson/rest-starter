package com.example.oluniyin.exception;

import java.io.Serializable;

/**
 * 
 * @author gyebadokpo.ext
 *
 */
public class PostNotFoundException extends RuntimeException implements Serializable {

	private static final long serialVersionUID = -7394737910451983496L;

	public PostNotFoundException(String msg) {
		super(msg);
	}
}
