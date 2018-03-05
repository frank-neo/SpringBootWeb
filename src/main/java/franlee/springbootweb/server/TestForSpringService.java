package franlee.springbootweb.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import franlee.springbootweb.entity.TestForSpring;
import franlee.springbootweb.mapper.ForSpringMapper;

@Service
public class TestForSpringService {

	@Autowired
	private ForSpringMapper forSpringMapper;

	public List<TestForSpring> getAll()
	{

		return forSpringMapper.getAll();

	}

}
