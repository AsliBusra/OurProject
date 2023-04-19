package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeesPage extends basePage{
    public EmployeesPage() { PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//a[@class='oe_menu_toggler']//span[@class='oe_menu_text'][normalize-space()='Employees']")
    public WebElement employees_moduleButton;

    @FindBy(xpath = "//span[normalize-space()='Badges']")
    public WebElement badge_subModule;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement badge_inputField;

    @FindBy (xpath = "//span[@name='name']")
    public WebElement created_manufacturingOrderTitle;

    @FindBy (xpath = "//input[@class='o_searchview_input']")
    public WebElement searchButton;

    @FindBy (xpath = "//td[contains(text(),\"New questions\")]")
    public  WebElement listedBrokenBudgesTitle;

    @FindBy(xpath = "//td[contains(text(),\"New answers\")]")
    public WebElement getListedBrokenBudgesTitle;

    @FindBy (xpath = "(//span[contains(text(),\"Badges\")])[1]")
    public WebElement OperationsBudgesSubmoduleButton;

    @FindBy(xpath="//div[@class='o_kanban_view o_kanban_badge o_kanban_ungrouped']")
    public WebElement kanban_View;

}
