package in.flexsol.productionschedule.controllers;

import java.util.List;

import in.flexsol.productionschedule.delegate.LoginService;
import in.flexsol.productionschedule.modal.Record;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController {

	@Autowired
	LoginService loginService;
	
	
	@RequestMapping("/index")
	public ModelAndView index(HttpServletRequest request) {
				ModelAndView m = new ModelAndView();
				List<Record> records = loginService.getRecord();
				m.setViewName("index");
				return m;
	}
	
	
}
