package cn.kgc.timall.mapper;

import cn.kgc.timall.pojo.Productimage;
import cn.kgc.timall.pojo.ProductimageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductimageMapper {
    int countByExample(ProductimageExample example);

    int deleteByExample(ProductimageExample example);

    int deleteByPrimaryKey(Integer productimageId);

    int insert(Productimage record);

    int insertSelective(Productimage record);

    List<Productimage> selectByExample(ProductimageExample example);

    Productimage selectByPrimaryKey(Integer productimageId);

    int updateByExampleSelective(@Param("record") Productimage record, @Param("example") ProductimageExample example);

    int updateByExample(@Param("record") Productimage record, @Param("example") ProductimageExample example);

    int updateByPrimaryKeySelective(Productimage record);

    int updateByPrimaryKey(Productimage record);
}