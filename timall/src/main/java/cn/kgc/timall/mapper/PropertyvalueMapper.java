package cn.kgc.timall.mapper;

import cn.kgc.timall.pojo.Propertyvalue;
import cn.kgc.timall.pojo.PropertyvalueExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PropertyvalueMapper {
    int countByExample(PropertyvalueExample example);

    int deleteByExample(PropertyvalueExample example);

    int deleteByPrimaryKey(Integer propertyvalueId);

    int insert(Propertyvalue record);

    int insertSelective(Propertyvalue record);

    List<Propertyvalue> selectByExample(PropertyvalueExample example);

    Propertyvalue selectByPrimaryKey(Integer propertyvalueId);

    int updateByExampleSelective(@Param("record") Propertyvalue record, @Param("example") PropertyvalueExample example);

    int updateByExample(@Param("record") Propertyvalue record, @Param("example") PropertyvalueExample example);

    int updateByPrimaryKeySelective(Propertyvalue record);

    int updateByPrimaryKey(Propertyvalue record);
}