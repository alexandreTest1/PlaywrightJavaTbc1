package ge.tbc.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;


public class LoanCalculatorPage {


    public Locator calculatorSection, loanAnountInput,loanDurationInput,monthlyPayment;

    public LoanCalculatorPage(Page page){

        this.loanAnountInput = page.locator("#tbcx-text-input-1");
        this.loanDurationInput = page.locator("#tbcx-text-input-2");
        this.monthlyPayment = page.locator(".tbcx-pw-calculated-info__top-title").first();
        this.calculatorSection = page.locator(".tbcx-pw-calculator").first();
    }

}
