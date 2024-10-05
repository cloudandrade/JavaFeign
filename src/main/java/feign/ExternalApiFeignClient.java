package feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "externalApi",  url = "${external.api.url}")
public interface ExternalApiFeignClient {
    @GetMapping("/pessoa")
    ResponseEntity<String> getPessoa();
}
