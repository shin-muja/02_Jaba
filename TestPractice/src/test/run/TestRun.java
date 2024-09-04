package test.run;

import test.model.service.TestService;

public class TestRun {
	public static void main(String[] args) {
		TestService run = new TestService();
		
		run.profile();
	}
}
