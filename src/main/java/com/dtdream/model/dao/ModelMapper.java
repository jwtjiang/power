<<<<<<< HEAD
package com.dtdream.model.dao;

import com.dtdream.pojo.Model;
import com.dtdream.pojo.ModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModelMapper {
    long countByExample(ModelExample example);

    int deleteByExample(ModelExample example);

    int deleteByPrimaryKey(Integer modelid);

    int insert(Model record);

    int insertSelective(Model record);

    List<Model> selectByExample(ModelExample example);

    Model selectByPrimaryKey(Integer modelid);

    int updateByExampleSelective(@Param("record") Model record, @Param("example") ModelExample example);

    int updateByExample(@Param("record") Model record, @Param("example") ModelExample example);

    int updateByPrimaryKeySelective(Model record);

    int updateByPrimaryKey(Model record);
=======
package com.dtdream.model.dao;

import com.dtdream.pojo.Model;
import com.dtdream.pojo.ModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModelMapper {
    long countByExample(ModelExample example);

    int deleteByExample(ModelExample example);

    int deleteByPrimaryKey(Integer modelid);

    int insert(Model record);

    int insertSelective(Model record);

    List<Model> selectByExample(ModelExample example);

    Model selectByPrimaryKey(Integer modelid);

    int updateByExampleSelective(@Param("record") Model record, @Param("example") ModelExample example);

    int updateByExample(@Param("record") Model record, @Param("example") ModelExample example);

    int updateByPrimaryKeySelective(Model record);

    int updateByPrimaryKey(Model record);
>>>>>>> 7942b11a60b5f5a0ecd32a53572d0fd8e9ca9cb2
}