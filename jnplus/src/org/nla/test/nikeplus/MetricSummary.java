package org.nla.test.nikeplus;


public class MetricSummary {
	/**
	 * Number of calories burned during the Activity.
	 */
	private double calories;
	
	/**
	 * Amount of fuel gained during the Activity.
	 */
	private double fuel;
	
	/**
	 * Distance traveled during the Activity.
	 */
	private double distance;
	
	/**
	 * Number of steps taken during the Activity.
	 */
	private double steps;
	
	/**
	 * The amount of time the Activity lasted in standard ISO8601 format.
	 */
	private String duration;

	@Override
	public String toString() {
		return "MetricSummary [calories=" + calories + ", fuel=" + fuel
				+ ", distance=" + distance + ", steps=" + steps + ", duration="
				+ duration + "]";
	}
}
