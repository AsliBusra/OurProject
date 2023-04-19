package com.centrilli.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PointOfSalePage extends basePage{
    @FindBy(xpath = "//a[@href='/web#menu_id=484&action=']/span")
    public WebElement pointOfSaleModuleButton;

    @FindBy(xpath = "//a[@href='/web#menu_id=496&action=676']/span")
    public WebElement getPointOfSaleSideBarMenuButton;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement pointOfSaleNameInputBox;

    @FindBy(xpath = "//div[@class='content-group mt16']/div/div/input")
    public WebElement operationTypeSelectDropdown;

    @FindBy(xpath = "//ol[@class='breadcrumb']/li[@class='active']")
    public WebElement newCreatedName;

}
