package ge.tbc.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class MoneyTransferPage {

    public Locator  moneyTransferSection, remittanceFeeCalculatorTab,moneyField,currencyDropDown,countryDropDown,CalculationResultSection;

    public MoneyTransferPage (Page page) {
        this.moneyTransferSection = page.getByText("Quick money transfers");
        this.remittanceFeeCalculatorTab = page.getByRole(AriaRole.BUTTON,
                new Page.GetByRoleOptions().setName("Remittance Fee Calculation"));
        this.moneyField = page.locator("#tbcx-text-input-1");
        this.currencyDropDown = page.locator(".tbcx-popover-state-icon").first();

        this.countryDropDown = page.locator(".tbcx-popover-state-icon").nth(1);

        this.CalculationResultSection = page.locator(".tbcx-pw-money-transfer-fee-calculator__cards").first();




    }

}
