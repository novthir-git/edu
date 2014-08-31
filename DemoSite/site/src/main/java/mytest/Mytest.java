package mytest;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Mytest {
	@RequestMapping(value="/s/t")
	public ModelAndView tt(HttpServletRequest request, HttpServletResponse response){
		    System.out.println("啊啊啊啊");
		    ModelAndView model = new ModelAndView();
		    model.setViewName("xx/xxx");
		    request.setAttribute("tt", "11111111111111");
		    
			return model;
		
	}
	
	@RequestMapping(value="/s/y")
	public ModelAndView yy(HttpServletRequest request, HttpServletResponse response){
		    System.out.println("啊啊啊啊");
		    ModelAndView model = new ModelAndView();
		    model.setViewName("views/cc");
		    request.setAttribute("tt", "11111111111111");
		    
			return model;
		
	}
	
	@RequestMapping(value="/s/z")
	public ModelAndView zz(HttpServletRequest request, HttpServletResponse response){
		    System.out.println("啊啊啊啊");
		    ModelAndView model = new ModelAndView();
		    model.setViewName("views/zz");
		    request.setAttribute("tt", "11111111111111");
		    
			return model;
		
	}

}
