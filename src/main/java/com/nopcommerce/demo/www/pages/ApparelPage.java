package com.nopcommerce.demo.www.pages;

import com.nopcommerce.demo.www.utilities.Utility;
import org.openqa.selenium.By;

public class ApparelPage extends Utility {
    By apparelTab = By.xpath("//h1[contains(text(),'Apparel')]");

    public String getApparelTab(){
        return  getTextFromElement(apparelTab);
    }
}
