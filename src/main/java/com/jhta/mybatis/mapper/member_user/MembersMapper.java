package com.jhta.mybatis.mapper.member_user;

import java.util.HashMap;

import com.jhta.project.vo.Chat_membersVo;
import com.jhta.project.vo.FavoriteVo_kjy;
import com.jhta.project.vo.MembersVo;

public interface MembersMapper {
	int insert(MembersVo vo);
	int insert2(FavoriteVo_kjy vo);
	int insert3(Chat_membersVo vo);
	MembersVo isMember(HashMap<String,String> map);
	MembersVo findId(HashMap<String,String> map);
	MembersVo checkPw(HashMap<String,String> map);
	int resetPw(MembersVo vo);
	MembersVo checkId(String mid);
	int update(MembersVo vo);
	MembersVo find(String mid);
	int delete(MembersVo vo);
}
