package com.ea.framework.controls.internals;

import com.ea.framework.base.DriverContext;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Coordinates;


import java.util.List;

/**
 * Created by Karthik-pc on 12/10/2016.
 */
public class ControlBase implements Control {


    private final WebElement element;

    public ControlBase(final WebElement element) {
        this.element = element;
    }

    @Override
    public void click() {
        element.click();
    }

    @Override
    public void submit() {
        element.submit();
    }

    @Override
    public void sendKeys(CharSequence... charSequences) {
        element.sendKeys(charSequences);
    }

    @Override
    public void clear() {
            element.clear();
    }

    @Override
    public String getTagName() {
        return element.getTagName();
    }

    @Override
    public String getAttribute(String s) {
        return element.getAttribute(s);
    }

    @Override
    public boolean isSelected() {
        return element.isSelected();
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public String getText() {
        return element.getText();
    }

    @Override
    public List<WebElement> findElements(By by) {
        return element.findElements(by);
    }

    @Override
    public WebElement findElement(By by) {
        return element.findElement(by);
    }

    @Override
    public boolean isDisplayed() {
        return element.isDisplayed();
    }

    @Override
    public Point getLocation() {
        return null;
    }

    @Override
    public Dimension getSize() {
        return null;
    }

    @Override
    public Rectangle getRect() {
        return null;
    }

    @Override
    public String getCssValue(String s) {
        return null;
    }

    @Override
    public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
        return null;
    }

    @Override
    public Coordinates getCoordinates() {
        return null;
    }

    @Override
    public WebElement getWrappedElement() {
        return element;
    }

    @Override
    public ControlBase Wait(){
        DriverContext.WaitForPageToLoad();
        return this;
    }

    @Override
    public ControlBase WaitForVisible(){
        DriverContext.WaitForElementVisible(getWrappedElement());
        return this;
    }

    @Override
    public ControlBase Click(){
        getWrappedElement().click();
        return this;
    }

    @Override
    public ControlBase ScrollToElement(){
        //JAVA Script
        return this;

    }

 }
