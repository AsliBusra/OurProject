package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseVendorPage extends basePage{
    public PurchaseVendorPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath ="//a[@data-menu='504']")
    public WebElement PurchasesButton;

    @FindBy(xpath ="//a[@data-action-id='50']")
    public WebElement VendorsButton;


    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/ol/li")
    public WebElement VendorsPage;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement NameInputBox;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/ol/li[2]")
    public WebElement NewlyCreatedVendor;

    @FindBy(xpath="//button[@aria-label='Next']")
    public WebElement NextBtn;

    @FindBy(xpath="//button[@aria-label='Previous']")
    public WebElement PreviousBtn;

    @FindBy(css=".o_pager_value")
    public WebElement RecordsPage;

}
