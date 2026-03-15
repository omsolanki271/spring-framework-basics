package com.springcore.coupling.loose_anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="com.springcore.coupling.loose_anno")
public class AppConfig {
	 	
	 /*
	 * When not use Autowired that time do this type same like xml
	 * Remove @ComponentScan and @Component All Annotation after use 
	 */
	
	/*
			@Bean
			public UserDatabaseProvider UserDataPro()
			{
				return new UserDatabaseProvider();
			}
			
			@Bean
			public WebServicesDataProvider WebDataPro()
			{
				return new WebServicesDataProvider();
			}
	*/  
	    
		/*-------------------------------------------------------*/
	    //See xml configuration and @Bean Annotation

		/*
		 * <bean id="UserData"> <constructor-arg ref="Udbprovider"/> </bean>
		 */

	    //op = 1 @Bean , op = 2 @Bean(name= {'Userdtmgr'})
		/*-----------------------------------------------------*/
	   
	/*
	    @Bean
	    public UserManager UserDatamgr() {
	        return new UserManager(Udbprovider());
	    }

	    @Bean
	    public UserManager Userweb() {
	        return new UserManager(WebProvider());
	    }
	    
	 */

}
