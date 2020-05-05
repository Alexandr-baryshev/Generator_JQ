package testJQ.Generator_JQ.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.net.URISyntaxException;

@Controller
public class HTTPController {

   @GetMapping("/")
   public String generator(Model model){
      return "generator";
   }

   // Не понял не капли что тут происходит (в целом как и в остальных контроллерах в рамках спринга).

   // Service, getId .. откуда это должно браться, и как происходит связь hello.js и данного (или другого) контроллера,
      // кто кого и как вызывает в себе, или как они видят друг друга и отправляют данные между собой.

   // Просто показалось, что этот код нужно создать тут, и вместо студент запихать GeneratorData, на этом все.


   @PostMapping("/")
   public ResponseEntity<GeneratorData> create(@RequestBody GeneratorData gd) throws URISyntaxException {
      GeneratorData createdGd = service.create(gd);
      if (createdGd == null) {
         return ResponseEntity.notFound().build();
      } else {
         URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                 .path("/{generator}")
                 .buildAndExpand(createdGd.getId())
                 .toUri();

         return ResponseEntity.created(uri)
                 .body(createdGd);
      }
   }
}