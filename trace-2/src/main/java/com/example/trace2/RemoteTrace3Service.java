package com.example.trace2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * feign 接口
 */
@FeignClient(value = "trace-3",fallback = RemoteTrace3ServiceFallback.class)
@Service
public interface RemoteTrace3Service {
    @GetMapping("trace-3")
    String trace3();
}
