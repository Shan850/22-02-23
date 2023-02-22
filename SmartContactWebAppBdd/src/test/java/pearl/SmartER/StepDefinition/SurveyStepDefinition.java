package pearl.SmartER.StepDefinition;

import java.io.IOException;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pearl.SmartER.TestMethods.BaseClassMain;
import pearl.SmartER.TestMethods.SurveyPage_TestMethods;

@RunWith(Cucumber.class)
public class SurveyStepDefinition extends BaseClassMain{

	// Scenario-1: Verify User is able to view survey button
	@Given("Go to Specified url of the application")
	public void Go_to_Specified_url_of_the_application() {
		//Initialize the Driver
		driver = initializeDriver();
	}

	@When("User Enter into the Homepage of the Application")
	public void User_Enter_into_the_Homepage_of_the_Application() throws IOException, InterruptedException {
		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Navigating the SmartER Homepage
		stm.navigatetoHomePage();
	}

	@Then("Verify user is able to view Survey Button")
	public void verify_user_is_able_to_view_survey_button() throws IOException, InterruptedException {
		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Verify User is able to view survey Button
		stm.verifySurveyButtonIsVisible();
		driver.close();

	}

	//Scenario-2: Verify Whether User is able to enter Question Bank
	
	@Given("Go to Speficified URL of the application")
	public void Go_to_Speficified_URL_of_the_application() {
		//Initialize the Driver
		driver = initializeDriver();
	}

	@When("User Enter Into the Homepage of the Application")
	public void User_Enter_Into_the_Homepage_of_the_Application() throws IOException, InterruptedException {
		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Navigating the SmartER Homepage
		stm.navigatetoHomePage();
	}

	@Then("Verify User is able to enter Question Bank")
	public void verify_user_is_able_to_enter_question_bank() throws InterruptedException, IOException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);
		
		//Verify User in the Quesiton Bank Page
		stm.verifyUserintheQuestionBankPage();
		
		//Close the driver
		driver.close();
	}

	//Scenario-3: Verify Whether User is able to enter Question Bank
	@Given("Go To Specified URL of the application")
	public void Go_To_Specified_URL_of_the_application() {
		//Initialize the Driver
		driver = initializeDriver();
		
	}

	@When("User Enter Into The Homepage of the Application")
	public void User_Enter_Into_The_Homepage_of_the_Application() throws IOException, InterruptedException {
		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Navigating the SmartER Homepage
		stm.navigatetoHomePage();
		
	}

	@Then("Verify User is able to enter Add From Warehouse")
	public void verify_user_is_able_to_enter_add_from_warehouse() throws InterruptedException {
		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);
		
		//Verify User in the Ware House Page
		stm.verifyUserInTheWarehouse();
		
		//Close the Driver
		driver.close();
	}


}
