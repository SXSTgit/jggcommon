package com.zb.mapper;
import com.zb.pojo.Task;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TaskMapper {
    //查询一分钟之前的数据
    List<Task> findByUpdateTimeBefore();

    //查询对象
    Task findTaskById(@Param("id") String id);

    //修改的时间
    void updateTaskTime(@Param("id") String id);

    //乐观锁,防止多并发下， 同时发送同一条任务
    int updateTaskVersion(@Param(value = "id") String id, @Param(value = "version") int version);
}
