package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class Home {

    @Autowired
    GCMapper GCMapper;

    @GetMapping("/gc")
    public List<GCInfo> getGCInfo() {
        log.info("gc_info");
        List<GCInfo> info = GCMapper.getGCInfo();
        for (GCInfo gc : info) {
            log.info("{}", gc);
        }
        return info;
    }
}
