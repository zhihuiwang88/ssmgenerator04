package com.nengliang.web.serviceImpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nengliang.web.dao.WeatherSkMapper;
import com.nengliang.web.dto.WeatherSkDTO;
import com.nengliang.web.entity.WeatherSk;
import com.nengliang.web.service.WeatherSkService;

@Service
public class WeatherSkServiceImpl implements WeatherSkService {

	@Autowired
	private WeatherSkMapper weatherSkMapper;

	public int addWeatherSk(WeatherSkDTO weatherSkDTO) {
		WeatherSk weatherSk = new WeatherSk();
		BeanUtils.copyProperties(weatherSkDTO, weatherSk);
		return weatherSkMapper.insert(weatherSk);
	}

	
	
}
