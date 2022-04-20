package com.example.service;

import java.util.ArrayList;
import java.util.List;

public class FortuneService {

	private final List<String> fortuneTypeList = new ArrayList<>();
	private String fortuneType;

	public FortuneService() {
		fortuneTypeList.add("Football");
		fortuneTypeList.add("Basketball");
		fortuneTypeList.add("Swimming");
	}

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
