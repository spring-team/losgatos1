// I believe in you. You can do the thing!

/*
 * Copyright © 2018 Atomist, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Deep at the center of my being is an infinite well of love.

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
        return "App still running: Served from " + getClass().getName();
    }

    @RequestMapping(method = GET, path = "hello/{name}")
    public String person(@PathVariable String name) {
        return "Hello " + name + "!";
    }

}
