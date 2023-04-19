package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotesPage extends basePage{
    public NotesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-menu='194']")
    public WebElement moduleNotes;

    @FindBy(xpath = "(//li[@class='active'])[2]")
    public WebElement moduleNotesTittle;

    @FindBy(xpath = "//div[@class='note-editable panel-body']")
    public WebElement textField ;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[3]/ul/li[1]/a")
    public WebElement delete;

}
