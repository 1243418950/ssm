package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {
    Emp getEmpByIdOld(@Param("empId") Integer empId);

    Emp getEmpById(@Param("empId") Integer empId);

    List<Emp> getEmpAndDeptByEmpId(@Param("empId") Integer empId);

    List<Emp> getEmpAndDeptByStepOne(@Param("empId") Integer empId);
}
