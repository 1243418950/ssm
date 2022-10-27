import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ResultMapTest {
    @Test
    public void getEmpById() throws IOException {
        EmpMapper em = SqlSessionUtils.getSqlSession().getMapper(EmpMapper.class);
        List<Emp> e = em.getEmpAndDeptByStepOne(8);
        System.out.println(e);
    }
}
