package testJQ.Generator_JQ.controllers;

import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import testJQ.Generator_JQ.GeneratorFunc;

// НАЧАЛО SAVE_JS
@Controller
public class MainController {

   GeneratorFunc gf = new GeneratorFunc();

   @GetMapping("/")
   public String generator( Model model) {
      model.addAttribute("title", "Главная rrr");
      model.addAttribute("sett", new GeneratorData());

      return "generator";
   }

   @RequestMapping(value = "/calc",  method = RequestMethod.POST)
   public String generator2(@ModelAttribute GeneratorData gd, Model model) {



      if (gd.getPriRC().equals("C")) {
         gd.setOutTxt(gf.sort_C(gd));
      }
      if (gd.getPriRC().equals("R")) {
         gd.setOutTxt(gf.sort_R(gd));
      }

      return "generator";
   }

}