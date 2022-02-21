package springboot.mvc.toby;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class studentController {
	@RequestMapping("/showForm")
	public String showForm(Model model){
		model.addAttribute("Student", new Student());
		return "showForm";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("Student") Student student,BindingResult br){
		System.out.println(student.getName());
		if(br.hasErrors()) {
			return "showForm";
		}else {
			return "summary";
		}
	}
}
