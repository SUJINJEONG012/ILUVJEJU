package com.jhta.mybatis.mapper.firstsearch;

import java.util.List;

import com.jhta.project.vo.FavoritesearchVo_kjy;

public interface FavoritesearchMapperkjy {
	List<FavoritesearchVo_kjy> hotelsearch(String hotel);
	List<FavoritesearchVo_kjy> airportsearch(String portname);
	List<FavoritesearchVo_kjy> airlinesearch(String airname);
}
