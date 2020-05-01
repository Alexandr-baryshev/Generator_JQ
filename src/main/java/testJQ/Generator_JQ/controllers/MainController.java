package testJQ.Generator_JQ.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {

//   GeneratorFunc gf = new GeneratorFunc();


private static final String template = "Hello, %s!";
   private final AtomicLong counter = new AtomicLong();

   @GetMapping("/hello")
   public GeneratorData gd(@RequestParam(value = "name", defaultValue = "World") String name) {
   return new GeneratorData(counter.incrementAndGet(), String.format(template, name));



//      if (gd.getPriRC().equals("C")) {
//         gd.setOutTxt(gf.sort_C(gd));
//      }
//      if (gd.getPriRC().equals("R")) {
//         gd.setOutTxt(gf.sort_R(gd));
//      }


   }

}