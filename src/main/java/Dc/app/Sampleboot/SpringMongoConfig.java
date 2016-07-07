package Dc.app.Sampleboot;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.WriteConcern;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * Spring MongoDB configuration file
 *
 */
@Configuration
public class SpringMongoConfig extends AbstractMongoConfiguration {


    @Value("${mongo.server.name}")
    String mongoServerName;

    @Value("${mongo.database.name}")
    String mongoDatabaseName;

    @Value("${mongo.maxConnection}")
    Integer maxConnection;

    @Value("${mongo.username}")
    String userName;

    @Value("${mongo.password}")
    String password;

    @Override
    protected String getDatabaseName() {
        return mongoDatabaseName;
    }

    @Override
    public Mongo mongo() throws Exception {
        MongoClientOptions.Builder builder = new MongoClientOptions.Builder();
        MongoClientOptions options = builder.connectionsPerHost(maxConnection).build();

        MongoClient client = new MongoClient(mongoServerName,options);
        client.setWriteConcern(WriteConcern.SAFE);
        return client;
    }

    public @Bean
    MongoTemplate mongoTemplate() throws Exception {
        MongoTemplate mongoTemplate = new MongoTemplate(mongo(), getDatabaseName(),new UserCredentials(userName,password));
//        mongoTemplate.setWriteResultChecking(WriteResultChecking.EXCEPTION);
        return mongoTemplate;
    }

}