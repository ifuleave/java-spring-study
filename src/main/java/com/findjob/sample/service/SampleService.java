package com.findjob.sample.service;

import com.findjob.sample.domain.Sample;
import com.findjob.sample.repository.SampleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class SampleService {

    private final SampleRepository sampleRepository;

    public Sample findById(Long id) {
        return sampleRepository.findById(id);
    }
}
