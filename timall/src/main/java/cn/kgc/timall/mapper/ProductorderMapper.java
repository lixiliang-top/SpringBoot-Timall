package cn.kgc.timall.mapper;

import cn.kgc.timall.pojo.Productorder;
import cn.kgc.timall.pojo.ProductorderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductorderMapper {
    int countByExample(ProductorderExample example);

    int deleteByExample(ProductorderExample example);

    int deleteByPrimaryKey(Integer productorderId);

    int insert(Productorder record);

    int insertSelective(Productorder record);

    List<Productorder> selectByExample(ProductorderExample example);

    Productorder selectByPrimaryKey(Integer productorderId);

    int updateByExampleSelective(@Param("record") Productorder record, @Param("example") ProductorderExample example);

    int updateByExample(@Param("record") Productorder record, @Param("example") ProductorderExample example);

    int updateByPrimaryKeySelective(Productorder record);

    int updateByPrimaryKey(Productorder record);
}