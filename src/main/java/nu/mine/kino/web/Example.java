package nu.mine.kino.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Example {

    @RequestMapping(method = RequestMethod.GET)
    String get() {
        return "Hello World!";
    }

    @RequestMapping(method = RequestMethod.POST)
    Map<String, Object> post() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "NAME");
        map.put("age", new Integer(40));
        return map;

    }

    @RequestMapping(method = RequestMethod.PUT)
    User put() {
        User user = new User("NAME", 40);
        return user;
    }

    public Object find(Map<String, String> params) {
        return params;
    }

}