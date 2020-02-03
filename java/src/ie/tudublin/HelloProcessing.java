package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
	}

	/*
	public void draw() {
		background(0, 0, 255);
		stroke(255, 0, 0);
		fill(255, 255, 0);
		line(10, 10, 100, 100);		// x1, y1, x2, y2
		point(50, 50); // x, y
		ellipse(100, 200, 50, 150); // cx, cy, w, h
		fill(0, 255, 0);
		rect(50, 10, 100, 200); // tlx, tly, w, h
		triangle(10, 10, 100, 90, 200, 200); // vertices	
	}	
	*/

	int x = 0; // 4 bytes
	
	public void draw()
	{	
		// PROCESSING STUFF!!!

		background(255, 0, 0);
		noStroke();

		fill(255, 255, 0); // RGB 
		ellipse(250, 250, 250, 250);

		fill(0, 255, 255);
		triangle(100,350,400,350,250,100);

		fill(200);
		ellipse(250, 250, 125, 75);

		fill(0);
		ellipse(250, 250, 50, 50);

		/*
		// Background colour
		// background(255); // 0 = black, 255 = white
		background(0, 255, 0); // Red, Green, Blue

		// outline of things
		stroke(0, 0, 255);

		// How to draw a line
		line(10, 10, 100, 100); // four parameters, x1, y1, x2, y2
		point(50, 50); // x, y

		fill(0, 255, 255);

		noStroke();

		// draw circular shape
		ellipse(100, 200, 100, 50); // 4 parameters: centrex, centrey, width, height

		fill(2550, 0, 0);

		// draw rectangle
		rect(20, 150, 90, 10); // 4 parameters: topleftx, toplefty, width, height

		// draw triangle
		triangle(150, 90, 200, 100, 100, 250);
		*/
	}
}
