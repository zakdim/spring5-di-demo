package guru.springframework.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by dmitri on 2018-12-15
 */
@Controller
public class MyController {

    public String hello() {
        System.out.println("Hello!!!");

        return "foo";
    }
}
