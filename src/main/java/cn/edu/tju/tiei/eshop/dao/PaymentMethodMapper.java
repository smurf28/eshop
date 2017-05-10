package cn.edu.tju.tiei.eshop.dao;

import cn.edu.tju.tiei.eshop.model.PaymentMethod;
import cn.edu.tju.tiei.eshop.model.PaymentMethodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentMethodMapper {
    long countByExample(PaymentMethodExample example);

    int deleteByExample(PaymentMethodExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PaymentMethod record);

    int insertSelective(PaymentMethod record);

    List<PaymentMethod> selectByExample(PaymentMethodExample example);

    PaymentMethod selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PaymentMethod record, @Param("example") PaymentMethodExample example);

    int updateByExample(@Param("record") PaymentMethod record, @Param("example") PaymentMethodExample example);

    int updateByPrimaryKeySelective(PaymentMethod record);

    int updateByPrimaryKey(PaymentMethod record);
}