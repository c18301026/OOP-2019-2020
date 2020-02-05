package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet {
	int playerX = 50;
	int playerY = 20;
	int playerWidth = 50;
	float bugX = random(100, 400); // 50
	float bugY = 500;

	public void settings() {
		size(500, 500);
	}

	public void setup() {
	}

	public void draw() {
                background(128);
		text("Test", 10, 10);

		drawPlayer(playerX, playerY, playerWidth);
		drawBug(bugX, bugY);

		bugY -= 0.5;

		text(bugY, 50, 50);
	}

	public void drawPlayer(int x, int y, int w) {
		stroke(0, 0, 255);
		line(x, y, x - 30, y + 30);
		line(x, y, x + 30, y + 30);
		line(x - 30, y + 30, x, y + 60);
		line(x + 30, y + 30, x, y + 60);
		line(x, y, x - 15, y + 30);
		line(x - 15, y + 30, x, y + 60);
		line(x - 30, y + 30, x + 30, y + 30);
	}

	public void drawBug(float x, float y) {
		stroke(0);
		line(x, y, x - 10, y + 30);
		line(x, y, x + 10, y + 30);
		line(x, y + 15, x - 10, y + 30);
		line(x, y + 15, x + 10, y + 30);
	}

	public void drawLaser() {
		stroke(255, 0, 255);
		line(playerX - 14, playerY + 30, playerX - 14, 500);
		line(playerX - 16, playerY + 30, playerX - 16, 500);

		stroke(255, 255, 255);
		line(playerX - 15, playerY + 30, playerX - 15, 500);
	}

	public void keyPressed() {
		if(keyCode == LEFT) {
			// System.out.println("Left arrow pressed");
			if(playerX > 0) {
				playerX -= 4;
			}
		}
		if(keyCode == RIGHT) {
			// System.out.println("Right arrow pressed");
			if(playerX < 500) {
				playerX += 4;
			}
		}
		if(keyCode == ' ') {
			// System.out.println("SPACE key pressed");
			drawLaser();
		}
	}
}