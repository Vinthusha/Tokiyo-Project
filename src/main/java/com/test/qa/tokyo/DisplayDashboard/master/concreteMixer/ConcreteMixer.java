package com.test.qa.tokyo.DisplayDashboard.master.concreteMixer;

import org.openqa.selenium.By;

import static utils.PageBase.getDriver;

public class ConcreteMixer {
    private static By ConcreteMixerBtn = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]");

    public static void ConcretePanel() {
        getDriver().findElement(ConcreteMixerBtn).click();
    }

}
