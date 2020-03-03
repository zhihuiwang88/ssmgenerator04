package com.nengliang.web.serviceImpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nengliang.web.dao.WeatherFutureMapper;
import com.nengliang.web.dao.WeatherIdMapper;
import com.nengliang.web.dto.WeatherIdDTO;
import com.nengliang.web.entity.WeatherId;
import com.nengliang.web.service.WeatherIdService;

@Service
public class WeatherIdServiceImpl implements WeatherIdService{

	@Autowired
	private WeatherIdMapper weatherIdMapper;
	
	public int addWeatherId(WeatherIdDTO weatherIdDTO) {
		WeatherId weatherId = new WeatherId();
		BeanUtils.copyProperties(weatherIdDTO, weatherId);
		return weatherIdMapper.insert(weatherId);
	}

}
