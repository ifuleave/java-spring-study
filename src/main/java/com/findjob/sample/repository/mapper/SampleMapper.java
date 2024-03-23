package com.findjob.sample.repository.mapper;

import com.findjob.sample.domain.Sample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SampleMapper {

    Sample findById(@Param("id") Long id);
}
