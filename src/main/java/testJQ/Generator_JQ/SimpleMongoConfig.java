package testJQ.Generator_JQ;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class SimpleMongoConfig {

   //   Облачная база
//   String uri1 = "mongodb://qqT3er:qqT3er@testcluster-shard-00-00.gkafq.gcp.mongodb.net:27017,testcluster-shard-00-01.gkafq.gcp.mongodb.net:27017,testcluster-shard-00-02.gkafq.gcp.mongodb.net:27017/TestDB?ssl=true&replicaSet=atlas-1g8set-shard-0&authSource=admin&retryWrites=true&w=majority";
//   String uri2 = "mongodb+srv://qqT3er:qqT3er@testcluster.gkafq.gcp.mongodb.net/TestDB?retryWrites=true&w=majority";
//
//   @Bean
//   public MongoClientURI mongoX() {
//      return new MongoClientURI(uri2);
//   }


   //   Локальная база

   @Bean
   public MongoClient mongoX() {
      return new MongoClient("localhost");
   }

   @Bean
   public MongoTemplate mongoTemplate() throws Exception {
      return new MongoTemplate(mongoX(), "GeneratorDB");
   }

}