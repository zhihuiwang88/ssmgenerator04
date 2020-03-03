package com.nengliang.web.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.nengliang.web.dto.WeatherDTO;
import com.nengliang.web.dto.WeatherFutureDTO;
import com.nengliang.web.dto.WeatherIdDTO;
import com.nengliang.web.dto.WeatherSkDTO;
import com.nengliang.web.dto.WeatherTodayDTO;
import com.nengliang.web.entity.WeatherFuture;
import com.nengliang.web.entity.WeatherId;
import com.nengliang.web.entity.WeatherSk;
import com.nengliang.web.service.WeatherFutureService;
import com.nengliang.web.service.WeatherIdService;
import com.nengliang.web.service.WeatherSkService;
import com.nengliang.web.service.WeatherTodayService;
import com.nengliang.web.util.WeatherDTOUtil;

@Controller
@RequestMapping("/weather")
public class WeatherController {

	@Autowired
	private WeatherSkService weatherSkService;
	@Autowired
	private WeatherTodayService weatherTodayService;
	@Autowired 
	private WeatherIdService weatherIdService;
	@Autowired 
	private WeatherFutureService weatherFutureService;
	
	@RequestMapping(value = "/weatherThree", method = RequestMethod.POST)
	@ResponseBody
	public <T> WeatherDTO getTodayTemperatureByCity(@RequestBody WeatherDTO weatherDTO) throws Exception {

		// json对象转json串
		String skTodayFuture = JSONObject.toJSONString(weatherDTO.getResult());
		// json串转Object
		JSONObject result = JSONObject.parseObject(skTodayFuture);
		/*
		 * 当前天气，今日天气，未来7天天气,插入数据库
		 */
		try {
		WeatherSkDTO weaSk = new WeatherSkDTO();
		JSONObject weatherSk = (JSONObject) result.get("sk");
		weaSk.setHumidity((String)weatherSk.get("humidity"));
     	weaSk.setTemp((String)weatherSk.get("temp"));
     	weaSk.setTime((String)weatherSk.get("time"));
     	weaSk.setWind_direction((String)weatherSk.get("wind_direction"));
     	weaSk.setWind_strength((String)weatherSk.get("wind_strength"));
     	weatherSkService.addWeatherSk(weaSk);
		// 今日天气数据入库
     	WeatherTodayDTO weaToday = new WeatherTodayDTO();
     	JSONObject weatherToday = (JSONObject) result.get("today");
     	weaToday.setCity((String)weatherToday.get("city"));
    	weaToday.setComfort_index((String)weatherToday.get("comfort_index"));
    	weaToday.setDate_y((String)weatherToday.get("date_y"));
    	weaToday.setDressing_advice((String)weatherToday.get("dressing_advice"));
    	weaToday.setDressing_index((String)weatherToday.get("dressing_index"));
    	weaToday.setDrying_index((String)weatherToday.get("drying_index"));
    	weaToday.setExercise_index((String)weatherToday.get("exercise_index"));
    	weaToday.setTemperature((String)weatherToday.get("temperature"));
    	weaToday.setTravel_index((String)weatherToday.get("travel_index"));
    	weaToday.setUv_index((String)weatherToday.get("uv_index"));
    	weaToday.setWash_index((String)weatherToday.get("wash_index"));
    	weaToday.setWeather((String)weatherToday.get("weather"));
    	weaToday.setWeek((String)weatherToday.get("week"));
    	weaToday.setWind((String)weatherToday.get("wind"));
     	// WeatherIdToday
    	WeatherIdDTO weatherIdDTO = new WeatherIdDTO();
    	JSONObject jsonObjectWeatherId = (JSONObject) weatherToday.get("weather_id");
    	weatherIdDTO.setToday_fa((String)jsonObjectWeatherId.get("fa"));		
    	weatherIdDTO.setToday_fb((String)jsonObjectWeatherId.get("fb"));
    	weatherIdService.addWeatherId(weatherIdDTO);
    	weatherTodayService.addWeatherToday(weaToday);
     	// 未来7天数据入库
    	JSONArray jsonObjectFuture = (JSONArray) result.get("future");
    	List<WeatherFutureDTO> weatherFutureDTOList =  jsonObjectFuture.toJavaList(WeatherFutureDTO.class);
    	// 方法成功1
    	WeatherFutureDTO weaFuture = new WeatherFutureDTO();
    	for (WeatherFutureDTO resultFuture : weatherFutureDTOList) {
    		weaFuture.setDate(resultFuture.getDate());
      		weaFuture.setTemperature(resultFuture.getTemperature());
         	weaFuture.setWeather(resultFuture.getWeather());
         	weaFuture.setWeek(resultFuture.getWeek());
         	weaFuture.setWind(resultFuture.getWind());
         	// 
         	WeatherIdDTO weatherIdFuture = new WeatherIdDTO();
         	WeatherId weaId = resultFuture.getWeatherId();
         	weatherIdFuture.setFuture_fa(weaId.getFa());
         	weatherIdFuture.setFuture_fb(weaId.getFb());
         	weatherIdService.addWeatherId(weatherIdFuture);
         	weatherFutureService.add(weaFuture);
		}
		} catch (Exception e) {
			System.out.println(WeatherDTOUtil.errorWeather(result));
			e.printStackTrace();
		}
    	/*// 方法成功3
    	String toJSONString = jsonObjectFuture.toJSONString(jsonObjectFuture);
    	JSONArray jSONArray = jsonObjectFuture.parseArray(toJSONString);
    	List<WeatherFutureDTO> jSONArray1 = jSONArray.toJavaList(WeatherFutureDTO.class);
    	for (WeatherFutureDTO weatherFutureDTO : jSONArray1) {
    		String temperatureFuture = weatherFutureDTO.getTemperature();
    		System.out.println("--temperatureFuture--"  + temperatureFuture);
		}
    	*/
    	
    /*	// 方法成功2
    	String toJSONString2 = jsonObjectFuture.toJSONString(jsonObjectFuture);
    	List<WeatherFutureDTO> parseArray = jsonObjectFuture.parseArray(toJSONString2, WeatherFutureDTO.class);
    	for (WeatherFutureDTO weatherFutureDTO : parseArray) {
    		String weekFuture = weatherFutureDTO.getWeek();
    		System.out.println("--weekFuture--"  + weekFuture);
		}*/
		
		
		return WeatherDTOUtil.succeedWeather(result);
	}
	
}
