import org.testng.annotations.*;

public class TestNGclass extends Testngpractise2{

    @AfterMethod
    void aftermethod(){
        System.out.println("After Method");
    }
    @AfterTest
    void aftertest(){
        System.out.println("After Test");
    }
    @AfterClass
    void afterclass(){
        System.out.println("After Class");
    }
    @BeforeSuite
    void beforesuite(){
        System.out.println("Suite Before");
    }
    @AfterSuite
    void aftersuite(){
        System.out.println("Suite After");
    }


    @BeforeClass
    void beforeclass(){
        System.out.println("Class Before");

    }
    @BeforeTest
    void beforetest(){
        System.out.println("Test Before");

    }
    @BeforeMethod
    void beforemethod(){
        System.out.println("Before Method");
    }
    @Test(priority=1)
    void maintest1(){
        System.out.println("The main test 1");
    }

    @Test(priority=3)
    void maintest001(){
        org.testng.Assert.assertEquals("sudheer","sudheer");
    }

    @Test(priority=2)
    void maintest000(){
        System.out.println("The main test 3");
    }
//TDD--Test Drivern Development---5
//BDD--Behavior Driven Development---95% now it industrty

}
