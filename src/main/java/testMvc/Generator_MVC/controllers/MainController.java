package testMvc.Generator_MVC.controllers;

import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class MainController {

   @GetMapping("/")
   public String generator( Model model) {
//      model.addAttribute("title", "Главная страница");

      return "generator";
   }


}