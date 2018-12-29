package me.tktong;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SandboxController {
	@Autowired
	private SandboxService sandboxService;

	@RequestMapping(value = "/*")
	public String sandbox(Model model) {
		return "index";
	}
}