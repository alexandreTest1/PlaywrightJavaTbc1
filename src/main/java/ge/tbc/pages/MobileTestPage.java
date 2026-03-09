package ge.tbc.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class MobileTestPage {
    public Locator locationButton, atmTab, branchesTab, googleCardButton, firstLocationCard, firstLocationAdress;

    public MobileTestPage(Page page){


        this.locationButton =  page.locator("div[class='tbcx-pw-footer-top__navigation'] div:nth-child(3) tbcx-icon:nth-child(1)");
        this.atmTab = page.getByRole(AriaRole.BUTTON,
                new Page.GetByRoleOptions().setName("ბანკომატები"));
        this.branchesTab = page.getByRole(AriaRole.BUTTON,
                new Page.GetByRoleOptions().setName("ფილიალები"));
        this.firstLocationCard = page.locator("//body//app-base//app-atm-branches-section-list-item[1]");
        this.firstLocationAdress = page.locator("app-atm-branches-section-list-item:nth-child(1) div:nth-child(1) div:nth-child(1) div:nth-child(1)");
        this.googleCardButton = page.locator(".dismissButton");

    }



}
