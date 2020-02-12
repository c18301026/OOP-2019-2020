package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		
	}

	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{
		background(200);
		// firstPattern();
		// secondPattern();
		// thirdPattern();
		// fourthPattern();
		// fifthPattern();
		// sixthPattern();
		// seventhPattern();
		eigthPattern();
	}

	public void firstPattern() {
		int x1 = 500;
		int y1 = 500;
		int x2 = 0;
		int y2 = 0;

		while(x1 > -25) {
			line(x1, y1, x2, y2);

			x1 -= 25;
			x2 += 25;
		}

		while(y1 > -25) {
			line(x1, y1, x2, y2);

			y1 -= 25;
			y2 += 25;
		}
	}

	public void secondPattern() {
		int x;

		fill(255);

		for(x = 25; x < 500; x += 50) {
			ellipse(x, 250, 50, 50);
		}
	}

	public void thirdPattern() {
		int x;
		int huehuehue = 0;

		noStroke();
		colorMode(HSB);
		fill(huehuehue, 255, 255);

		for(x = 0; x < 500; x += 50) {
			rect(x, 0, 50, 500);

			huehuehue += 20;
			fill(huehuehue, 255, 255);
		}
	}

	public void fourthPattern() {
		int x;
		int huehuehue = 0;

		noStroke();
		colorMode(HSB);
		fill(huehuehue, 255, 255);

		for(x = 25; x < 500; x += 50) {
			ellipse(x, 250, 50, 50);

			huehuehue += 20;
			fill(huehuehue, 255, 255);
		}
	}

	public void fifthPattern() {
		int x, y;

		background(0);
		stroke(0, 255, 0);
		fill(0);

		// Grid
		for(x = 80; x < 380; x += 30) {
			for(y = 80; y < 380; y += 30) {
				rect(x, y, 30, 30);
			}
		}

		// Co-ordinates
		fill(255);
		int xCo = -5;
		int yCo = -5;
		int textX, textY;

		for(textX = 75; textX < 405; textX += 30) {
			text(xCo, textX, 70);
			xCo++;
		}

		for(textY = 85; textY < 415; textY += 30) {
			text(yCo, 60, textY);
			yCo++;
		}
	}

	public void sixthPattern() {
		int rectX = 70;
		int rectY = 70;
		int width = 125;
		int height = 25;
		int num = 5;

		while(num != 0) {
			rect(rectX, rectY, width, height);

			rectX += 10;
			rectY += height;
			width -= 20;

			num--;
		}
	}

	public void seventhPattern() {
		int row, col;
		int huehuehue = 0;
		int nextRowStartHue = 0;

		noStroke();
		colorMode(HSB);

		for(col = 25; col < 525; col += 50) {
			for(row = 25; row < 525; row += 50) {
				fill(huehuehue, 255, 255);

				ellipse(row, col, 50, 50);

				huehuehue += 10;
			}

			huehuehue = nextRowStartHue;

			nextRowStartHue += 10;
		}
	}

	public void eigthPattern() {
		int x, y;
		int num = 0;

		colorMode(HSB);
		noStroke();

		for(x = 0; x < 500; x += 25) {
			for(y = 0; y < 500; y += 25) {
				if(num % 2 == 0) {
					fill(160, 255, 255);
				} else {
					fill(160, 255, 128);
				}

				rect(y, x, 25, 25);

				num++;
			}

			num++;
		}
	}
}
