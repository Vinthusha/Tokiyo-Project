package com.test.qa.plant;

import com.test.qa.testdata.PlantData;

import com.test.qa.tokyo.LoginPage;
import com.test.qa.tokyo.DisplayDashboard.master.plant.DisplayPlant;
import com.test.qa.tokyo.DisplayDashboard.master.plant.PlantPanel;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;

public class PlantTest  extends TestBase {



    @Test(priority = 1,dataProviderClass = PlantData.class, testName = "PlanTest")
    public void TokiyomasterTest(String code,String plant,String address,String contactno,String fax, String descripion) {



        LoginPage.implicitWait(6000);
        DisplayPlant.isDisplayPlantPanel();
        //MasterClick.clickMasterPanel();
       /* LoginPage.setUserName("admin");
        LoginPage.setPassword("admin");
        LoginPage.clickLogin();
        LoginPage.implicitWait(600);*/



        LoginPage.implicitWait(6000);
        DisplayPlant.isDisplayPlantPanel();
       // PlantPanel.clickMasterPanel();

        PlantPanel.implicitWait(6000);
        PlantPanel.clickPlantpanel();
        PlantPanel.clickAddpanel();
        PlantPanel.setCode(code);
        PlantPanel.setName(plant);
        PlantPanel.setAddress(address);
        PlantPanel.setContacno(fax);
        PlantPanel.setFax(contactno);
        PlantPanel.setDescription(descripion);
        PlantPanel.clickplantSave();





    }


}
