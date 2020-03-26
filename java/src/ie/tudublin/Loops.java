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
		//loop1(); // line pattern
		//loop2(); // white circles
		//loop3(); // rainbow
		//loop4(); // rainbow circles
		//loop5(); // green grid
		//loop6(); // inverted pyramid
		//loop7(); // big rainbow circles
		loop8(); // blue chess board
	}

	public void loop1() {
		int lineContact = 26;

		for(int i = 0; i < lineContact; i++) {
			float xInterval = map(i, 0, lineContact - 1, 0, width);
			float yInterval = map(i, 0, lineContact - 1, 0, height);

			line(xInterval, 0, width - xInterval, height);
			line(0, yInterval, width, height - yInterval);
		}
	}

	public void loop2() {
		int numCircles = 10;
		float size = width / numCircles; 

		for(int i = 0; i < numCircles; i++) {
			float pos = map(i, 0, numCircles, size / 2, width + (size / 2));

			ellipse(pos, height / 2, size, size);
		}
	}

	public void loop3() {
		int colourStrokes = 10;

		noStroke();

		for(int i = 0; i < colourStrokes; i++) {
			float pos = map(i, 0, colourStrokes, 0, width);
			float nextPos = map(i + 1, 0, colourStrokes, 0, width);
			float hue = map(i, 0, colourStrokes, 0, 175);

			fill(hue, 255, 255);

			rect(pos, 0, nextPos, height);
		}
	}

	public void loop4() {
		int numCircles = 10;
		float size = width / numCircles;

		background(255);
		noStroke();

		for(int i = 0; i < numCircles; i++) {
			float pos = map(i, 0, numCircles, size / 2, width + (size / 2));
			float hue = map(i, 0, numCircles, 0, 175);

			fill(hue, 255, 255);

			ellipse(pos, height / 2, size, size);
		}
	}

	public void loop5() {
		float xGap = width / 10;
		float yGap = height / 10;
		float halfXGap = xGap / 2;
		float halfYGap = yGap / 2;
		int firstNum = -5;
		int lastNum = 5;

		background(0);
		colorMode(RGB);
		stroke(0, 255, 0);
		textAlign(CENTER, CENTER);

		for(int i = firstNum; i <= lastNum; i++) {
			float xPos = map(i, firstNum, lastNum, xGap, width - xGap);
			float yPos = map(i, firstNum, lastNum, yGap, height - yGap);

			line(xPos, yGap, xPos, width - yGap);
			line(xGap, yPos, width - xGap, yPos);

			fill(255);
			text(i, xPos, halfXGap);
			text(i, halfYGap, yPos);
		}
	}

	public void loop6() {
		int numRect = 5;
		float startX = width / 4;
		float startY = height / 4;
		float rectWidth = width * 0.25f;
		float rectHeight = height * 0.05f;
		float movedBy = width * 0.025f;

		//rect(startX, startY, rectWidth, rectHeight);

		for(int i = 0; i < numRect; i++) {
			rect(startX + ((movedBy) * i), startY + ((rectHeight) * i), rectWidth - (((movedBy) * i) * 2), rectHeight);
		}
	}

	public void loop7() {
		int circlesPerRow = 10;
		int circlesPerCol = 10;
		float xSize = width / circlesPerCol;
		float ySize = height / circlesPerRow;
		float firstHue = 0;
		float lastHue = 175;
		float halfHue = lastHue / 2;
		float addHue = halfHue / circlesPerCol;

		background(255);
		noStroke();

		for(int i = 0; i < circlesPerRow; i++) {
			for(int j = 0; j < circlesPerCol; j++) {
				float xPos = map(j, 0, circlesPerCol, xSize / 2, width + (xSize / 2));
				float yPos = map(i, 0, circlesPerRow, ySize / 2, height + (ySize / 2));
				float hue = map(j, 0, circlesPerCol, firstHue, halfHue);
				hue += (i * addHue); // 1 way to create the rainbow
				fill(hue, 255, 255);
				ellipse(xPos, yPos, xSize, ySize);
			}

			/* Another way to create the rainbow
			firstHue += addHue;
			halfHue += addHue;
			*/
		}
	}

	public void loop8() {
		int squares = 20;
		float sqrH = height / squares;
		float sqrW = width / squares;

		noStroke();

		for(int i = 0; i < squares; i++) {
			for(int j = 0; j < squares; j++) {
				if(i % 2 == 0) {
					if(j % 2 == 0) fill(160, 255, 255);
					else fill(160, 255, 128);
				} else {
					if(j % 2 == 0) fill(160, 255, 128);
					else fill(160, 255, 255);
				}

				rect((j * sqrW), (i * sqrH), sqrW, sqrH);
			}
		}
	}
}