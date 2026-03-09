package ge.tbc.steps;

import com.microsoft.playwright.Page;
import ge.tbc.data.Constants;
import ge.tbc.pages.CustomerLoanPage;
import java.util.regex.Pattern;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class CustomerLoanSteps extends CustomerLoanPage {

    private final Page page;

    public CustomerLoanSteps(Page page) {
        super(page);
        this.page = page;

    }

    public CustomerLoanSteps openCustomerLoanPage(){
        page.navigate(Constants.CALC_URL);
        return this;
    }

    public CustomerLoanSteps getTbcCreditTileName(){
        page.navigate(Constants.CRD_URL);
        assertThat(page).hasTitle("TBC Credit – ციფრული სამომხმარებლო სესხი");
        return this;

    }


    public CustomerLoanSteps clickToLoanRequestButton(){
        loanRequestButton.isVisible();
        loanRequestButton.click();

        return this;
    }

    public CustomerLoanSteps checkTbcCreditHost(){
        assertThat(page).hasURL(Pattern.compile(".*tbccredit\\.ge.*"));
        return this;
    }


}
