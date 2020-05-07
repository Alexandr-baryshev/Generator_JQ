package testJQ.Generator_JQ.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import testJQ.Generator_JQ.GeneratorFunc;


@RestController
public class MainController {

   @Autowired
   private GeneratorDataRepository repository;

   @Autowired
   protected MongoTemplate mongoTemplate;


   GeneratorFunc gf = new GeneratorFunc();

   @PostMapping("/data")
   public ResponseEntity<GeneratorData> createX(@RequestBody GeneratorData gd) {

      gd.setOutTxt(gf.sortFunc(gd));

      mongoTemplate.insert(gd,"GeneratorCollect" );

      return new ResponseEntity<GeneratorData>(gd, HttpStatus.OK);
   }

}