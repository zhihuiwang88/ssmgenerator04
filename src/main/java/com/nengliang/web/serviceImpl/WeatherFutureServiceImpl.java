package com.nengliang.web.serviceImpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nengliang.web.dao.WeatherFutureMapper;
import com.nengliang.web.dto.WeatherFutureDTO;
import com.nengliang.web.entity.WeatherFuture;
import com.nengliang.web.service.WeatherFutureService;


@Service
public class WeatherFutureServiceImpl implements WeatherFutureService {

	@Autowired
	private WeatherFutureMapper weatherFutureMapper;

	

	public int add(WeatherFutureDTO weatherFutureDTO) {
		WeatherFuture weatherFuture = new WeatherFuture();
		BeanUtils.copyProperties(weatherFutureDTO, weatherFuture);
		return weatherFutureMapper.insert(weatherFuture);
	}

	
	
	
	
}
