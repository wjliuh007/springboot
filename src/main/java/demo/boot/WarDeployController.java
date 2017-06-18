package demo.boot;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

public class WarDeployController extends SpringBootServletInitializer{  
  
    private static final Logger logger = LoggerFactory.getLogger(WarDeployController.class);  
  
    @Override  
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {  
    	logger.debug(builder.toString());
        return builder.sources(this.getClass());  
    }  
  
}  