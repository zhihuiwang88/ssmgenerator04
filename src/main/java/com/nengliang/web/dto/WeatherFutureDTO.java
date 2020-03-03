package com.nengliang.web.dto;

import java.io.Serializable;

import com.nengliang.web.entity.WeatherId;

public class WeatherFutureDTO implements Serializable{

	private static final long serialVersionUID = -1540369139265174474L;
	private String temperature;
	private String weather;
	private String wind;
	private String week;
	private String date;
	private WeatherIdDTO weatherIdDTO;
	private WeatherId weatherId;
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public String getWind() {
		return wind;
	}
	public void setWind(String wind) {
		this.wind = wind;
	}
	public String getWeek() {
		return week;
	}
	public void setWeek(String week) {
		this.week = week;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public WeatherIdDTO getWeatherIdDTO() {
		return weatherIdDTO;
	}
	public void setWeatherIdDTO(WeatherIdDTO weatherIdDTO) {
		this.weatherIdDTO = weatherIdDTO;
	}
	public WeatherId getWeatherId() {
		return weatherId;
	}
	public void setWeatherId(WeatherId weatherId) {
		this.weatherId = weatherId;
	}
	
	
	
	
}
