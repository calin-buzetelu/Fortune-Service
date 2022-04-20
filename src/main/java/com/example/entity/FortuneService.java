package com.example.entity;

import java.util.List;

public class FortuneService {

	private final List<String> fortuneTypeList = List.of("Football", "Basketball", "Swimming");
	private String fortuneType;

	public List<String> getFortuneTypeList() {
		return fortuneTypeList;
	}

	public String getFortuneType() {
		return fortuneType;
	}

	public void setFortuneType(String fortuneType) {
		this.fortuneType = fortuneType;
	}
}
