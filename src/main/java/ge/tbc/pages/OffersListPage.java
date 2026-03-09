package ge.tbc.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class OffersListPage {

   public Locator filterPanel,offersListContainer,mastercardCheckbox,transportCheckBox,validationMassage,offersCardsList,clearButton;


   public OffersListPage (Page page) {


       this.filterPanel = page.locator("app-marketing-filters.ng-star-inserted").first();
       this.offersListContainer = page.locator("//div[@class='marketing__filter-cards']//app-marketing-list");

       this.mastercardCheckbox = page.locator("//app-marketing-filter-group[4]//div[1]//ul[1]//app-marketing-filter-item[1]//div[1]//div[1][1]//input[1]");
       this.transportCheckBox = page.locator("//app-marketing-filter-group[1]//div[1]//ul[1]//app-marketing-filter-item[10]//div[1]//div[1][1]//input[1]");
       this.validationMassage = page.getByRole(AriaRole.HEADING,
               new Page.GetByRoleOptions().setName("შეთავაზებები არ მოიძებნა"));
       this.offersCardsList = page.locator("tbcx-pw-card tbcx-pw-card--background-visible ng-star-inserted");

       this.clearButton = page.getByRole(AriaRole.BUTTON,
               new Page.GetByRoleOptions().setName("გასუფთავება")).first();



   }


}
