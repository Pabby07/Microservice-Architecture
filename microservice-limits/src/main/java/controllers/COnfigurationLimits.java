package controllers;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("microservice-limits")
@Component
public class COnfigurationLimits {
	
	private int Maximum;
	private int Minimum;
	
	public int getMaximum() {
		return Maximum;
	}
	public void setMaximum(int maximum) {
		Maximum = maximum;
	}
	public int getMinimum() {
		return Minimum;
	}
	public void setMinimum(int minimum) {
		Minimum = minimum;
	}
}
