package com.opteamix.spring.mvc;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.AbstractController;
@Controller
public class CourseController {// extends AbstractController{
	/*public static void main(String[] args) {
		CourseService cours = new CourseService();
		ArrayList<String> alloop = cours.getCourses();
		Iterator<String> it = alloop.iterator();
		while(it.hasNext()){
			String st = it.next();
			System.out.println("String : "+st);
		}
	}*/
	@Autowired
	private CourseService courses = new CourseService();
	ArrayList<String> alloop = courses.getCourses();
	@RequestMapping("/courses.ind")
	protected ModelAndView handleRequestInternal(HttpServletRequest request,HttpServletResponse response) throws Exception {
		ModelAndView model = new ModelAndView("courses","AL",alloop);
		return model;
	}
}