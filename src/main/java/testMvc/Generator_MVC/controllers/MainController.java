package testMvc.Generator_MVC.controllers;

import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MainController {

   @GetMapping("/")
   public String generator( Model model) {
      model.addAttribute("title", "Главная rrr");
      model.addAttribute("sett", new Sett());

      return "generator";
   }

   @RequestMapping(value = "/calc",  method = RequestMethod.POST)
   public String generator2(@ModelAttribute Sett sett, Model model) {
      model.addAttribute("title", "Передали данные");



      sett.setOutTxt(sett.getR_St() + sett.getR_St() + " " + sett.getRC_p() + " " +  sett.getInTxt());

      return "generator";
   }
}