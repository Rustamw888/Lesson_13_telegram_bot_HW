package tests.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {

    @Test
    public void someTest1() {
        String browser = System.getProperty("browser");
        System.out.println(browser); // null
    }

    @Test
    public void someTest2() {
        System.setProperty("browser", "safari");
        String browser = System.getProperty("browser");
        System.out.println(browser); // safari
    }

    @Test
    public void someTest3() {
        String browser = System.getProperty("browser", "opera");
        System.out.println(browser); // opera
    }

    @Test
    public void someTest4() {
        System.setProperty("browser", "safari");
        String browser = System.getProperty("browser", "opera");
        System.out.println(browser); // safari
    }

    @Test
    @Tag("test5")
    void someTest5() {
        String browser = System.getProperty("browser", "chrome");
        String version = System.getProperty("version", "100");
        String browserSize = System.getProperty("browserSize", "1920x1080");

        System.out.println(browser);
        System.out.println(version);
        System.out.println(browserSize);
    }
}
