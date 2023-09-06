package com.jspider.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jspider.dto.User;
import com.jspider.repository.UserRepo;
import com.jspider.servise.UserServise;

@Controller
public class UserController {
	@Autowired
	private UserServise repo;
    private User user;
    
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home.jsp");
		return mav;
	}

	@RequestMapping("/signup")
	public ModelAndView signUp(User user) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index.jsp");
		return mav;
	}

	@RequestMapping("/save")
	public ModelAndView simpleSaver(User user) {
		ModelAndView mav = new ModelAndView();
		repo.persist(user);
		mav.setViewName("success.jsp");
		return mav;
	}
	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("login.jsp");
		return mav;
	}
	//perform Crud operations using Spring mvc Architecture in order to store and retrieve the data
	//Ana movie table 

//	   @RequestMapping("/check")
//   public ModelAndView check(@ModelAttribute User user1) {
//		ModelAndView mav=new ModelAndView();
//		User use=repo.find(user1);
//		String s=""+use.getId();
//       if(user1.getPassword()==s) {
//    	   mav.setViewName("loginsuccess.jsp");
//       }else {
//    	   mav.setViewName("loginfailed.jsp");
//       }
//       return mav;
//   }
}
