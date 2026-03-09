package ge.tbc.steps;

import com.microsoft.playwright.Page;
import ge.tbc.pages.OfferDetailsPage;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static ge.tbc.data.Constants.OFFERS_URL;

public class OfferDetailsSteps extends OfferDetailsPage {

    private final Page page;


    public OfferDetailsSteps (Page page){
        super(page);
        this.page = page;
    }

    public OfferDetailsSteps openOfferDitailsPage(){
        page.navigate(OFFERS_URL);
        return this;

    }

    public OfferDetailsSteps titleName(){
        assertThat(page).hasTitle("შეთავაზება extra-ზე");
        return this;
    }

    public OfferDetailsSteps checkHeroSection(){
        heroSection.isVisible();
        return this;
    }



    public OfferDetailsSteps checkDiscountBadge(){
        discountBadge.isVisible();
        return this;

    }


    public OfferDetailsSteps checkOfferDescription(){
        offerDescription.isVisible();
        return this;
    }




}
