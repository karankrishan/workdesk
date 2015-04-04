package com.ui.service;

import org.simple.biz.service.LoginService;

public class UiLoginService {
	LoginService loginService = new LoginService() {

		public boolean aunthenticate(String userName) {
			return false;
		}
	};
}
