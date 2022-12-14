package com.jhta.mybatis.mapper.admin;

import java.util.HashMap;
import java.util.List;

import com.jhta.project.vo.PaymentVo;

public interface PaymentMapperHjy {
	public int monthlySales();
	public int annualSales();
	public List<PaymentVo> payType();
	public int month();
	public int year();
	public List<HashMap<String, Object>> salesChart();
	public List<HashMap<String, Object>> reservationRate();
	public PaymentVo find(String rid);
}
