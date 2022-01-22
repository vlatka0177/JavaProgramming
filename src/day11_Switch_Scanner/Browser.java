package day11_Switch_Scanner;

public class Browser {

    public static void main(String[] args) {

        /*
        Create A class called Browser. Write A program that can display the name of selected browser
        1. declare A String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if
         */

        String browserName = "chrome";

        String result = ""; /* Has to be initialized to avoid the compile error.
                               "" is added as A temporary value. */

        boolean validBrowser = browserName == "chrome" || browserName == "firefox" || browserName == "opera"
                             || browserName == "safari" || browserName == "edge";

        if(validBrowser){         // There are 5 options.

            if(browserName == "chrome"){
                result = "Chrome Browser is Selected";
            }else if(browserName == "firefox"){
                result = "FireFox Browser is Selected";
            }else if(browserName == "opera"){
                result = "Opera Browser is Selected";
            }else if(browserName == "safari"){
                result = "Safari Browser is Selected";
            }else{
                result = "Edge Browser is Selected";
            }

        }else{
            result = "Invalid Browser Name";
        }

    }
}
