package metrics;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Component;

@Component
public class FeignMetrics {

    private final Counter feignRequestCounter;

    public FeignMetrics(MeterRegistry meterRegistry) {
        this.feignRequestCounter = meterRegistry.counter("feign.requests");
    }

    public void incrementRequest() {
        feignRequestCounter.increment();
    }
}