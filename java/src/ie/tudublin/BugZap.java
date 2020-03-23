package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet {
	float playerX;
	float playerY;
	float playerWidth;
	int playerSpeed;
	int laserTime;

	float bugX;
	float bugY;
	float bugWidth;
	int bugSpeed;

	int score = 0;

	public void settings() {
		size(640, 480);
	}

	public void setup() {
		// Default values
		playerX = width * 0.5f;
		playerY = height * 0.9f;
		playerWidth = height * 0.1f;
		playerSpeed = 10;
		int laserTime = 15;

		bugWidth = height * 0.1f;
		bugX = random(0 + bugWidth, width - bugWidth);
		bugY = height * 0.1f;
		bugSpeed = 20;
	}

	public void draw() {
		background(0);
		fill(255);
		drawPlayer(playerX, playerY, playerWidth);
		drawBug(bugX, bugY, bugWidth);
		text("Score = " + score, 20, 20);

		if((frameCount % 30) == 0) {
			if(bugX > 0 - (bugWidth * 0.5f)) bugX -= bugSpeed;
			else bugX = width + (bugWidth * 0.5f);
		}
	}

	public void drawPlayer(float x, float y, float w) {
		noFill();
		stroke(255);
		line(x - 7, y - 10, x - 7, y - 5); // left eye
		line(x + 7, y - 10, x + 7, y - 5); // right eye
		line(x - 10, y + 5, x + 10, y + 5); // mouth
		stroke(0, 255, 0);
		ellipse(x, y, w, w); // head
	}

	public void drawBug(float x, float y, float w) {
		noFill();
		stroke(255);
		line(x - 8, y - 10, x - 6, y - 5); // left eye
		line(x + 8, y - 10, x + 6, y - 5); // right eye
		line(x - 10, y + 5, x + 10, y + 5); // mouth
		stroke(255, 0, 0);
		rect(x - (w * 0.5f), y - (w * 0.5f), w, w);
	}

	public void drawLaser() {
		stroke(255);
		line(playerX, playerY - (playerWidth * 0.5f), playerX, 0);
	}

	public void keyPressed() {
		if(keyCode == LEFT) {
			if(playerX > (playerWidth * 0.5f)) playerX -= playerSpeed;
		}
		if(keyCode == RIGHT) {
			if(playerX < width - (playerWidth * 0.5f)) playerX += playerSpeed;
		}
		if(key == ' ') {
			drawLaser();

			if((playerX > bugX - (bugWidth * 0.5f)) && (playerX < bugX + (bugWidth * 0.5f))) {
				score++;
				bugX = random(0 + bugWidth, width - bugWidth);
			}
		}
	}
}