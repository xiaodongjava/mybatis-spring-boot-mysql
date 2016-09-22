package com.mybatis.sample.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybatis.sample.dao.CityDao;
import com.mybatis.sample.mapper.CitySelectMapper;
import com.mybatis.sample.mapper.HotelMapper;

@Service
public class TestService {
	@Autowired
	private CitySelectMapper citySelectMapper;

	@Autowired
	private CityDao cityDao;

	@Autowired
	private HotelMapper hotelMapper;

	public void run() {
		System.out.println("XML 接口  配置模式");
		System.out.println(this.hotelMapper.selectByCityId(1));
		System.out.println("接口 注入 模式");
		System.out.println(this.citySelectMapper.findByState("CA"));
		System.out.println("Dao xml 模式");
		System.out.println(this.cityDao.selectCityById(1));
	}

	@PostConstruct
	public void testMethod() {
		this.run();
	}

}
