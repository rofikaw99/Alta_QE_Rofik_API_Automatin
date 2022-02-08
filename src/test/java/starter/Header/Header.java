//package starter.Header;
//
//import net.thucydides.core.annotations.Step;
//import net.thucydides.core.pages.PageObject;
//import org.openqa.selenium.By;
//
//public class Header extends PageObject {
//
//    @Step
//    public void verifyHeader(){
//        String header = $(By.id("headerTittle")).getText();
//        //di Website header tulisannya "Facebook.feature.com Indonesia"
//        Boolean Result =header.contains("Facebook.feature.com");
//        //result =
//
//        Boolean condition1 =header.equals("facebook.com");
//        //condition 1 = false;
//
//        Boolean condition2 = header.equals("facebook.com Indonesia");
//        //condition 2 = false;
//
//        Boolean condition3 =header.equalsIgnoreCase("facebook.com Indonesia");
//        //condition 3 = true;
//    }
//}