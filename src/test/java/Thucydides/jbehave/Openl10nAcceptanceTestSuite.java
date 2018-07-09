package Thucydides.jbehave;

import net.thucydides.jbehave.ThucydidesJUnitStories;

public class Openl10nAcceptanceTestSuite extends ThucydidesJUnitStories {



	public Openl10nAcceptanceTestSuite() {

		String names = System.getProperty("story.names");

		if (names != null && names != "*") {
			String[] nameArray = names.split(";");
			StringBuilder sb = new StringBuilder();
			for (String n : nameArray) {
				sb.append("**/" + n + ".story" + ";");
			}
			
			findStoriesCalled(sb.toString());
		}

	}
}
