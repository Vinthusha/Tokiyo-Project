package com.test.qa.tokyo.DisplayDashboard.master.Designation;


import org.openqa.selenium.By;
import utils.PageBase;

public class Designation extends PageBase {

    private static By masterMenu = By.xpath("//h1[contains(text(),'Master')]");
    private static By masterDesignation = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]");
    private static By AddMasterDesignation = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");
    private static By Designation = By.xpath("//*[@id=\"designation_name\"]");
    private static By Description = By.xpath("//*[@id=\"designation_description\"]");
    private static By Savebutton = By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div[3]/button[2]");








    public static void clickMasterDesignation() {
        getDriver().findElement(masterDesignation).click();
    }
    public static void clickAddesignation() {
        getDriver().findElement(AddMasterDesignation).click();
    }
    public static void DesignationName (String name) {

        getDriver().findElement(Designation).sendKeys(name);
    }
    public static void DesignationDescription (String name) {

        getDriver().findElement(Description).sendKeys(name);
    }
    public static void DesignationSave() {

        getDriver().findElement(Savebutton).click();

    }

    public static void clickMasterPanel() {

        getDriver().findElement(masterMenu).click();

    }


}
