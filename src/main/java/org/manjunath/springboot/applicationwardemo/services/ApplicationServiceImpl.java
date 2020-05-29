package org.manjunath.springboot.applicationwardemo.services;

import org.manjunath.springboot.applicationwardemo.models.ApplicationDetail;
import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImpl implements ApplicationService {

	@Override
	public ApplicationDetail getApplicationDetails() {
		return generateAppDetails();
	}

	private ApplicationDetail generateAppDetails() {
		ApplicationDetail app = new ApplicationDetail();
		app.set_appName("Application WAR Demo");
		app.set_appVersion("1.0.0");
		app.set_appDescription("Demo project to show, how to build the Spring boot application as war project");
		
		return app;
	}

}
