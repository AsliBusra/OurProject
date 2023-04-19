package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectTaskPage extends basePage{
    public ProjectTaskPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//nav[@id='oe_main_menu_navbar']/div[2]/ul[1]//a[@href='/web#menu_id=333&action=']/span[@class='oe_menu_text']")
    public WebElement ProjectModule;

    @FindBy(xpath = "//a[@data-menu='336']")
    public WebElement TasksButton;

    @FindBy(xpath = "//body[@class='o_web_client']/div[@class='o_main']/div[@class='o_main_content']/div[@class='o_content']/div[@class='o_view_manager_content']/div/div//input[@name='name']")
    public WebElement TaskTitleField;

    @FindBy(xpath = "//span[.='FERİHA']")
    public WebElement NewTaskFERIHA;

    @FindBy(xpath = "//div[@class='note-editable panel-body']")
    public WebElement DescriptionField;


}
