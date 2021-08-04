package com.ea.framework.controls.elements;

import com.ea.framework.base.DriverContext;
import com.ea.framework.controls.internals.Control;
import com.ea.framework.controls.internals.ControlBase;
import org.openqa.selenium.WebElement;

/**
 * Created by Karthik-pc on 12/10/2018.
 */
public class ButtonBase extends ControlBase implements Button {


    public ButtonBase(WebElement element) {
        super(element);
    }

    @Override
    public void PerformClick() {
        getWrappedElement().click();
    }

    @Override
    public String GetButtonText() {
        return getWrappedElement().getText();
    }

    @Override
    public void PerformSubmit() {
        getWrappedElement().submit();
    }


}
