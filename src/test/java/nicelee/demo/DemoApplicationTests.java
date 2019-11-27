package nicelee.demo;

import nicelee.demo.entity.student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    student student;

    @Test
    void contextLoads() {
        System.out.println(student);
    }

}
