package testMvc.Generator_MVC.controllers;

import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {

   @GetMapping("/")
   public String generator( Model model) {
//      model.addAttribute("title", "Главная страница");
      return "generator";
   }
   @PostMapping("/")
   public String inputData(@RequestParam String inTxt, Model model) {
      return "";
   }
}