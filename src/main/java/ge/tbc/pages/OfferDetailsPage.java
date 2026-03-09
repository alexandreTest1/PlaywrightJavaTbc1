package ge.tbc.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class OfferDetailsPage {
    public Locator  heroSection, discountBadge, offerDescription;

    public OfferDetailsPage (Page page){

        this.heroSection = page.locator(".ng-tns-c284686360-20").first();
        this.discountBadge = page.getByRole(AriaRole.BUTTON,
                new Page.GetByRoleOptions().setName(" დაიბრუნე 30%"));
        this.offerDescription = page.locator(".ng-tns-c284686360-20 with-container");
    }
}
