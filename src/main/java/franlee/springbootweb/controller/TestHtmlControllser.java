package franlee.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestHtmlControllser {
	
	//测试return到html
	@RequestMapping(value = "/TestHtml", method = RequestMethod.GET)
	public String TestHtml()
	{

		return "test"; 
	}

}
