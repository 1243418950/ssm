import com.atguigu.mybatis.mapper.DynamicSqlMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class DynamicSqlTest
{
    @Test
    public void getEmpByCondition() throws IOException {
       DynamicSqlMapper dm= SqlSessionUtils.getSqlSession().getMapper(DynamicSqlMapper.class);
        Emp e=new Emp(null,"张三",92,"男");
        List<Emp> eo=dm.getEmpByCondition(e);
        eo.forEach(emp->{
            System.out.println(emp);
        });
    }
    @Test
    public void getEmpByChoose() throws IOException {
        DynamicSqlMapper dm= SqlSessionUtils.getSqlSession().getMapper(DynamicSqlMapper.class);
        Emp e=new Emp(null,"张三",null,"男");
        List<Emp> eo=dm.getEmpByChoose(e);
        eo.forEach(emp->{
            System.out.println(emp);
        });
    }
    @Test
    public void testInsertMoreEmp() throws IOException {
        DynamicSqlMapper dm= SqlSessionUtils.getSqlSession().getMapper(DynamicSqlMapper.class);
        Emp e1=new Emp(null,"张liu",23,"男");
        Emp e2=new Emp(null,"张2",45,"男");
        Emp e3=new Emp(null,"张0",42,"男");
        List<Emp> es= Arrays.asList(e1,e2,e3);
        dm.insertMoreEmp(es);

    }
    @Test
    public void deleteMoreEmp() throws IOException {
        DynamicSqlMapper dm= SqlSessionUtils.getSqlSession().getMapper(DynamicSqlMapper.class);
       Integer[] empIds=new Integer[]{9,10};
       dm.deleteMoreEmp(empIds);

    }
}
