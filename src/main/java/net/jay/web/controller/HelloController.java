package net.jay.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangjie on 5/10/14 3:02 PM.
 */

@Controller
public class HelloController {

    @RequestMapping("/accounts/{accountId}")
    public String hello(@PathVariable String accountId, Map<String, Object> hello) {

        hello.put("accountId", accountId);
        hello.put("message", "Winter is coming");

        return "hello";
    }
}
