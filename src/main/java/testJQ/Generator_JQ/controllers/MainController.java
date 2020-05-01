package testJQ.Generator_JQ.controllers;

import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import testJQ.Generator_JQ.GeneratorFunc;

// НАЧАЛО SAVE_JS
@RestController
public class MainController {

//   GeneratorFunc gf = new GeneratorFunc();




// ****** НАЧАЛО непонятной хрени ******** (непонятно что на что нужно заменить..)
   @GetMapping("/")
   public String generator( Model model) {
      model.addAttribute("title", "Главная rrr");
      model.addAttribute("sett", new GeneratorData());

      return "generator";
   }

   @RequestMapping(value = "/calc",  method = RequestMethod.POST)
   public String generator2(@ModelAttribute GeneratorData gd, Model model) {

// ****** КОНЕЦ непонятной хрени ********





//      if (gd.getPriRC().equals("C")) {
//         gd.setOutTxt(gf.sort_C(gd));
//      }
//      if (gd.getPriRC().equals("R")) {
//         gd.setOutTxt(gf.sort_R(gd));
//      }

      return "generator";
   }

}