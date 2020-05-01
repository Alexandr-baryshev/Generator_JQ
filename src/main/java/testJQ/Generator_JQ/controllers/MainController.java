package testJQ.Generator_JQ.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// НАЧАЛО SAVE_JS
@RestController
public class MainController {

//   GeneratorFunc gf = new GeneratorFunc();




// ****** НАЧАЛО непонятной хрени ******** (непонятно что на что нужно заменить..)
private static final String template = "Hello, %s!";
   private final AtomicLong counter = new AtomicLong();

   @GetMapping("/")
   public GeneratorData gd(@RequestParam(value = "name", defaultValue = "World") String name) {
   return new GeneratorData(counter.incrementAndGet(), String.format(template, name));


// ****** КОНЕЦ непонятной хрени ********





//      if (gd.getPriRC().equals("C")) {
//         gd.setOutTxt(gf.sort_C(gd));
//      }
//      if (gd.getPriRC().equals("R")) {
//         gd.setOutTxt(gf.sort_R(gd));
//      }


   }

}