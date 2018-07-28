<<<<<<< HEAD
package com.dtdream.line.dao;

import com.dtdream.pojo.LineDetails;
import com.dtdream.pojo.LineDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LineDetailsMapper {
    long countByExample(LineDetailsExample example);

    int deleteByExample(LineDetailsExample example);

    int deleteByPrimaryKey(String id);

    int insert(LineDetails record);

    int insertSelective(LineDetails record);

    List<LineDetails> selectByExample(LineDetailsExample example);

    LineDetails selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LineDetails record, @Param("example") LineDetailsExample example);

    int updateByExample(@Param("record") LineDetails record, @Param("example") LineDetailsExample example);

    int updateByPrimaryKeySelective(LineDetails record);

    int updateByPrimaryKey(LineDetails record);
=======
package com.dtdream.line.dao;

import com.dtdream.pojo.LineDetails;
import com.dtdream.pojo.LineDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LineDetailsMapper {
    long countByExample(LineDetailsExample example);

    int deleteByExample(LineDetailsExample example);

    int deleteByPrimaryKey(String id);

    int insert(LineDetails record);

    int insertSelective(LineDetails record);

    List<LineDetails> selectByExample(LineDetailsExample example);

    LineDetails selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LineDetails record, @Param("example") LineDetailsExample example);

    int updateByExample(@Param("record") LineDetails record, @Param("example") LineDetailsExample example);

    int updateByPrimaryKeySelective(LineDetails record);

    int updateByPrimaryKey(LineDetails record);
>>>>>>> 7942b11a60b5f5a0ecd32a53572d0fd8e9ca9cb2
}