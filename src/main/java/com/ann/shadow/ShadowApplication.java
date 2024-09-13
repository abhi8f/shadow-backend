package com.ann.shadow;

import com.ann.shadow.console.MainLoop;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShadowApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ShadowApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		MainLoop.startMainLoop();
	}
}
