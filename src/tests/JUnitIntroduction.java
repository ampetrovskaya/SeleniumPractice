package tests;

import org.junit.*;

public class JUnitIntroduction{

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        System.out.println("Executing Before Class...");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception{
        System.out.println("Executing After Class...");
    }

    @Before
    public void setUp() throws Exception{
        System.out.println("Executing Before...");
    }

    @After
    public void tearDown() throws Exception{
        System.out.println("Executing After...");
    }

    @Test
    public void test1(){
        System.out.println("Executing Test1...");
    }

    @Test
    public void test2() {
        System.out.println("Executing Test2...");
    }
}
