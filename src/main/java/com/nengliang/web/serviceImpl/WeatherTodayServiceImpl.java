package com.nengliang.web.serviceImpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nengliang.web.dao.WeatherTodayMapper;
import com.nengliang.web.dto.WeatherTodayDTO;
import com.nengliang.web.entity.WeatherToday;
import com.nengliang.web.service.WeatherTodayService;

@Service
public class WeatherTodayServiceImpl implements WeatherTodayService {

	@Autowired
	private WeatherTodayMapper weatherTodayMapper;

	public int addWeatherToday(WeatherTodayDTO weatherTodayDTO) {
		WeatherToday weatherToday = new WeatherToday();
		BeanUtils.copyProperties(weatherTodayDTO, weatherToday);
		return weatherTodayMapper.insert(weatherToday);
	}

}
