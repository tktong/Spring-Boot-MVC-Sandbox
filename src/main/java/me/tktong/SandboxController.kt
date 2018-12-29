package me.tktong;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SandboxController {
	@GetMapping("/")
	fun getSandbox(model: Model): String {
		return "index"
	}
}