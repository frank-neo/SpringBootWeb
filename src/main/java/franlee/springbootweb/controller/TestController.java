package franlee.springbootweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import franlee.springbootweb.entity.TestForSpring;
import franlee.springbootweb.server.TestForSpringService;

@RestController
public class TestController {

	@Autowired
	private TestForSpringService testForSpringService;

	@RequestMapping("/test")
	public String TestSpringBoot()
	{
		return "LET DO SOMETHING INTERSTING!";
	}

	@RequestMapping(value = "/TestForSpring", method = RequestMethod.GET)
	public TestForSpring testForSpring()
	{

		// System.out.println(testForSpringService.getAll().get(0).getHabbit());
		TestForSpring testForSpring = testForSpringService.getAll().get(0);

		return testForSpring;
	}

	//返回所有结果（select * from那个）
	@RequestMapping(value = "/TestForSpringList", method = RequestMethod.GET)
	public List<TestForSpring> testForSpringList()
	{

		return testForSpringService.getAll();
	}
		
}
