package mapper;

import java.util.List;
import model.TbSpecialTopic;
import model.TbSpecialTopicExample;
import org.apache.ibatis.annotations.Param;

public interface TbSpecialTopicMapper {
    int countByExample(TbSpecialTopicExample example);

    int deleteByExample(TbSpecialTopicExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSpecialTopic record);

    int insertSelective(TbSpecialTopic record);

    List<TbSpecialTopic> selectByExample(TbSpecialTopicExample example);

    TbSpecialTopic selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSpecialTopic record, @Param("example") TbSpecialTopicExample example);

    int updateByExample(@Param("record") TbSpecialTopic record, @Param("example") TbSpecialTopicExample example);

    int updateByPrimaryKeySelective(TbSpecialTopic record);

    int updateByPrimaryKey(TbSpecialTopic record);
}