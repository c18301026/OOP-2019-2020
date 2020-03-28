// Student Name: Rianlee Pineda
// Student Number: C18301026

package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class MyStarMap extends PApplet {
	public void settings() {
		size(650, 650);
	}

	public void setup() {
		loadData();
		printStars();
	}

	ArrayList<MyStar> stars = new ArrayList<MyStar>();

	public void loadData() {
		Table t = loadTable("HabHYG15ly.csv", "header");

		for(TableRow tr : t.rows()) {
			MyStar s = new MyStar(tr);
			stars.add(s);
		}
	}

	public void printStars() {
		for(MyStar s : stars) {
			System.out.println(s);
		}
	}

	public void draw() {
		gridlines();
		plotting();
	}

	public void gridlines() {
		int gap = 50;
		int halfGap = gap / 2;		

		background(0);
		stroke(128, 0, 255);
		textAlign(CENTER, CENTER);

		for(int i = -5; i < 6; i++) {
			float x = map(i, -5, 5, gap, width - gap);
			float y = map(i, -5, 5, gap, height - gap);

			line(gap, y, width - gap, y);
			line(x, gap, x, height - gap);

			text(i, halfGap, y);
			text(i, x, halfGap);
		}
	}

	public void plotting() {
		int gap = 50;

		noFill();
		textAlign(LEFT, CENTER);

		for(MyStar s : stars) {
			float x = map(s.getXG(), -5, 5, gap, width - gap);
			float y = map(s.getYG(), -5, 5, gap, height - gap);

			stroke(255, 255, 0);
			line(x, y - 3, x, y + 3);
			line(x - 3, y, x + 3, y);

			stroke(255, 0, 0);
			ellipse(x, y, s.getAbsMag(), s.getAbsMag());

			text(s.getDisplayName(), x, y);
		}
	}
}