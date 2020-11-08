package com.currencyfair.codechallenge.interceptor;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.OncePerRequestFilter;

@Configuration
public class CORSFilterConfig {
	static class CORSFilter extends OncePerRequestFilter {

		@Override
		protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
				FilterChain filterChain) throws ServletException, IOException {
			response.setHeader("Access-Control-Allow-Origin", "*");
			filterChain.doFilter(request, response);
		}
	}

	@Bean
	public FilterRegistrationBean corsFilter() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new CORSFilter());
		return registration;
	}

}
