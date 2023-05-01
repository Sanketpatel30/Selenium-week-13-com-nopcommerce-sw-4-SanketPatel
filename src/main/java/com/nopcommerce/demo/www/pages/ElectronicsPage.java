package com.nopcommerce.demo.www.pages;

import com.nopcommerce.demo.www.utilities.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {
    By electronicsTab = By.xpath("//h1[contains(text(),'Electronics')]");

    public String getElectronicsTab() {
        return getTextFromElement(electronicsTab);
    }
}
