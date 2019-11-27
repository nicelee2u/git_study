package nicelee.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWordController {
    @ResponseBody
    @RequestMapping("hello")
    private String hello() {
        return "hello springboot";
    }
}
