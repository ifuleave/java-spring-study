package com.findjob.sample.repository;

import com.findjob.sample.domain.Sample;
import com.findjob.sample.repository.mapper.SampleMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SampleRepository {

    private final SampleMapper sampleMapper;

    public Sample findById(Long id) {
        return sampleMapper.findById(id);
    }
}
