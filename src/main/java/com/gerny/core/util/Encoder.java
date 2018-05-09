package com.gerny.core.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * springSecurit 提供的加密算法
 * @author zorro
 *
 */

public class Encoder {
	public static PasswordEncoder encoder = new BCryptPasswordEncoder();
	
	public static String encode(String rawPassword){
			return encoder.encode(rawPassword);
	}

}
