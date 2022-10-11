package com.codingdojo.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
@Controller

public class HomeController {

	@RequestMapping("/")
    public String index(Model model) {
			model.addAttribute("dojoName", "Colorado Springs");
            return "index.jsp";
    }


}
