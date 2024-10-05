package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import feign.ExternalApiFeignClient;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@Service
public class FeignService {

    private final Counter feignRequestCounter;

    @Autowired
    private ExternalApiFeignClient feignClient;

    public FeignService(MeterRegistry meterRegistry) {
        this.feignRequestCounter = meterRegistry.counter("feign.requests");
    }

    public ResponseEntity<String> getDataFromApi() {
        feignRequestCounter.increment();
        return feignClient.getPessoa();
    }
}
