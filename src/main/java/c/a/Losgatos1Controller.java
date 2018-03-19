// Deep at the center of my being is an infinite well of love.

// Deep at the center of my being is an infinite well of love.

// I believe in you. You can do the thing!

// I come from the loving space of my heart, and I know that love opens all doors.

// I come from the loving space of my heart, and I know that love opens all doors.

// You are the delta in what you do, not the things you did in the past

// You're good enough, you're smart enough, and doggone it, people like you.

package c.a;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
class Losgatos1Controller {

    @RequestMapping(method = GET, path = "/")
    public String root() {
        return "App @foobar still running: Served from " + getClass().getName();
    }

    @RequestMapping(method = GET, path = "hello/{name}")
    public String person(@PathVariable String name) {
        return "Hello " + name + "!";
    }

}
