package com.test.qa.Designation;

import com.test.qa.tokyo.DisplayDashboard.master.Designation.Designation;
//import com.test.qa.tokyo.DisplayDashboard.master.MasterClick;
//import com.test.qa.tokyo.utils.PageBase;
import com.test.qa.utils.TestBase;
import utils.PageBase;

import org.testng.annotations.Test;

public class DesignationTest extends TestBase {


    @Test(priority = 1, testName = "Designation")

    public void TokyoDesignationTest() {


//        Designation.clickMasterPanel();
//        Designation.clickMasterDesignation();
//        Designation.clickAddesignation();
//        Designation.DesignationName();
//        Designation.DesignationDescription();
//        Designation.DesignationSave();

       // MasterClick.clickMasterPanel();
       // MasterClick.implicitWait(5000);
        Designation.clickMasterPanel();
        Designation.implicitWait(5000);
        Designation.clickMasterDesignation();
        Designation.implicitWait(5000);
        Designation.clickAddesignation();


        Designation.DesignationName("admin");
        Designation.DesignationDescription("some text ");
        Designation.implicitWait(5000);
        Designation.DesignationSave();
        Designation.implicitWait(5000);
        Designation.DesignationName("colombo");
        Designation.DesignationDescription("description");
       Designation.DesignationSave();



    }

}
