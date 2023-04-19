package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepairOrderPage extends basePage{
    public RepairOrderPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Repairs")
    public WebElement repairIcon;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement repairReference;

    @FindBy(xpath = "//input[@class='o_input ui-autocomplete-input']")
    public WebElement productToRepair;

    @FindBy(xpath = "(//li[@class='o_m2o_dropdown_option ui-menu-item']) [2]")
    public WebElement createAndEdit;


    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input']) [1]")
    public WebElement dropdown;

    @FindBy(xpath = "(//li[@class='o_m2o_dropdown_option ui-menu-item']) [2]")
    public WebElement selectCrate;

    @FindBy(xpath = "//a[.='[///] iphone 8']")
    public WebElement ıphone;

    @FindBy(xpath = "//input[@placeholder='Product Name']")
    public WebElement productNameField;

    @FindBy(css = "button[class='btn btn-sm btn-primary']")
    public WebElement saveBTN2;

    @FindBy(linkText ="Repair Orders")
    public WebElement verificationRepairOrder;

    @FindBy(xpath ="//td[.='Colton Davis']")
    public WebElement verificationList;

    @FindBy(xpath ="//span[.='Wyatt Huel IV']")
    public WebElement verificationKanban;

    @FindBy(xpath ="//td[.='Hong Mitchell']")
    public WebElement verificationDiscard;

    @FindBy(xpath ="//div[@class='o_notification_title']")
    public WebElement errorMsg;


}
