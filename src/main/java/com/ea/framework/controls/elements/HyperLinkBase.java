package com.ea.framework.controls.elements;

import com.ea.framework.base.DriverContext;
import com.ea.framework.controls.internals.ControlBase;
import org.openqa.selenium.WebElement;

/**
 * Created by Karthik-pc on 12/10/2016.
 */
public class HyperLinkBase extends ControlBase implements HyperLink {
    public HyperLinkBase(WebElement element) {
        super(element);
    }

    @Override
    public void ClickLink() {
        getWrappedElement().click();
    }

    @Override
    public String GetUrlText() {
        return getWrappedElement().getText();
    }

    @Override
    public boolean CheckUrlTextContains(String containsText) {
        if (getWrappedElement().getText().contains(containsText))
            return true;
        else
            return false;
    }





}
