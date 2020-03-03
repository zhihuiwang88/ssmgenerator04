package com.nengliang.web.dto;

import java.io.Serializable;

public class WeatherIdDTO implements Serializable{

	
	private static final long serialVersionUID = -1826301571634962661L;
	
	private String today_fa;
	private String today_fb;
	private String future_fa;
	private String future_fb;
	private String fa;
	private String fb;
	
	public String getFa() {
		return fa;
	}
	public void setFa(String fa) {
		this.fa = fa;
	}
	public String getFb() {
		return fb;
	}
	public void setFb(String fb) {
		this.fb = fb;
	}
	public String getToday_fa() {
		return today_fa;
	}
	public void setToday_fa(String today_fa) {
		this.today_fa = today_fa;
	}
	public String getToday_fb() {
		return today_fb;
	}
	public void setToday_fb(String today_fb) {
		this.today_fb = today_fb;
	}
	public String getFuture_fa() {
		return future_fa;
	}
	public void setFuture_fa(String future_fa) {
		this.future_fa = future_fa;
	}
	public String getFuture_fb() {
		return future_fb;
	}
	public void setFuture_fb(String future_fb) {
		this.future_fb = future_fb;
	}
	
	
	
}
