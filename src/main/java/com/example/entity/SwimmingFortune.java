package com.example.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SwimmingFortune implements Fortune {

	private final List<String> fortunesList = new ArrayList<>();
	private Random random = new Random();
	private String fortune;

	public SwimmingFortune() {
		fortunesList.add("May your freestyle be like lightning!");
		fortunesList.add("Water shall never go in your nose when you do the back stroke");
		fortunesList.add("Better train the dive!");
	}

	@Override
	public String getFortune() {
		int randomPosition = getRandomPosition();
		setFortune(fortunesList.get(randomPosition));
		return fortune;
	}

	public void setFortune(String fortune) {
		this.fortune = fortune;
	}

	private int getRandomPosition() {
		return random.nextInt(fortunesList.size());
	}
}
