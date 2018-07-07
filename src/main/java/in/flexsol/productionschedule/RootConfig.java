package in.flexsol.productionschedule;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages={"in.flexsol.productionschedule.dao","in.flexsol.productionschedule.delegate"})
public class RootConfig {	
//	@Bean
//	public DataSource dataSource() {
//		  return DataSourceBuilder
//			        .create()
//			        .username("root")
//			        .password("")
//			        .url("jdbc:mysql://localhost:3306/test")
//			        .driverClassName("com.mysql.jdbc.Driver")
//			        .build();
//	}
	
}
