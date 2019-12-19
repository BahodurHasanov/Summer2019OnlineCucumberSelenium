package com.vytrack.pages;

import com.vytrack.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarEventsPage extends BasePage{

    @FindBy(css = "[title='Create Calendar event']")
    public WebElement createCalendarEvent;

    public void clickToCreateCalendarEvent(){
        BrowserUtils.waitForVisibility(createCalendarEvent, 5);
        BrowserUtils.waitForClickablility(createCalendarEvent, 5);
        createCalendarEvent.click();
    }

}
