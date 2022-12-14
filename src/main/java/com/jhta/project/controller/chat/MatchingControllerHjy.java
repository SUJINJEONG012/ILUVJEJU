package com.jhta.project.controller.chat;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MatchingControllerHjy {
	@GetMapping(value="hjy/chatinto")
	public String getid(HttpSession session) {
		session.setAttribute("chatid", "user1");
		return "user/chat/chatfriendadd";
	}
	@GetMapping(value="hjy/chatinto2")
	public String getid2(HttpSession session) {
		session.setAttribute("chatid", "user2");
		return "user/chat/chatfriendadd";
	}
	@GetMapping(value="hjy/reqtest")
	public String reqtest(HttpSession session) {
		session.setAttribute("chatid", "user1");
		return "user/chat/reqtest";
	}
	@GetMapping(value="hjy/reqtest2")
	public String reqtest2(HttpSession session) {
		session.setAttribute("chatid", "user2");
		return "user/chat/reqtest";
	}
}
