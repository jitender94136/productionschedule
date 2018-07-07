package in.flexsol.productionschedule;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;




@Configuration
@ComponentScan(basePackages={"in.flexsol.productionschedule.controllers"})
@EnableAutoConfiguration
public class MvcConfig {
	
	

	

//	    @Bean
//	    public ViewResolver viewResolver() {
//	        VelocityLayoutViewResolver bean = new VelocityLayoutViewResolver();
//	        bean.setCache(true);
//	        bean.setPrefix("classpath:/templates/velocity/");
//	        bean.setLayoutUrl("classpath:/templates/velocity/layout.vm");
//	        bean.setSuffix(".vm");
//	        return bean;
//	    }
//	     
//	    @Bean
//	    public VelocityConfigurer velocityConfig() {
//	        VelocityConfigurer velocityConfigurer = new VelocityConfigurer();
//	        velocityConfigurer.setResourceLoaderPath("/");
//	        return velocityConfigurer;
//	    }			
//	
}
