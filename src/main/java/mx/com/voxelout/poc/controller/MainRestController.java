package mx.com.voxelout.poc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {
    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }
}
