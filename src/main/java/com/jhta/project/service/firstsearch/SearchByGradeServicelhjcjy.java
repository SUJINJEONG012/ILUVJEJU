package com.jhta.project.service.firstsearch;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.mybatis.mapper.firstsearch.SearchByGradeMapperlhjcjy;
import com.jhta.project.vo.SearchVolhjcjy;



@Service
public class SearchByGradeServicelhjcjy {
@Autowired private SearchByGradeMapperlhjcjy mapper;

	public List<SearchVolhjcjy> getGradeSec(HashMap<String, Object> map){
		return mapper.getGradeSec(map);
	}
}
