package com.test.qa.test.concreeteMixTest;

//import com.test.qa.tokyo.DisplayDashboard.master.MasterClick;
import com.test.qa.tokyo.DisplayDashboard.master.concreteMixer.ConcreteMixer;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;

public class ConcreteMixTest extends TestBase {
    @Test(priority=1, testName = "LoginTest")
    public void HrmLoginTest()  {

      // softAssert = new SoftAssert();

        //MasterClick.clickMasterPanel();
        ConcreteMixer.ConcretePanel();


    }
}
