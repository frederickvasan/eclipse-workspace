package org.Reporting;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
public class Hooksreporting {
	public static void hooktestreporting1(String jsonFile) {

	File fl = new File("C:\\Users\\fnobl\\eclipse-workspace\\cucumbertest\\target\\cucumberreportshooks");
	
	Configuration conf = new  Configuration(fl, "FB Functionallty hooks");
	conf.addClassifications("OS", "Windows");
	conf.addClassifications("Browser", "Chrome");
	conf.addClassifications("Sprint Number", "3");
	conf.addClassifications("Test Execution Number", "4");
	
	List<String> jsonfiles = new ArrayList<String>();
	jsonfiles.add(jsonFile);
	ReportBuilder build = new ReportBuilder(jsonfiles, conf);
	
	build.generateReports();
	

}
}
	
