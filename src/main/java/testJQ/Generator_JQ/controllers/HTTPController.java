package testJQ.Generator_JQ.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HTTPController {

//   @GetMapping("/")
//   public String index(Model model) {
//      return "index";
//   }

   @GetMapping("/history")
   public String history(Model model) {
      return "history";
   }

   @GetMapping("/generator")
   public String generator(Model model) {
      return "generator";
   }

}
