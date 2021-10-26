package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/* 
 @author user
 클래스(타입) 단독 매핑
*/

@Controller
@RequestMapping("/guestbook/*")
public class GuestbookController {
	
	@ResponseBody
	@RequestMapping  //url이 없는경우 클래스 이름으로 대체
 	public String list() {
		return "GuestbookController.list()";
	}
	
	@ResponseBody
	@RequestMapping  //url이 없는경우 클래스 이름으로 대체
 	public String delete() {
		return "GuestbookController.delete()";
	}
}
