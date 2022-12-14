package com.jhta.project.service.hotelmanage;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.mybatis.mapper.hotelmanage.PeriodMapperHjy;
import com.jhta.mybatis.mapper.hotelmanage.Period_tempMapperHjy;
import com.jhta.project.vo.Additional_feeVo;
import com.jhta.project.vo.PeriodVo;

@Service
public class Period_tempService_hjy {
	@Autowired Period_tempMapperHjy mapper;
	public int seq() {
		return mapper.seq();
	}
	public List<PeriodVo> find(int aid) {
		List<PeriodVo> PeriodVoList = mapper.find(aid);
		return PeriodVoList;
	};
	public int insert(PeriodVo vo) {
		return mapper.insert(vo);
	};
	public int delete(int aid) {
		return mapper.delete(aid);
	};
}
