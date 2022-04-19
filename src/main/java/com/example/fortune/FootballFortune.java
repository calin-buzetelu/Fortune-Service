package com.example.fortune;

import java.util.List;
import java.util.Random;

public class FootballFortune implements Fortune{

	private final List<String> fortunes = List.of(
			"May your free kicks see the back of the net!",
			"Your leftie is the bestie!",
			"Your defenders shall tumble!"
			);
	private Random random = new Random();

	@Override
	public String getFortune() {
		int randomPosition = getRandomPosition();
		return fortunes.get(randomPosition);
	}

	private int getRandomPosition() {
		return random.nextInt(fortunes.size());
	}
}
