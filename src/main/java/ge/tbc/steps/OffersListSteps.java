package ge.tbc.steps;

import com.microsoft.playwright.Page;
import ge.tbc.data.Constants;
import ge.tbc.pages.OffersListPage;


public class OffersListSteps extends OffersListPage {

    private final Page page;


    public OffersListSteps(Page page){
        super(page);
        this.page = page;

    }


    public OffersListSteps oqenOffersListPage(){
        page.navigate(Constants.OFFERSLIST_URL);
        return this;
    }


    public OffersListSteps checkFilterPanel(){
        filterPanel.scrollIntoViewIfNeeded();
        filterPanel.isVisible();
        return this;
    }

    public OffersListSteps checkOffersListContainer(){
        offersListContainer.scrollIntoViewIfNeeded();
        offersListContainer.isVisible();
        return this;
    }



    public OffersListSteps markTransportCheckbox(){
        transportCheckBox.scrollIntoViewIfNeeded();
        transportCheckBox.click();
        return this;
    }


    public OffersListSteps markMastercardCheckbox(){
        mastercardCheckbox.scrollIntoViewIfNeeded();
        mastercardCheckbox.click();
        return this;
    }


    public OffersListSteps checkVallidationMassage(){
        validationMassage.scrollIntoViewIfNeeded();
        validationMassage.isVisible();
        return this;
    }


    public OffersListSteps showOffersCardsList(){
        offersCardsList.isDisabled();
        return this;
    }


    public OffersListSteps clickClearButton (){
        clearButton.click();
        return this;
    }








}
