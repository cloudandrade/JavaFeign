package controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import service.FeignService;

@RestController
public class ApiController {

    private final FeignService feignService;

    public ApiController(FeignService feignService) {
        this.feignService = feignService;
    }

    @GetMapping("/fetch-data")
    public ResponseEntity<String> fetchData() {
        return feignService.getDataFromApi();
    }
}
