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
        return "App still running: Served from " + getClass().getName();
    }

    @RequestMapping(method = GET, path = "hello/{name}")
    public String person(@PathVariable String name) {
        return "Hello " + name + "!";
    }

}
