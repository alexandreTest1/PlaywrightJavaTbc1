package ge.tbc.steps;

import com.microsoft.playwright.Page;
import ge.tbc.data.Constants;
import ge.tbc.pages.MobileTestPage;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class MobileTestSteps extends MobileTestPage {

    private final Page page;


    public MobileTestSteps(Page page){
        super(page);
        this.page = page;

    }

    public MobileTestSteps mobileFormatPage(){

        page.navigate(Constants.BASE_URL);

        page.setViewportSize(430, 932);

        return this;

    }




    public MobileTestSteps clickLocationButton(){
        locationButton.scrollIntoViewIfNeeded();
        locationButton.click();
        return this;
    }

    public MobileTestSteps atmTitleName(){
        page.navigate(Constants.ATM_URL);
        assertThat(page).hasTitle("ბანკომატები და ფილიალები");

        return this;
    }


    public MobileTestSteps navigateAtmTab(){
        atmTab.click();
        return this;
    }

    public MobileTestSteps checkAtmcardATM(){


        firstLocationCard.scrollIntoViewIfNeeded();
        firstLocationCard.isVisible();
        assertThat(firstLocationCard).containsText("ATM");

        return this;
    }

     public MobileTestSteps checkVisibleAtmCardAdress(){

        firstLocationAdress.isVisible();
        firstLocationAdress.innerText().length();


        return this;
     }


     public MobileTestSteps navigateBranchesTab(){
        branchesTab.click();
        return this;
     }



     public MobileTestSteps checkVisibleBranchCardAdress(){
            firstLocationAdress.isVisible();
            firstLocationCard.innerText().length();

        return this;
     }


    public boolean scheduleVisible(){

        String text = firstLocationCard.innerText();
        return text.contains("ორშაბათი")
                || text.contains("შაბათი")
                || text.contains("კვირა");
    }



    public MobileTestSteps disconnectGoogleCard(){
        googleCardButton.click();
        return this;
     }







}
