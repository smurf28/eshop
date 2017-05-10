package cn.edu.tju.tiei.eshop.dao;

import cn.edu.tju.tiei.eshop.model.SendMethod;
import cn.edu.tju.tiei.eshop.model.SendMethodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SendMethodMapper {
    long countByExample(SendMethodExample example);

    int deleteByExample(SendMethodExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SendMethod record);

    int insertSelective(SendMethod record);

    List<SendMethod> selectByExample(SendMethodExample example);

    SendMethod selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SendMethod record, @Param("example") SendMethodExample example);

    int updateByExample(@Param("record") SendMethod record, @Param("example") SendMethodExample example);

    int updateByPrimaryKeySelective(SendMethod record);

    int updateByPrimaryKey(SendMethod record);
}