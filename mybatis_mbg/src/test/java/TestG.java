import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.junit.Test;

import java.io.IOException;

public class TestG {
    @Test
    public void t() throws IOException {
        EmpMapper em = SqlSessionUtils.getSqlSession().getMapper(EmpMapper.class);
        Emp e=em.selectByPrimaryKey(8);
        System.out.println(e);
    }
}
