package ge.tbc.steps;

import com.microsoft.playwright.Page;
import ge.tbc.pages.LoanCalculatorPage;


import static ge.tbc.data.Constants.CALC_URL;

public class LoanCalculatorSteps extends LoanCalculatorPage {

    private final Page page;


    public LoanCalculatorSteps(Page page){
        super(page);
        this.page = page;
    }

    public LoanCalculatorSteps openCalculatorPage(){
        page.navigate(CALC_URL);

        return this;
    }


    public LoanCalculatorSteps waitForCalculatorSection(){
        calculatorSection.waitFor();
        return this;
    }


    public LoanCalculatorSteps fillLoanAmount(String amount){
        loanAnountInput.scrollIntoViewIfNeeded();
        loanAnountInput.fill(amount);
        return this;
    }

    public LoanCalculatorSteps fillDuration(String duration){
        loanDurationInput.scrollIntoViewIfNeeded();
        loanDurationInput.fill(duration);
        return this;

    }


    public LoanCalculatorSteps verifyMonthlyPaymentVisible(){
        monthlyPayment.waitFor();
        return this;
    }

    public String getMonthlyPayment(){
        return monthlyPayment.textContent();
    }

}
