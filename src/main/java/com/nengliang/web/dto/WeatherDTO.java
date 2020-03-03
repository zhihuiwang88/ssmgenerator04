package com.nengliang.web.dto;

import java.io.Serializable;


/**
 * 返回数据
 * 
 * @author Dell 20200228
 */
public class WeatherDTO<T> implements Serializable {

	private static final long serialVersionUID = -8356666152033243107L;
	/**
	 * @param ,resultcode,
	 *            200
	 * @param ,reason,查询成功
	 * @param ,result,数据
	 * @param ,error_code,
	 *            0
	 */
	private String resultcode;
	private String reason;
	private T result;
	private Integer error_code;
	
	@Override
	public String toString() {
		return "WeatherDTO [resultcode=" + resultcode + ", reason=" + reason + ", result=" + result + ", error_code="
				+ error_code + "]";
	}
	public String getResultcode() {
		return resultcode;
	}
	public void setResultcode(String resultcode) {
		this.resultcode = resultcode;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public T getResult() {
		return result;
	}
	public void setResult(T result) {
		this.result = result;
	}
	public Integer getError_code() {
		return error_code;
	}
	public void setError_code(Integer error_code) {
		this.error_code = error_code;
	}
	


	

}
