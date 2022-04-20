package com.example.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FootballFortune implements Fortune {

	private final List<String> fortunesList = new ArrayList<>();
	private Random random = new Random();
	private String fortune;

	public FootballFortune() {
		fortunesList.add("May your free kicks see the back of the net!");
		fortunesList.add("Your leftie is the bestie!");
		fortunesList.add("Your defenders shall tumble!");
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
