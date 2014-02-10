package org.nla.test.nikeplus;


import java.util.List;

public class ActivityList {

	/**
	 * The activities.
	 */
	private List<Activity> data;
	
	/**
	 * Paging details of the list;
	 */
	private Paging paging;

	@Override
	public String toString() {
		return "ActivityList [data=" + data + ", paging=" + paging + "]";
	}
}
