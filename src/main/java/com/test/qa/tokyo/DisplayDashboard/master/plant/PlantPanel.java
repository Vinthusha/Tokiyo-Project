package com.test.qa.tokyo.DisplayDashboard.master.plant;

import utils.PageBase;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import java.util.logging.Logger;

public class PlantPanel extends PageBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(PlantPanel.class));
    private static By masterMenu = By.xpath("//h1[contains(text(),'Master')]");

    private static By plantPanel = By.xpath("//div[contains(text(),'Plant')]");
    private static By btnAddplant = By.xpath("//span[contains(text(),'Add Plant')]");

    private static By txtCode = By.id("plant_code");
    private static By txtPlant = By.id("plant_name");
    private static By txtAddress = By.id("plant_address");
    private static By txtContactno = By.id("plant_contactno");
    private static By txtFax = By.id("fax");
    private static By txtPlantdescription = By.id("plant_description");

    private static By butPlantSave = By.id("//span[contains(text(),'Save')]");


    public static void clickMasterPanel() {

        getDriver().findElement(masterMenu).click();
    }



    public static void clickPlantpanel() {

        getDriver().findElement(plantPanel).click();
    }

    public static void clickAddpanel() {

        getDriver().findElement(btnAddplant).click();
    }

    public static void setCode(String code) {

        getDriver().findElement(txtCode).sendKeys(code);
    }

    public static void setName(String name) {

        getDriver().findElement(txtCode).sendKeys(name);
    }

    public static void setAddress(String Address) {

        getDriver().findElement(txtAddress).sendKeys(Address);

    }

    public static void setContacno(String contactno) {

        getDriver().findElement(txtContactno).sendKeys(contactno);

    }

    public static void setFax(String fax) {

        getDriver().findElement(txtFax).sendKeys(fax);

    }

    public static void setDescription(String fax) {

        getDriver().findElement(txtFax).sendKeys(fax);

    }

    public static void clickplantSave() {

        getDriver().findElement(txtFax).click();

    }






}




