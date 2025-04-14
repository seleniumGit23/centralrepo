import org.testng.annotations.*;

public class TestngPracticeclass extends Testngpractise2 {

    @AfterMethod
    void beroremethod4(){
        System.out.println("After Method");
    }

    @AfterTest
    void beroremethod5(){
        System.out.println("After Test");
    }

    @AfterClass
    void beroremethod6(){
        System.out.println("After Class");
    }

    @AfterSuite
    void beroremethod7(){
        System.out.println("After suite");
    }

//    @BeforeSuite
//    void sutie(){
//        System.out.println("Before suite");
//    }
    @BeforeClass
    void classobj(){
        System.out.println("Before Class");
    }

    @BeforeTest
    void beroremethod(){
        System.out.println("Before Test");
    }

    @BeforeMethod
    void beroremethod1(){
        System.out.println("Before Method");
    }

    @Test(priority=0)
    void beroremethod3(){
        org.testng.Assert.fail("failed test");
    }

    @Test(priority=1)
    void beroremethod21(){
        System.out.println("Passed test 2");
    }



}
