package ge.tbc.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import ge.tbc.steps.LoanCalculatorSteps;

public class CustomerLoanPage {

    public Locator loanRequestButton;

    public CustomerLoanPage (Page page){

        this.loanRequestButton = page.getByRole(AriaRole.BUTTON,
                new Page.GetByRoleOptions().setName("სესხის მოთხოვნა"));




    }



}
