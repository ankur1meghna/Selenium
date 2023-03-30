package page;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import invocation.BrowserInvoke;
import utility.CommonUtility;
 

public class ConditionsPage extends BrowserInvoke {

	Random random=new Random();
	
	public ConditionsPage() {
		PageFactory.initElements(finalDriver, this);
		// PageFactory.initElements(finalDriver, CircumstancesPage.class);
	}

	public void openUrl() {
		finalDriver.get(CommonUtility.getPropertyValue("./data/configuration.properties", "checkerToolCalculatorURL"));
	}

	public void clickAnalyticsCookies() {
		acceptCookies.click();
	}

	public void startNow() {
		nextButton.click();
	}
	
	public void clickCountryRadioButton(String country) {
		for (int i = 0; i < countryRadio.size(); i++) {
			if (countryRadio.get(i).getAttribute("value").trim().equalsIgnoreCase(country)) {
				countryRadio.get(i).click();
			}
		}
		nextButton.click();
	}

	public String northernIrelandNHSCheckerCostHelpOutCome() {
		CommonUtility.waitForElementToBeVisibleFastAndFluent(finalDriver, 50, checkerToolResultIreland);
		String result = checkerToolResultIreland.getText();
		return result;
	}
	
	public void selectGPPractiseOrHighLand() {
		CommonUtility.waitForElementToBeVisibleFastAndFluent(finalDriver, 100, nextButton);
		int index = random.nextInt(gpPracticeOrHighLandRadioButton.size());
		gpPracticeOrHighLandRadioButton.get(index).click();
		nextButton.click();
	}

	public void selectDentalPractiseCountry() {
		CommonUtility.waitForElementToBeVisibleFastAndFluent(finalDriver, 100, nextButton);
		int index = random.nextInt(dentalPracticeOption.size());
		dentalPracticeOption.get(index).click();
		nextButton.click();
	}

	public void enterDOB() {
		CommonUtility.waitForElementToBeVisibleFastAndFluent(finalDriver, 100, day);
		day.sendKeys(CommonUtility.generateRandomIntInRange(1, 28));
		month.sendKeys(CommonUtility.generateRandomIntInRange(1, 12));
		year.sendKeys(CommonUtility.generateRandomIntInRange(1980, 2000));
		nextButton.click();
	}

	public void clickLivePartnerRadioButton() {
		CommonUtility.waitForElementToBeVisibleFastAndFluent(finalDriver, 100, nextButton);
		int index = random.nextInt(partnerRadio.size());
		partnerRadio.get(index).click();
		nextButton.click();
	}

	public void selectTaxClaimRadioButton(String claimBenefits, String taxCredit) throws InterruptedException {
		if (claimBenefits.equalsIgnoreCase("No")) {
			taxNoRadio.click();
			nextButton.click();
		} else {
			taxYesRadio.click();
			nextButton.click();
			if (taxCredit.equalsIgnoreCase("Yes")) {
				yesUniversalRadio.click();
				nextButton.click();
				universalCreditYesRadio.click();
				nextButton.click();
				universalCreditTakeHomePayYesButton.click();
				nextButton.click();
			} else {
				notYetUniversalCreditRadioButton.click();
				nextButton.click();
			}
		}
	}
	
	public void selectPregnantRadioButton(String field) {
		CommonUtility.waitForElementToBeVisibleFastAndFluent(finalDriver, 100, nextButton);
		for (int i = 0; i < pregnantRadio.size(); i++) {
			if (pregnantRadio.get(i).getAttribute("value").equalsIgnoreCase(field)) {
				pregnantRadio.get(i).click();
			}
		}
		nextButton.click();
	}

	public void selectInjuryOrIllnessRadioButton(String war) {
		CommonUtility.waitForElementToBeVisibleFastAndFluent(finalDriver, 100, nextButton);
		for (int i = 0; i < injuryOrIllnesRadio.size(); i++) {
			if (injuryOrIllnesRadio.get(i).getAttribute("value").equalsIgnoreCase(war)) {
				injuryOrIllnesRadio.get(i).click();
			}
		}
		nextButton.click();
	}

	public void selectCustomerIsDiabetesOrNotRadioButton(String diabetes, String country) {
		CommonUtility.waitForElementToBeVisibleFastAndFluent(finalDriver, 100, nextButton);
		if(country.equalsIgnoreCase("England")||country.equalsIgnoreCase("Wales")) {
		for (int i = 0; i < diabetesRadio.size(); i++) {
			if (diabetesRadio.get(i).getAttribute("value").equalsIgnoreCase(diabetes)) {
				diabetesRadio.get(i).click();
			}
		}
		nextButton.click();
		if(country.equalsIgnoreCase("England")){
			CommonUtility.waitForElementToBeVisibleFastAndFluent(finalDriver, 100, nextButton);
			for (int i = 0; i < diabetesMedicationRadio.size(); i++) {
				if (diabetesMedicationRadio.get(i).getAttribute("value").equalsIgnoreCase("Yes")) {
					diabetesMedicationRadio.get(i).click();
				}
			}
			nextButton.click();
		}
			else if(country.equalsIgnoreCase("Wales")){
				CommonUtility.waitForElementToBeVisibleFastAndFluent(finalDriver, 100, nextButton);
				int index = random.nextInt(glaucomaRadio.size());
				glaucomaRadio.get(index).click();
				nextButton.click();
			}
		}
		else {
			System.out.print("Not eligible for Scotland");
		}
	}
	
