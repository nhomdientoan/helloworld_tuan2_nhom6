package springboothello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SampleRestController {
	@GetMapping("/")
	public String hello() {
		return "Hello world 22!";
	}
}
