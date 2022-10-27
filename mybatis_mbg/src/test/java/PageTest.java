import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageInterceptor;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class PageTest {
    @Test
    public void tt() throws IOException {
        EmpMapper em= SqlSessionUtils.getSqlSession().getMapper(EmpMapper.class);
        PageHelper.startPage(5,5);
        List<Emp> es= em.selectByExample(null);
        PageInfo<Emp> info=new PageInfo<Emp>(es,5);
        es.forEach(emp -> {
            System.out.println(emp);
        });
        System.out.println(info);

    }
}
