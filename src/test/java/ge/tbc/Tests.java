package ge.tbc;


import ge.tbc.data.Constants;
import ge.tbc.steps.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;


public class Tests extends BaseTest{

    private LoanCalculatorSteps loanCalculatorSteps;
    private MoneyTransferSteps moneyTransferSteps;
    private OfferDetailsSteps offerDetailsSteps;
    private OffersListSteps offersListSteps;
    private CustomerLoanSteps customerLoanSteps;
    private MobileTestSteps mobileTestSteps;

    @BeforeClass
    public void SetUpSteps(){
        page.navigate(Constants.BASE_URL);
        loanCalculatorSteps = new LoanCalculatorSteps(getPage());
        moneyTransferSteps = new MoneyTransferSteps(getPage());
        offerDetailsSteps = new OfferDetailsSteps(getPage());
        offersListSteps = new OffersListSteps(getPage());
        customerLoanSteps = new CustomerLoanSteps(getPage());
        mobileTestSteps =new MobileTestSteps(getPage());
        page.waitForLoadState();
    }


    @Test
    public void calculateLoanValues(){

        loanCalculatorSteps.openCalculatorPage();
        loanCalculatorSteps.waitForCalculatorSection();

        assertThat(loanCalculatorSteps.calculatorSection).isVisible();
        assertThat(page).hasTitle("სამომხმარებლო სესხი");

        loanCalculatorSteps.fillLoanAmount("3000")
                                    .fillDuration("48");

        String firstResult = loanCalculatorSteps.verifyMonthlyPaymentVisible().getMonthlyPayment();

        loanCalculatorSteps.fillDuration("24");

        String secondResult = loanCalculatorSteps.verifyMonthlyPaymentVisible().getMonthlyPayment();

        Assert.assertNotEquals(firstResult, secondResult);

    }


    @Test
    public void transferPageCalculatedFee(){

        page.navigate(Constants.MON_URL_ENG);

        moneyTransferSteps
                .moneyTransferSectionIsVisible()
                .opnCalculationTab()
                .enterAmount("1000")
                .selectCurrency()
                .selectCountry()
                .calcutationResultSectionIsVisible();

    }


    @Test

    public void checkOfferDeatilsPage(){

        offerDetailsSteps
                .openOfferDitailsPage()
                .titleName()
                .checkHeroSection()
                .checkDiscountBadge()
                .checkOfferDescription();

    }


    @Test

    public void checkOfferList(){
        offersListSteps.oqenOffersListPage()
                .checkFilterPanel()
                .checkOffersListContainer()
                .markTransportCheckbox()
                .markMastercardCheckbox()
                        .checkVallidationMassage()
                            //    .showOffersCardsList()
                                        .clickClearButton();
        offersListSteps.checkOffersListContainer();

    }

    @Test
    public void checkcustomerLoan(){

        customerLoanSteps.openCustomerLoanPage()
                .clickToLoanRequestButton()
                .getTbcCreditTileName()
                .checkTbcCreditHost();

    }

    @Test
    public void mobileTest() {

        mobileTestSteps.mobileFormatPage()
                        .clickLocationButton()
                                .atmTitleName()
                . disconnectGoogleCard()
                                        .navigateAtmTab()
                                                .checkAtmcardATM()
                                                        .checkVisibleAtmCardAdress()
                                                                .navigateBranchesTab()
                                                                        .checkVisibleBranchCardAdress()
                                                                                      .scheduleVisible();

    }

}



