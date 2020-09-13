package controllers;


//@Component
public class Limits {
	
	public int maximum;
	public int minimum;
	
	
	public Limits() {
		
	}
	
	public Limits(int maximum, int minimum) {
		this.maximum = maximum;
		this.minimum = minimum;
	}
	
	
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	
	
}