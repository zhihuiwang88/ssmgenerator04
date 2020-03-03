package com.nengliang.web.util;

import com.nengliang.web.dto.WeatherDTO;

/**
 * 返回数据类型
 * @author Dell
 *20200228
 */
public class WeatherDTOUtil {

	public static WeatherDTO succeedWeather(Object result) {
		WeatherDTO weatherDTO = new WeatherDTO();
		weatherDTO.setResultcode("200");
		weatherDTO.setReason("查询成功");
		weatherDTO.setError_code(0);
		weatherDTO.setResult(result);
		return weatherDTO;
	}
	public static Object errorWeather(Object result) {
		return result;
	}
	
}
