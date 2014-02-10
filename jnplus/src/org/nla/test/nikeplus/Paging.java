package org.nla.test.nikeplus;


public class Paging {

	/**
	 * The URI and query parameters for the next page of results in the list.
	 */
	private String next;
	
	/**
	 * The URI and query parameters for the previous page of results in the list.
	 */
	private String previous;

	@Override
	public String toString() {
		return "Paging [next=" + next + ", previous=" + previous + "]";
	}
}
