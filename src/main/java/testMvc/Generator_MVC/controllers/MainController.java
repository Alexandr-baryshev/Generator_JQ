package testMvc.Generator_MVC.controllers;

import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import testMvc.Generator_MVC.Cycle;

// НАЧАЛО SAVE_JS
@Controller
public class MainController {

   Cycle cycle = new Cycle();

   @GetMapping("/")
   public String generator( Model model) {
      model.addAttribute("title", "Главная rrr");
      model.addAttribute("sett", new Sett());

      return "generator";
   }

   @RequestMapping(value = "/calc",  method = RequestMethod.POST)
   public String generator2(@ModelAttribute Sett sett, Model model) {



      if (sett.getRC_p().equals("C")) {
         sett.setOutTxt(cycle.sort_C(sett.getInTxt(), sett.getR_St(), sett.getR_Sz(), sett.getC_St(), sett.getC_Sz()));
      }
      if (sett.getRC_p().equals("R")) {
         sett.setOutTxt(cycle.sort_R(sett.getInTxt(), sett.getR_St(), sett.getR_Sz(), sett.getC_St(), sett.getC_Sz()));
      }

      return "generator";
   }

}