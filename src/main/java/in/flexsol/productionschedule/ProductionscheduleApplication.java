package in.flexsol.productionschedule;

//import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ProductionscheduleApplication {

	
	
	public static void main(String[] args) {
		//SpringApplication.run(ProductionscheduleApplication.class, args);
		SpringApplicationBuilder appBuilder = new SpringApplicationBuilder();
		appBuilder = appBuilder.parent(RootConfig.class)//.web(WebApplicationType.NONE)
				     .child(MvcConfig.class);//.web(WebApplicationType.SERVLET);
		appBuilder.run(args);
	}
}
