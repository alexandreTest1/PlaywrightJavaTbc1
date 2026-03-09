package ge.tbc.steps;

import com.microsoft.playwright.Page;
import ge.tbc.pages.MoneyTransferPage;

import static ge.tbc.data.Constants.*;

public class MoneyTransferSteps extends MoneyTransferPage {
    private final Page page;


    public MoneyTransferSteps(Page page) {
        super(page);
        this.page = page;
    }

    public MoneyTransferSteps openMoneyTransferPage() {
        page.navigate(MON_URL_ENG);
        return this;
    }


    public MoneyTransferSteps moneyTransferSectionIsVisible(){
        moneyTransferSection.scrollIntoViewIfNeeded();
        moneyTransferSection.isVisible();
        return this;
    }



    public MoneyTransferSteps opnCalculationTab(){
        remittanceFeeCalculatorTab.scrollIntoViewIfNeeded();
        remittanceFeeCalculatorTab.click();
        return this;

    }

    public MoneyTransferSteps enterAmount(String amount){
        moneyField.scrollIntoViewIfNeeded();
        moneyField.fill(amount);
        return this;
    }

    public MoneyTransferSteps selectCurrency(){

        currencyDropDown.scrollIntoViewIfNeeded();
        currencyDropDown.click();
        page.locator(".tbcx-dropdown-popover-item__title-container").nth(2).click();
        return this;
    }

    public MoneyTransferSteps selectCountry(){
        countryDropDown.scrollIntoViewIfNeeded();
        countryDropDown.click();
        page.locator(".tbcx-dropdown-popover-item__title-container").nth(5).click();

        return this;

    }



    public MoneyTransferSteps calcutationResultSectionIsVisible(){
        CalculationResultSection.scrollIntoViewIfNeeded();
        CalculationResultSection.isVisible();
        return this;

    }



    }

