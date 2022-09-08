package com.jhta.project.service.hotelmanage;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.mybatis.mapper.hjy.AccommodationsMapperHjy;
import com.jhta.project.vo.AccommodationsVo;


@Service
public class AccommodationsServiceHjy {
	@Autowired AccommodationsMapperHjy mapper;
	public int seq() {
		return mapper.seq();
	}
	public int insert(AccommodationsVo vo) {
		return mapper.insert(vo);
	}
}
