package com.itheima.mapper.dao;

import com.itheima.mapper.pojo.Brand;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface BrandMpper extends Mapper<Brand> {
    //在线修改
    @Select("SELECT * FROM `pms_brand`")
    List<Brand> selectAll ();
}
