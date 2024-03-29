package com.example.trace1;

import org.springframework.stereotype.Component;

/**
 * 简单降级 无法得知产生降级的原因
 */
@Component
public class RemoteTrace2ServiceFallback implements RemoteTrace2Service {
    @Override
    public String trace2() {
        return "Trace 2 开小差了~";
    }

    @Override
    public String dealMsg(String msg) {
        return "RRACE-2 服务异常~";
    }
}
