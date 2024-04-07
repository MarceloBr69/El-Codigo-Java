package com.example.codingdojo.codigo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class home {
	@RequestMapping("/")
	public String homeMenu() {
		return "/home.jsp";
	}
	
	@PostMapping("/")
	public String codeMenu(@RequestParam(value="codigo") String codigo, RedirectAttributes redirectAttributes) {
		if(codigo.equals("bushido")) {
			return "redirect:/code"; 
		}
		else {
			redirectAttributes.addFlashAttribute("mensajeError", "El codigo ingresado es incorrecto"); 
			return "redirect:/";	
		}
	}
	
	@RequestMapping("/code")
	public String codeVew() {
		return "/code.jsp";
	}
	
}
