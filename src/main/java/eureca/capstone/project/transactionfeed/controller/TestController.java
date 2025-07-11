package eureca.capstone.project.transactionfeed.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/transaction-feed")
public class TestController {
    @GetMapping("/test")
    public String test() {
        log.info("transaction-feed test 메서드 실행");
        return "test";
    }
}
