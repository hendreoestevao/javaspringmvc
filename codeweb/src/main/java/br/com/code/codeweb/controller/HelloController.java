package br.com.code.codeweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@Controller
public class HelloController {

	@GetMapping("/hello")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");
		mv.addObject("msg", "mensagem de controller");
		return mv;
	}
}
