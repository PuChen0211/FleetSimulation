package com.spring.uber.controller;

import com.spring.uber.domain.Message;
import org.springframework.web.bind.annotation.*;

/**
 * Created by puchen on 11/24/16.
 */
@RestController
public class HelloWorldRestConstroller {

    @RequestMapping("/")
    public String welcome() {
        return "Hello Spring Uber";
    }

    @RequestMapping(value = "/hello/{yourname}", method = RequestMethod.GET)
    public Message showMessage(@PathVariable String yourname) {
        Message msg = new Message(yourname, "Hello " + yourname);
        return msg;
    }

    /*
    @RequestMapping(value = "/hello/{yourname}", method = RequestMethod.POST)
    public Message createMessage(@PathVariable String yourname, @RequestBody Message message) {
        Message msg = new Message(yourname, "Hello POST " + yourname);
        // insert to DB
        return msg;
    }
    */
}
