package com.nengliang.web.vo;

import java.io.Serializable;

/**
 * 请求参数信息
 * 
 * @author Dell 20200228
 */
public class WeatherVO implements Serializable {

	private static final long serialVersionUID = 5241691232948264999L;

	/**
	 * @param cityname,城市名或城市ID，如："苏州"，需要utf8
	 *            urlencode。必填
	 * @param dtype,返回数据格式：json或xml,默认json
	 * @param format,未来7天预报(future)两种返回格式，1或2，默认1
	 * @param key,在个人中心->我的数据,接口名称上方查看,必填
	 */

	private String cityname;
	private String dtype;
	private Integer format;
	private String key;

	// tostring
	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public String getDtype() {
		return dtype;
	}

	public void setDtype(String dtype) {
		this.dtype = dtype;
	}

	public Integer getFormat() {
		return format;
	}

	public void setFormat(Integer format) {
		this.format = format;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "WeatherVO [cityname=" + cityname + ", dtype=" + dtype + ", format=" + format + ", key=" + key + "]";
	}

}
