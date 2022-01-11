package day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {
        String browser= "firefox";
        String result ="";
        if (browser=="chrome"||browser=="edge"||browser=="safari"||browser=="opera"||browser=="firefox"){
            if(browser=="chrome"){
                result = "chrome browser is selected";
            }else if (browser=="edge"){
                result = "Edge browser is selected";
            }else if(browser=="safari"){
                result = "Safari browser is selected";
            }else if(browser=="opera") {
                result= "Opera browser is selected";
            }else{
                result = "Firefox browser is selected";
            }
        }else{
            result="Invalid Browser Name";
        }
        System.out.println(result);

    }
}






/*
 Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if

 */