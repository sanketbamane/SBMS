package com.ashokit.config;

import org.springframework.context.annotation.Configuration;

import com.ashokit.util.UIManager;

@Configuration
public class AppConfig {

	public AppConfig() {
		System.out.println("** AppConfig :: Constructor **");
	}

	public UIManager getInstance() {
		System.out.println("** getInstance( ) :: Method Called");
		UIManager ui = new UIManager();
		return ui;
	}
}
