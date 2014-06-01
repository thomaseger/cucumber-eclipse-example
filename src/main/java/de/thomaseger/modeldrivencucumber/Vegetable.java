package de.thomaseger.modeldrivencucumber;

public class Vegetable {

	private String name;
	
	private Color color;

	@Override
	public String toString() {
		return "Vegetable [name=" + name + ", color=" + color.name() + "]";
	}
	
	public Color getColor() {
		return color;
	}
	
}
