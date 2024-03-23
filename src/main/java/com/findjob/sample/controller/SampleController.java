package com.findjob.sample.controller;

import com.findjob.sample.domain.Sample;
import com.findjob.sample.service.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class SampleController {

    private final SampleService sampleService;

    @GetMapping("/sample")
    public Sample sample(@RequestParam("id") Long id) {
        return sampleService.findById(id);
    }
}
