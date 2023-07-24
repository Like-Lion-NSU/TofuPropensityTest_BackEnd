// src/main/java/com.demogroup.demoweb/Controller/HelloWorldController.java

package tofu.tofu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {
    @GetMapping("/api/hello")
    public String test() {
        return "Hello, world!";
    }
}