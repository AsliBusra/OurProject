package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManufacturingPage extends basePage{
    public ManufacturingPage() { PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "(//span[contains(text(),\"Manufacturing\")])[1]")
    public WebElement ManufacturingModuleButton;

    @FindBy (xpath = "(//div/input[@class='o_input ui-autocomplete-input'])[1]")
    public WebElement ProductDropdown;

    @FindBy (xpath = "//h1/span[@name='name']")
    public WebElement CreatedOrderTitle;

    @FindBy (xpath = "//input[@class='o_searchview_input']")
    public WebElement SearchButton;

    @FindBy (xpath = "//td[contains(text(),\"TY/2023/0175\")]")
    public  WebElement ListedBrokenMOTitle;

    @FindBy (xpath = "(//span[contains(text(),\"Manufacturing Orders\")])[1]")
    public WebElement OperationsMOSubmoduleButton;

    @FindBy (css = "input[name='product_qty']")
    public WebElement quantityBox;


    @FindBy (css = "[data-menu='438']")
    public WebElement unbuildOrdersModuleButton;

    @FindBy (xpath = "//div/table/tbody/tr[1]/td[2]")
    public WebElement lastCreatedUnbuildOrderReferenceBox;

    @FindBy (xpath = "//button[contains(text(),\"Cancel\")]" )
    public WebElement CancelButton;





}
