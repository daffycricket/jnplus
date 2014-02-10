package org.nla.test.nikeplus;

import java.text.MessageFormat;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

public class JNPlusAPI {
	
	/**
	 * Aggregate sports data endpoint.
	 */
	private static final String URL_AGGREGATE_SPORTS_DATA = "https://api.nike.com/me/sport?access_token={0}";
	
	/**
	 * List activities endpoint.
	 */
	private static final String URL_LIST_ACTIVITIES = "https://api.nike.com/me/sport/activities?access_token={0}";
	
	/**
	 * Activitiy detail endpoint.
	 */
	private static final String URL_ACTIVITY_DETAIL = "https://api.nike.com/me/sport/activities/{1}?access_token={0}";
	
	/**
	 * Activity GPS data endpoint.
	 */
	private static final String URL_ACTIVITES_GPS = "https://api.nike.com/me/sport/activities/{1}/gps?access_token={0}";
	
	/**
	 * Application/JSON.
	 */
	private static final String STR_APPJSON = "application/json";
	
	/**
	 * Accept header name.
	 */
	private static final String HEADER_ACCEPT = "accept";
	
	/**
	 * Access token.
	 */
	private String token;
		
	/**
	 * Json reader.
	 */
	private Gson GSON = new Gson();
		
	/**
	 * 
	 * @param accessToken
	 */
	public JNPlusAPI(String accessToken) {
		token = accessToken;
	}
	
	/**
	 * 
	 * 
	 * @return
	 * @throws Exception
	 */
	public ActivityList getMyActivities() throws Exception {
		HttpClient client = HttpClientBuilder.create().build();
		String url = MessageFormat.format(URL_LIST_ACTIVITIES, token);
		HttpGet request = new HttpGet(url);
		request.setHeader(HEADER_ACCEPT, STR_APPJSON);
		
		HttpResponse response = client.execute(request);
		String json = EntityUtils.toString(response.getEntity());
		return GSON.fromJson(json, ActivityList.class);		
	}
	
}
