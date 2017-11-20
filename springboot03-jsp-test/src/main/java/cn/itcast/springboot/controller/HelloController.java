package cn.itcast.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping("/user")
	public String user(Model model){
		/** 添加响应数据 */
		model.addAttribute("users", new String[]{"李大华","李中华","李小华"});
		/** jsp页面作为视图 */
		return "user";
	}
	
}
