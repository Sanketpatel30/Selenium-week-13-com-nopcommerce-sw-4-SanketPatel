package com.nopcommerce.demo.www.pages;

import com.nopcommerce.demo.www.utilities.Utility;
import org.openqa.selenium.By;

public class GiftCardsPage extends Utility {
    By giftCardsTab = By.xpath("//h1[contains(text(),'Gift Cards')]");

    public String getGiftCardsTab(){
        return  getTextFromElement(giftCardsTab);
    }
}
