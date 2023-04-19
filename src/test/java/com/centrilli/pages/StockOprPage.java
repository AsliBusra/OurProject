package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StockOprPage extends basePage{
    public StockOprPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html/body/nav/div[2]/ul[1]/li[10]/a/span")
    public WebElement inventoryModule;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[10]/ul[1]/li[1]/a/span")
    public WebElement transfersButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/table[2]/tbody/tr[2]/td[2]/input")
    public WebElement sourceDocumentButton;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[1]/h4")
    public WebElement warningMessage;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/ol/li")
    public WebElement pageTitle;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr[1]/td[2]")
    public WebElement firstOperation;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/table[2]/tbody/tr[2]/td[2]/span")
    public WebElement newSourceDocumentNumber;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[2]")
    public WebElement warningMessageForTheDeleteStock;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/ol")
    public WebElement pageTitleWithOperationName;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[3]/ul/li[4]/a")
    public WebElement noteButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[3]/div/div[4]/textarea[1]")
    public WebElement noteBox;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[3]/ul/li[3]/a")
    public WebElement additionalInfo;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/table[1]/tbody/tr[1]/td[2]/div/div/input")
    public WebElement partnerDropdown;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/ol/li[2]")
    public WebElement operationName;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[3]/div/div[3]/div/table[1]/tbody/tr[3]/td[2]/div/div/input")
    public WebElement additionalInfoDropdown;


}
