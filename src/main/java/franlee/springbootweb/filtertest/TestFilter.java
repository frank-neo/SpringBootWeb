package franlee.springbootweb.filtertest;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.springframework.core.annotation.Order;

/**
 * 测试用的filter
 * @author 83990
 *
 */

@Order(1)
@WebFilter(filterName = "TestFilter",urlPatterns="/*")
public class TestFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException
	{
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException
	{
		// 我们执行打印（这是一个filter！）
		System.out.println("这是一个filter！");
		//执行它(chain,request,response都是方法中的形参)
		chain.doFilter(request, response);
		
	}

	@Override
	public void destroy()
	{

	}


	}
