package com.jsp.ecommerce.util;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.jsp.ecommerce.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@RequiredArgsConstructor
public class AdminAccountCreation implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		
	}
	
}
