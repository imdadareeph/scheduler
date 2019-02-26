/**
 * 
 */
package com.app.scheduler.jobmanagement.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author imdadareeph
 *
 */
@RestController
public class JobErrorController implements ErrorController {

	private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public ModelAndView error() {
    	ModelAndView model = new ModelAndView();
  	  model.setViewName("errors/access_denied");
  	  return model;
    }

    public String getErrorPath() {
        return PATH;
    }

}
