package com.capg.springboot.FrontMajor.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.cg.springboot.FrontMajor.bean.Customer;

@Controller
public class JspCustomerController {

	@RequestMapping("/Invite/{email}")
	public ModelAndView getCustomer(@PathVariable String email) {
		RestTemplate rt = new RestTemplate();
		Customer p = rt.getForObject("http://localhost:9950/getcode?customer_email=" +email, Customer.class);
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", p);
		mv.setViewName("Invite");
		return mv;
	}
	@RequestMapping("/")
	public String showInvite() {
		return "Invite";

	}
	
	@RequestMapping("Invite/Success")
	public String showSuccess() {
		return "Success";

	}

}
