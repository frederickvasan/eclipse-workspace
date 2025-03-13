package org.employee;

public class StateDetails {
	 public void southIndia() {
	        System.out.println("South India consists of states like Tamil Nadu, Kerala, Karnataka, Andhra Pradesh, and Telangana.");
	    }

	    public void northIndia() {
	        System.out.println("North India includes states like Uttar Pradesh, Punjab, Haryana, Rajasthan, and Delhi.");
	    }

	    public static void main(String[] args) {
	        // Creating objects for both classes
	        LanguageInfo languageInfo = new LanguageInfo();
	        StateDetails stateDetails = new StateDetails();

	        // Calling methods from LanguageInfo class
	        languageInfo.tamilLanguage();
	        languageInfo.englishLanguage();
	        languageInfo.hindiLanguage();

	        // Calling methods from StateDetails class
	        stateDetails.southIndia();
	        stateDetails.northIndia();
	    }

}
