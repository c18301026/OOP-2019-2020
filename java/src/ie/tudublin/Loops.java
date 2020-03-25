package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet {
	public void settings() {
		size(500, 500);
	}

	public void setup() {
		colorMode(HSB);
	}

	public void draw() {
		loop1();
	}

	public void loop1() {
		int contactOn1Side = 10;
		float interval = contactOn1Side * 0.01f;

		background(0, 0, 128);

		for(int i = 0; i < contactOn1Side; i++) {
			line(i * (width * interval ), 0, (width) - ((width * interval ) * i), height);
			line(0, (i + 1) * (height * interval ), width, (height) - ((height * interval ) * (i + 1)));
		}
	}
}