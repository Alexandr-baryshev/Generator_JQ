package testJQ.Generator_JQ.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import testJQ.Generator_JQ.GeneratorFunc;


@RestController
public class MainController {

   GeneratorFunc gf = new GeneratorFunc();


private static final String template = "Hello, %s!";
   private final AtomicLong counter = new AtomicLong();

   @GetMapping("/hello")
   public GeneratorData gd(@RequestParam(value = "name", defaultValue = "World") String name) {
   return new GeneratorData(counter.incrementAndGet(), String.format(template, name));

   }

   @PostMapping("/data")
   public ResponseEntity<GeneratorData> create(@RequestBody GeneratorData gd) {


//      if (gd.getPriRC().equals("C")) {
//         gd.setOutTxt(gf.sort_C(gd));
//      }
//      if (gd.getPriRC().equals("R")) {
//         gd.setOutTxt(gf.sort_R(gd));
//      }

//      String xx = gf.sort_C(gd);

      gd.setRes(gf.sort_C(gd));

      return new ResponseEntity<GeneratorData>(gd, HttpStatus.OK);
   }

}