package com.jdc.balance_demo.balance_demo;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.jdc.balance.model.domain.entity.User.Role;

@EnableWebSecurity
public class BalanceDemoSecurityConfig{
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	SecurityFilterChain httpSecurity(HttpSecurity http) throws Exception {
		
		http.formLogin(form -> form
			    .loginPage("/signin")
	  		    .defaultSuccessUrl("/"));

		
		http.logout(logout -> logout.logoutUrl("/signout").logoutSuccessUrl("/"));
		
		http.authorizeHttpRequests(auth -> auth
				.requestMatchers("/signin", "/signup", "/").permitAll()
				.requestMatchers("/user/**").hasAnyAuthority(Role.Member.name(), Role.Admin.name())
				.requestMatchers("/admin/**").hasAuthority(Role.Admin.name())
				.anyRequest().authenticated());
		
		return http.build();
	}

}
