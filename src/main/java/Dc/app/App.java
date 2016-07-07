package Dc.app;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;



@SpringBootApplication
@EnableWebMvc
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"Dc.app.Sampleboot"})
public class App extends SpringBootServletInitializer{
	
	// private static Logger log = LogManager.getLogger(App.class);
	 
    public static void main( String[] args )
    {
        
        SpringApplication.run(App.class, args);
        System.out.println( "Running Sampleboot" );
    }
 }

