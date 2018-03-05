package franlee.springbootweb.mapper;

//应该导入 ：import java.util.*;同时检查一下有没有import其他的List.比如 java.awt.List。有的话，去掉。
import java.util.List;
import org.apache.ibatis.annotations.Select;
import franlee.springbootweb.entity.TestForSpring;

public interface ForSpringMapper {

	@Select("select * from testforspring")
	List<TestForSpring> getAll();

}
