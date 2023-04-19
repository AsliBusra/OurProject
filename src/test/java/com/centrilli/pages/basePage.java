package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class basePage {
    public basePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "login")
    public WebElement inputUsername;

    @FindBy(name = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginButton;

    @FindBy(id = "menu_more_container")
    public WebElement moreDropdown;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy(xpath = "//button[@accesskey='j']")
    public WebElement discardButton;

    @FindBy(xpath = "//button[@accesskey='a']")
    public WebElement editButton;

    @FindBy(xpath = "//button[@accesskey='k']")
    public WebElement kanbanButton;

    @FindBy(xpath = "//button[@accesskey='l']")
    public WebElement listButton;

    @FindBy(xpath = "//button[contains(text(),'Action')]")
    public WebElement actionButton;

    /* @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[3]/ul/li[1]/a")
     public WebElement delete;

     */
    @FindBy(xpath = "//div[.='Are you sure you want to delete this record ?']")
    public WebElement warningMessage;

    @FindBy(xpath = "//button[.='Ok']")
    public WebElement okButton;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement nameBox;

    @FindBy (xpath = "//div[@class='o_kanban_view o_kanban_mobile o_kanban_ungrouped']")
    public WebElement kanbanView;

    @FindBy (xpath = "//div/table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']")
    public WebElement listView;

    @FindBy(xpath = "//h4[.='Warning']")
    public WebElement discardWarningMessage;

    @FindBy (xpath = "//h4[.='Confirmation']")
    public WebElement ConfirmationMessage;

}
