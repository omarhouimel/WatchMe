//package com.example.watchme.configuration;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//@Configuration
//@EnableWebSecurity
////@EnableGlobalMethodSecurity(securedEnabled=true)
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//	@Autowired
//	public void globalConfiguration(AuthenticationManagerBuilder auth,DataSource dataSource) throws Exception {
////		auth.jdbcAuthentication()
////			.dataSource(dataSource);
//		auth.inMemoryAuthentication().passwordEncoder(NoOpPasswordEncoder.getInstance()).withUser("admin").password("admin").roles("admin");
//		
//		
//}
////		@Override
//	protected void configure(HttpSecurity http) throws Exception {
////			http
////				.authorizeRequests()
////				.antMatchers("/login").permitAll()
////					.anyRequest()
////						.authenticated()
////							.and()
////					.formLogin()
////						.loginPage("http://localhost:4200/#/auth/login")
////							.permitAll()
////							 .defaultSuccessUrl("http://localhost:4200/#/pages/dashboard");
////	
//		
//		 http
//         .csrf().disable();
//		}
//}
