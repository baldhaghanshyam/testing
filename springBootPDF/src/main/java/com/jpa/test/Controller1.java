
package com.jpa.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itextpdf.text.DocumentException;

@Controller
public class Controller1 {
	@RequestMapping(value = "/book", method = RequestMethod.GET)
	@ResponseBody
	public String getbook() throws DocumentException {
		Table1.createReport();
		return "table creater"; 
	}

}
