package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

       @RunWith(Cucumber.class)
          @CucumberOptions(features="C:/Users/RAKESH/Desktop/Testing/FreeCRMBDDframework/src/main/java/Features/Hook.feature",
          glue={"hookStepDefiniations"}, 
          format={"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
          monochrome=true,
          strict=true,
        dryRun=false
      // tags={"@RegressionTest" ," @SmokeTest"}
        		//tags= { " @End2End "}
          
          
     
        		  )
  
  
    public class TestRunner {
    	   
    	   
    	   //Tags---->>>  
    	   //OR : (,){"@RegressionTest , @SmokeTest"}--execute all tests tagged as @SomkeTest OR @RegressionTest
    	   //ANDed :(""){"@RegressionTest" ," @SmokeTest"}---execute all tests tagged as @SomkeTest AND @RegressionTest
    	   //NOT :(~) ("~@SomkeTest")----Test will not executed at all
    	   
    	   
    	   
    	   
       }
