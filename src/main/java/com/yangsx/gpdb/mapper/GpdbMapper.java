package com.yangsx.gpdb.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 当namespace绑定接口后，可以不用写接口实现类，Mybatis会通过该绑定自动找到需要执行的SQL语句。
 */
@Mapper
@Repository
public interface GpdbMapper {
    List<Map<String,Object>> regionList(Map<String,Object> from);
}
