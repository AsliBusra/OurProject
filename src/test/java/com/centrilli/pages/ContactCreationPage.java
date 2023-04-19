package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactCreationPage extends basePage {
    public ContactCreationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[4]/a/span")
    public WebElement contactsButton;
    @FindBy(xpath = "(//div[@class='o_input_dropdown'])[1]")
    public WebElement companyButton;

    @FindBy(xpath = "(//input[@placeholder='Name'])[2]")
    public WebElement nameOfCompanyBox;

    @FindBy(xpath = "(//select[@class='o_input o_field_widget'])[1]")
    public WebElement adressType;
    @FindBy(xpath = "//input[@name='street']")
    public WebElement street1Button;

    @FindBy(xpath = "//input[@name='street2']")
    public WebElement street2Button;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement cityButton;


    @FindBy(xpath= "//input[@class='o_field_char o_field_widget o_input o_address_zip']")
    public WebElement zipCodeBox;

    @FindBy(xpath = "//div[@class='modal-body']")
    public  WebElement warningOfDiscard;

    @FindBy(xpath ="//span[@class='o_field_char o_field_widget o_address_street']")
    public WebElement updatedAdressButton;







}