	public void selectCareHomeOption(String permanent, String careHome) {
		if (permanent.equalsIgnoreCase("Yes")) {
			CommonUtility.waitForElementToBeVisibleFastAndFluent(finalDriver, 100, nextButton);
			careHomeYesRadio.click();
			nextButton.click();
			if (careHome.equalsIgnoreCase("Yes")) {
				careLocalCouncilYesRadio.click();
				nextButton.click();
			} else {
				careLocalCouncilNoRadio.click();
				nextButton.click();
			}
		} else {
			CommonUtility.waitForElementToBeVisibleFastAndFluent(finalDriver, 100, nextButton);
			careHomeNoRadio.click();
			nextButton.click();
		}
	}

	public void selectSavingsRadioButton() {
		CommonUtility.waitForElementToBeVisibleFastAndFluent(finalDriver, 100, nextButton);
		int index = random.nextInt(savingsRadio.size());
		savingsRadio.get(index).click();
		nextButton.click();
	}

	public List<String> receiveCheckerCostToolOutput() {
		List<String> li = new ArrayList<String>();
		for (int i = 0; i < checkerCostOutput.size(); i++) {
			li.add(checkerCostOutput.get(i).getText());
		}
		return li;
	}
	
	public String receiveNoCheckerCostToolOutput() {
		String output = noCheckerCostOutput.getText();
		return output;
	}
 
	public List<String> receiveCheckerCostToolUniversalCredit() {
		List<String> li = new ArrayList<String>();
		for (int i = 0; i < checkerCostUniversalCreditOutput.size(); i++) {
			li.add(checkerCostUniversalCreditOutput.get(i).getText());
		}
		return li;
	}

	
	@FindBy(id="nhsuk-cookie-banner__link_accept_analytics")
	WebElement acceptCookies;
	@FindBy(id="next-button")
	WebElement nextButton;
	@FindAll(@FindBy(xpath = "//*[@id='livingCountry_fieldset']//div/input"))
	List<WebElement> countryRadio;
	@FindBy(id="result-heading")
	WebElement checkerToolResultIreland;
	@FindAll(@FindBy(xpath = "//*[@type='radio']"))
	List<WebElement> gpPracticeOrHighLandRadioButton;
	@FindAll(@FindBy(xpath = "//*[@id='dentalPracticeCountry_fieldset']//div/input"))
	List<WebElement> dentalPracticeOption;
	@FindBy(id = "dob-day")
	WebElement day;
	@FindBy(id = "dob-month")
	WebElement month;
	@FindBy(id = "dob-year")
	WebElement year;
	@FindAll(@FindBy(xpath = "//*[@id='partner_fieldset']//div/input"))
	List<WebElement> partnerRadio;
	@FindBy(xpath = "//*[@name='benefitsOrTaxCredits' and @value='No']")
	WebElement taxNoRadio;
	@FindBy(id="radio-yes")
	WebElement taxYesRadio;
	@FindBy(id="yes-universal")
	WebElement yesUniversalRadio;
	@FindBy(xpath = "//*[@name='universalCreditIncludePayments' and @id='radio-yes']")
	WebElement universalCreditYesRadio;
	@FindBy(xpath = "//*[@name='universalCreditTakeHomePay' and @id='radio-yes']")
	WebElement universalCreditTakeHomePayYesButton;
	@FindBy(id="not-yet")
	WebElement notYetUniversalCreditRadioButton;
	@FindAll(@FindBy(xpath = "//*[@id='pregnant-or-giving-birth_fieldset']//div/input"))
	List<WebElement> pregnantRadio;
	@FindAll(@FindBy(xpath = "//*[@id='warPension_fieldset']//div/input"))
	List<WebElement> injuryOrIllnesRadio;
	@FindAll(@FindBy(xpath = "//*[@id='inCareHome_fieldset']//div/input"))
	List<WebElement> homeCareRadioButton;
	@FindAll(@FindBy(xpath = "//*[@id='diabetes_fieldset']//div/input"))
	List<WebElement> diabetesRadio;
	@FindAll(@FindBy(xpath = "//*[@id='diabetesMedication_fieldset']//div/input"))
	List<WebElement> diabetesMedicationRadio;
	@FindBy(xpath = "//*[@name='inCareHome' and @id='radio-yes']")
	WebElement careHomeYesRadio;
	@FindBy(xpath = "//*[@name='inCareHome' and @id='radio-no']")
	WebElement careHomeNoRadio;
	@FindBy(xpath = "//*[@name='localCouncilAssessed' and @id='radio-yes']")
	WebElement careLocalCouncilYesRadio;
	@FindBy(xpath = "//*[@name='localCouncilAssessed' and @id='radio-no']")
	WebElement careLocalCouncilNoRadio;
	@FindAll(@FindBy(xpath = "//*[@id='savings_fieldset']//div/input"))
	List<WebElement> savingsRadio;
	@FindAll(@FindBy(xpath = "//*[@id='FREE-heading']//following-sibling::ul//li/span[2]"))
	List<WebElement> checkerCostOutput;
	@FindAll(@FindBy(xpath = "//*[@id='glaucoma_fieldset']//div/input"))
	List<WebElement> glaucomaRadio;
	@FindBy(id="question-heading")
	WebElement noCheckerCostOutput;
	@FindAll(@FindBy(xpath = "//*[@class='form-hint-list']//li"))
	List<WebElement> checkerCostUniversalCreditOutput;

}
