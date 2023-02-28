package kz.krg.msovet.dev.springh2.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping(path = "/{userId}")
    public String getUser(@PathVariable String userId) {
        return "userId -> " + userId;
    }

    @GetMapping()
    public String getUser(@RequestParam int page,
                          @RequestParam int limit) {
        return String.format("page -> %s, limit -> %s", page,limit);
    }
}
