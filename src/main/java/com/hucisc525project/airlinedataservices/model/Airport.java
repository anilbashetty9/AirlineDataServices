package com.hucisc525project.airlinedataservices.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Anil Bashetty
 *
 * 
 */
@Document(collection = "airports")
public class Airport {
	@Id
	private String id;

	private String iata;
	private String airport;
	private String city;
	private String state;
	private String country;
	private String lat;
	private String longi;
	private String weatherReport;

	public String getWeatherReport() {
		return weatherReport;
	}

	public void setWeatherReport(String weatherReport) {
		this.weatherReport = weatherReport;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIata() {
		return iata;
	}

	public void setIata(String iata) {
		this.iata = iata;
	}

	public String getAirport() {
		return airport;
	}

	public void setAirport(String airport) {
		this.airport = airport;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLongi() {
		return longi;
	}

	public void setLongi(String longi) {
		this.longi = longi;
	}

}

