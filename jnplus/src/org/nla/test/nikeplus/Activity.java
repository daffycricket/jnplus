package org.nla.test.nikeplus;

import java.util.List;

public class Activity {

	/**
	 * The sport activity unique identifier.
	 */
	private String activityId;
	
	/**
	 * Type of activity.
	 */
	private String activityType;
	
	/**
	 * The Activity's start time in UTC, standard ISO8601 format.
	 */
	private String startTime;
	
	/**
	 * Timezone the Activity was captured in UTC.
	 */
	private String activityTimeZone;
	
	/**
	 * Metrics summary;
	 */
	private MetricSummary metricSummary;
	
	/**
	 * The status of the activity. IE: IN_PROGRESS, COMPLETED;
	 */
	private String status;
	
	/**
	 * Device the activity was done with.
	 */
	private String deviceType;
	
	/**
	 * Extra detail User entered about the Activity.
	 */
	private List<Tag> tags;

	@Override
	public String toString() {
		return "Activity [activityId=" + activityId + ", activityType=" + activityType
				+ ", startTime=" + startTime + ", activityTimeZone="
				+ activityTimeZone + ", metricSummary=" + metricSummary
				+ ", status=" + status + ", deviceType=" + deviceType
				+ ", tags=" + tags + "]";
	}
}
