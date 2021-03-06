package testJQ.Generator_JQ.config;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class SimpleMongoConfig {



   @Bean
   public MongoClient mongoX() {
      return new MongoClient("localhost");
   }

   @Bean
   public MongoTemplate mongoTemplate() throws Exception {
      return new MongoTemplate(mongoX(), "GeneratorDB");
   }

}
