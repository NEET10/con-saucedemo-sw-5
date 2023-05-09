package com.saucedemo.pages;

import com.aventstack.extentreports.Status;
import com.saucedemo.customListeners.CustomListeners;
import com.saucedemo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class ProductPage extends Utility {
    @CacheLookup
            @FindBy(xpath = "//span[@class='title']")
            WebElement productsText;
    @CacheLookup
            @FindBy(xpath = "//div[@class='inventory_item_name']")
            List<WebElement> countProduct;


   public String getTextProducts(){
       CustomListeners.test.log(Status.PASS,"Get Products text "+ productsText);
       Reporter.log("Get Products text "+ productsText.toString());
       return getTextFromElement(productsText);
   }
   public int totalProductOnPage(){
       CustomListeners.test.log(Status.PASS,"Get product "+countProduct);
       Reporter.log("Get product "+ countProduct.toString());

       List<WebElement> totalElementsOnPage =getListOfElements (countProduct);
       int totalProducts = totalElementsOnPage.size();
       return totalProducts;
   }

}
