package com.example.securingweb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AuthenticateConfig {
  @Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
			.authorizeHttpRequests((authz) -> authz
				.requestMatchers("/", "/login").permitAll()
        .requestMatchers("/webjars/**").permitAll()
				.anyRequest().authenticated()
			)
      .formLogin((form) -> form
        .loginPage("/login")
        .permitAll()  
      )
			.logout((logout) -> logout.permitAll());
		return http.build();
	}

  @Bean
  public InMemoryUserDetailsManager userDetailsService() {
      UserDetails user = User.withDefaultPasswordEncoder()
          .username("user")
          .password("password")
          .build();

      return new InMemoryUserDetailsManager(user);
  }
}
