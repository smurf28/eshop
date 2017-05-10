package cn.edu.tju.tiei.eshop.dao;

import cn.edu.tju.tiei.eshop.model.Rank;
import cn.edu.tju.tiei.eshop.model.RankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RankMapper {
    long countByExample(RankExample example);

    int deleteByExample(RankExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(Rank record);

    int insertSelective(Rank record);

    List<Rank> selectByExample(RankExample example);

    Rank selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") Rank record, @Param("example") RankExample example);

    int updateByExample(@Param("record") Rank record, @Param("example") RankExample example);

    int updateByPrimaryKeySelective(Rank record);

    int updateByPrimaryKey(Rank record);
}