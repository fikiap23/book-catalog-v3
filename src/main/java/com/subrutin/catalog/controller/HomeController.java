
package com.subrutin.catalog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Kelas Controller untuk menangani permintaan terkait halaman utama.
 */
@Controller
public class HomeController {

	/**
	 * Menangani permintaan GET untuk halaman utama.
	 * 
	 * @param model objek model untuk tampilan
	 * @return nama tampilan logis untuk halaman utama
	 */
	@GetMapping("/home")
//	@RequestMapping(value = "/home",method = RequestMethod.GET)
	public String home(Model model) {
		return "home";
	}
}
