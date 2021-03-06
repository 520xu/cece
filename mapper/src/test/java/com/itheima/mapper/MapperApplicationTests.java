package com.itheima.mapper;

import com.itheima.mapper.dao.BrandMpper;
import com.itheima.mapper.pojo.Brand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MapperApplicationTests {

    @Autowired
    BrandMpper brandMpper;

    @Test
    public void contextLoads() {
        List<Brand> brands = brandMpper.selectAll();
        for (Brand brand : brands) {
            System.out.println(brand.getName());
        }
    }
    //主干添加
    //分支添加
    //dev分支
    //更新1
    //更新2
    @Test
    public void  selectAll(){
        List<Brand> brands = brandMpper.selectAll();
        for (Brand brand : brands) {
            System.out.println(brand.getName());
        }
    }

}
