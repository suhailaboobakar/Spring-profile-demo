package in.strikes.profileDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/demo")
public class DemoController {
    @Value("${app.welcome.message}")
    private String message;

    @Value("${app.welcome.code}")
    private String code;

    @GetMapping("/greet")
    public ResponseEntity<String> greet(){
        return ResponseEntity.ok(message + " : " + code);
    }

}
