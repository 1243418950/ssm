import com.atguigu.mybatis.mapper.CacheMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class CacheMapperTest {
    @Test
    public void getEmpById() throws IOException {
       CacheMapper cm= SqlSessionUtils.getSqlSession().getMapper(CacheMapper.class);
        Emp e=cm.getEmpById(8);
        System.out.println(e);
        Emp e1=cm.getEmpById(8);
        System.out.println(e1);
        CacheMapper cm1= SqlSessionUtils.getSqlSession().getMapper(CacheMapper.class);
        Emp e2=cm1.getEmpById(8);
        System.out.println(e2);
        //mybatis一级缓存是sqlsession级别的
        //增删改会清空一级缓存
    }
    @Test
    public void cache() throws IOException {
       InputStream is= Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sf= new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession1 = sf.openSession(true);
        SqlSession sqlSession2 = sf.openSession(true);
        CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
        Emp e1=mapper1.getEmpById(8);
        sqlSession1.close();
        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
        Emp e2=mapper2.getEmpById(8);


    }
}
