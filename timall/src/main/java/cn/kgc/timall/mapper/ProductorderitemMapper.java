package cn.kgc.timall.mapper;

import cn.kgc.timall.pojo.Productorderitem;
import cn.kgc.timall.pojo.ProductorderitemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductorderitemMapper {
    int countByExample(ProductorderitemExample example);

    int deleteByExample(ProductorderitemExample example);

    int deleteByPrimaryKey(Integer productorderitemId);

    int insert(Productorderitem record);

    int insertSelective(Productorderitem record);

    List<Productorderitem> selectByExample(ProductorderitemExample example);

    Productorderitem selectByPrimaryKey(Integer productorderitemId);

    int updateByExampleSelective(@Param("record") Productorderitem record, @Param("example") ProductorderitemExample example);

    int updateByExample(@Param("record") Productorderitem record, @Param("example") ProductorderitemExample example);

    int updateByPrimaryKeySelective(Productorderitem record);

    int updateByPrimaryKey(Productorderitem record);
}