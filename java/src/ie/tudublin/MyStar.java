package ie.tudublin;

import processing.data.TableRow;

public class MyStar {
	private boolean hab;
	private String displayName;
	private float distance;
	private float xG, yG, zG;
	private float absMag;

	public void setHab(boolean hab) {
		this.hab = hab;
	}

	public boolean getHab() {
		return hab;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

	public float getDistance() {
		return distance;
	}

	public void setXG(float xG) {
		this.xG = xG;
	}

	public float getXG() {
		return xG;
	}

	public void setYG(float yG) {
		this.yG = yG;
	}

	public float getYG() {
		return yG;
	}

	public void setZG(float zG) {
		this.zG = zG;
	}

	public float getZG() {
		return zG;
	}

	public void setAbsMag(float absMag) {
		this.absMag = absMag;
	}

	public float getAbsMag() {
		return absMag;
	}

	public MyStar(boolean hab, String displayName, float distance, float xG, float yG, float zG, float absMag) {
		this.hab = hab;
		this.displayName = displayName;
		this.distance = distance;
		this.xG = xG;
		this.yG = yG;
		this.zG = zG;
		this.absMag = absMag;
	}

	public MyStar() {
		this(false, "", 0, 0, 0, 0, 0);
	}

	public MyStar(TableRow tr) {
		this(
			tr.getInt("Hab?") == 1,
			tr.getString("Display Name"),
			tr.getFloat("Distance"),
			tr.getFloat("Xg"),
			tr.getFloat("Yg"),
			tr.getFloat("Zg"),
			tr.getFloat("AbsMag")
		);
	}

	public String toString() {
		return hab + "\t" + displayName + "\t" + distance + "\t" + xG + "\t" + yG + "\t" + zG + "\t" + absMag; 
	}
}