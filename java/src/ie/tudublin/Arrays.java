package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet
{
	// one way to make an array
	// float[] rainfall = new float[12];

	// another way
	// no compiler error when going from int to float because no truncation error
	float[] rainfall = {45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58};

	// second way is an array of strings
	String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		for(int i = 0; i < rainfall.length; i++) {
			println(months[i] + "\t" + rainfall[i]); // in PApplet so no need for System.out.blahblahblah
		}

		// For each loop
		for(float f : rainfall) {
			println(f);
		}

		for(String s : months) {
			println(s);
		}
	}

	

	float offset = 0;

	
	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{	
		background(0);		
		colorMode(HSB);	
	}
}
