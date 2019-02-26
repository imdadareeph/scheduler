/**
 * 
 */
package com.app.scheduler.jobmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author imdadareeph
 *
 */
@Controller
public class JobController {
	
	@RequestMapping(value= {"/addjobs"}, method=RequestMethod.GET)
	 public ModelAndView scheduleJobs() {
	  ModelAndView model = new ModelAndView();
	  
	  model.setViewName("jobs/jobs");
	  return model;
	 }
	
	@RequestMapping(value= {"/", "/signin"}, method=RequestMethod.GET)
	 public ModelAndView login() {
	  ModelAndView model = new ModelAndView();
	  
	  model.setViewName("signin/signin");
	  return model;
	 }
	
	@RequestMapping(value= {"/access_denied"}, method=RequestMethod.GET)
	 public ModelAndView accessDenied() {
	  ModelAndView model = new ModelAndView();
	  model.setViewName("errors/access_denied");
	  return model;
	 }

}
