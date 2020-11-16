package com.mega.mvc05;

import org.springframework.stereotype.Service;

@Service
public class AOPService {
	public void error() {
		System.err.println(3/0);
	}
}
