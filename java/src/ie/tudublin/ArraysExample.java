package ie.tudublin;

import java.util.Arrays; 
import java.util.Collections; 

import processing.core.PApplet;

public class ArraysExample extends PApplet
{	

	//float[] rainFall = new float[12]; 
	float[] rainFall = {45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58};
	String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

	// part 2 of lab
	float[] frequencies = {293.66f, 329.63f, 369.99f, 392.00f, 440.00f, 493.88f, 554.37f, 587.33f
			, 659.25f, 739.99f, 783.99f, 880.00f, 987.77f, 1108.73f, 1174.66f};
	String[] spellings = {"D,", "E,", "F,", "G,", "A,", "B,", "C", "D", "E", "F", "G", "A", "B","c", "d", "e", "f", "g", "a", "b", "c'", "d'", "e'", "f'", "g'", "a'", "b'", "c''", "d''"};

	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		for(int i = 0 ; i < rainFall.length; i ++)
		{
			println(months[i] + "\t" + rainFall[i]);
		}

		for(float f:rainFall)
		{
			println(f);
		}

		for(String s:months)
		{
			println(s);
		}

		int minIndex = 0;
		for(int i = 1 ; i < rainFall.length ; i ++)
		{
			if (rainFall[i] < rainFall[minIndex])
			{
				minIndex = i;
			}
		}
		println(months[minIndex] + " had the minimum rainfall of " + rainFall[minIndex]);
		
		int maxIndex = 0;
		for(int i = 1 ; i < rainFall.length ; i ++)
		{
			if (rainFall[i] > rainFall[maxIndex])
			{
				maxIndex = i;
			}
		}
		println(months[maxIndex] + " had the maximum rainfall of " + rainFall[maxIndex]);

		// You can also calculate the minimum and max of an arry this way:
		// Note the array is of type Float not float
		// Float are objects float is a primitive type
		Float[] floatArray = {10.0f, 5.0f, 20.0f};
		float min = Collections.min(Arrays.asList(floatArray)); 
        float max = Collections.max(Arrays.asList(floatArray));
	}

	void drawBarChart()
	{
		float w = width / (float) rainFall.length;
		float cGap = 255 / (float) rainFall.length;
		noStroke();
		colorMode(HSB);
		for(int i = 0 ; i < rainFall.length ; i ++)
		{
			float x = i * w;
			fill(i * cGap, 255, 255);
			rect(x, height, w, -rainFall[i]);
		}
	}

	public void graph() {
		stroke(255, 255, 255);
		// dafs = distance away from screen
		float dafs = width * 0.1f;
		float tickLength = dafs * 0.125f;

		line(dafs, dafs, dafs, height - dafs); // vertical line
		line(dafs, height - dafs, width - dafs, height - dafs); // horizontal line

		textAlign(CENTER, CENTER);

		// y-axis values
		for(int i = 0; i < 160; i += 10) {
			float y = map(i, 0, 150, height - dafs, dafs);
			line(dafs, y, dafs - tickLength, y);
			text(i, dafs / 2, y);
		}

		// x-axis values
		for(int i = 0; i < months.length; i++) {
			float x = map(i, 0, months.length - 1, dafs, width - dafs);
			line(x, height - dafs, x, (height - dafs) + tickLength);
			text(months[i], x, height - (dafs / 2));

			// blue line graph
			if(i + 1 != 12) {
				stroke(0, 255, 255);
				float y = map(rainFall[i], 0, 150, height - dafs, dafs);
				float nextX = map(i + 1, 0, months.length - 1, dafs, width - dafs);
				float nextY = map(rainFall[i + 1], 0, 150, height - dafs, dafs);

				line(x, y, nextX, nextY);
				stroke(255, 255, 255);
			}
		}
	}

	public void draw() {	
		background(0);		
		colorMode(RGB);	
		graph();
	}
}