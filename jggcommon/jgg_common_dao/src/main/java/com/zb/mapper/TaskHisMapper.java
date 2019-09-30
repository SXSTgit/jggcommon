package com.zb.mapper;


import com.zb.pojo.TaskHis;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TaskHisMapper {
    public int saveTaskHis(TaskHis taskHis);

    public TaskHis getTaskHisById(@Param("id") String id);
}
