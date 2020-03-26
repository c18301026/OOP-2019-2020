package ie.tudublin;

public class Main
{
	public void bugZap() {
		String[] a = {"MAIN"};
		processing.core.PApplet.runSketch(a, new BugZap());
	}

	public void loops() {
		String[] a = {"MAIN"};
		processing.core.PApplet.runSketch(a, new Loops());
	}

	public void arraysExample() {
		String[] a = {"MAIN"};
		processing.core.PApplet.runSketch(a, new ArraysExample());
	}

	public static void main(String[] arg) {
		//Main main = new Main();
		//main.arraysExample();

		PitchSpeller ps = new PitchSpeller();
		System.out.println(ps.spell(330));
		System.out.println(ps.spell(420));
		System.out.println(ps.spell(1980));
	}
}