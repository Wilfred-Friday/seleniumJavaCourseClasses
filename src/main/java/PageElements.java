import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;


public class PageElements {
    /*public WebElement findInputByElement(WebDriver chromeDriver, int element ){
        WebElement fullName = chromeDriver.findElement(By.xpath("//input[@id='fullName']"));
        WebElement getText = chromeDriver.findElement(By.xpath("//input[@id='getMe']"));
        WebElement clearText = chromeDriver.findElement(By.xpath("//input[@id='clearMe']"));
        WebElement noEdit = chromeDriver.findElement(By.xpath("//input[@id='noEdit']"));
        WebElement confirmText = chromeDriver.findElement(By.xpath("//input[@id='dontwrite']"));
        WebElement appendTab = chromeDriver.findElement(By.xpath("//input[@id='join']"));
        WebElement noAction = null;

        if( element == 1){
            return fullName;
        }else if( element == 2){
            return clearText;
        }else if( element == 3){
            return noEdit;
        }else if( element == 4){
            return confirmText;
        }else if( element == 5){
            return appendTab;
        }else if( element == 6){
            return getText;
        }else{
            return noAction;
        }

    }*/
    BrowserSetUp driver = new BrowserSetUp();

    public WebElement findInputByElement(WebDriver chromeDriver, int element) {
        String locator = switch (element) {
            case 1 -> "";
            case 2 -> "";
            case 3 -> "";
            case 4 -> "";
            case 5 -> "";
            case 6 -> "";
            default -> throw new IllegalArgumentException("Invalid element value: " + element);
        };
        return chromeDriver.findElement(By.xpath(locator));
    }

    public WebElement workSpaceScreen (WebDriver chromeDriver){
        return chromeDriver.findElement(By.xpath(""));
    }

    public WebElement inputEditButton (WebDriver chromeDriver){
        return chromeDriver.findElement(By.xpath(""));
    }

    public WebElement buttonClickScreen(WebDriver chromeDriver){
        return chromeDriver.findElement(By.xpath("//a[contains(text(),'Click')]"));
    }

    public WebElement findButtonByElement(WebDriver chromeDriver, int element) {
        String locator = switch (element) {
            case 1 -> "//button[@id='home']";
            case 2 -> "//button[@id='position']";
            case 3 -> "//button[@id='color']";
            case 4 -> "//button[@id='property']";
            case 5 -> "//button[contains(text(),'Disabled')]";
            case 6 -> "//h2[contains(text(),'Button Hold!')]";
            default -> throw new IllegalArgumentException("Invalid element value: " + element);
        };
        return chromeDriver.findElement(By.xpath(locator));
    }

    public WebElement selectButtonScreen(WebDriver chromeDriver){
        return chromeDriver.findElement(By.xpath(""));
    }

    public Select findDropdowns(WebDriver chromeDriver, int dropdowm){
        String locator = switch (dropdowm) {
            case 1 -> "//select[@id='fruits']";
            case 2 -> "//select[@id='superheros']";
            case 3 -> "//select[@id='lang']";
            case 4 -> "//select[@id='country']";
            default -> throw new IllegalArgumentException("Invalid dropdown value: " + dropdowm);
        };
        return new Select(chromeDriver.findElement(By.xpath(locator)));
    }

    public WebElement fruitDropdownNotification(WebDriver chromeDriver){
        return chromeDriver.findElement(By.xpath("//p[contains(text(),'You have selected Apple')]"));
    }

    public WebElement  findAlertButtons(WebDriver chromeDriver,int alert){
        String locator = switch (alert) {
            case 1 -> "//button[@id='accept']";
            case 2 -> "//button[@id='confirm']";
            case 3 -> "//button[@id='prompt']";
            case 4 -> "//button[@id='modern']";
            default -> throw new IllegalArgumentException("Invalid Button value: " + alert);
        };
        return chromeDriver.findElement(By.xpath(locator));
    }


    public WebElement alertScreenButton(WebDriver chromeDriver){
        return chromeDriver.findElement(By.xpath("//a[contains(text(),'Dialog')]"));
    }

    public WebElement alertNameNotitification(WebDriver chromeDriver){
        return chromeDriver.findElement(By.xpath("//p[@id='myName']"));
    }

    public WebElement findSweetAlert(WebDriver chromeDriver, int element){
        String locator = switch (element){
            case 1 -> "//p[contains(text(),'Modern Alert - Some people address me as sweet ale')]";
            case 2 -> "//body/app-root[1]/app-alert[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/button[1]";
            default -> throw new IllegalArgumentException("Invalid Button value: " + element);
        };
        return chromeDriver.findElement(By.xpath(locator));
    }

    public WebElement iframeScreenButton(WebDriver chromeDriver){
        return chromeDriver.findElement(By.xpath("//a[contains(text(),'Inner HTML')]"));
    }

    public WebElement findIframeElements(WebDriver chromeDriver, int element){
        String locator = switch (element){
            case 1 -> "fname";
            case 2 -> "lname";
            default -> throw new IllegalArgumentException("Invalid Button value: " + element);
        };
        return chromeDriver.findElement(By.name(locator));
    }

    public WebElement findIframeElements(WebDriver chromeDriver){
        return chromeDriver.findElement(By.xpath("//body/app-root[1]/app-innerframe[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
    }

    public WebElement iframeH1Name(WebDriver chromeDriver){
        return chromeDriver.findElement(By.xpath("//h1[contains(text(),'Frame')]"));
    }

    //Method to find radio and checkbox elements
    public WebElement findRadioCheckboxElements(WebDriver chromeDriver, int element){
        String locator = switch (element){
            case 1 -> "//input[@id='yes']";
            case 2 -> "//input[@id='no']";
            case 3 -> "//input[@id='one']";
            case 4 -> "//input[@id='two']";
            case 5 -> "//input[@id='bug']";
            case 6 -> "//input[@id='nobug']";
            case 7 -> "//input[@id='notfoo']";
            case 8 -> "//input[@id='foo']";
            case 9 -> "//input[@id='maybe']";
            case 10 -> "//input[@id='going']";
            case 11 -> "//input[@id='notG']";
            case 12 -> "//body/app-root[1]/app-radio-check[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/label[2]/input[1]";
            case 13 -> "//body/app-root[1]/app-radio-check[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/label[2]/input[1]";
            default -> throw new IllegalArgumentException("Invalid Button value: " + element);
        };
        return chromeDriver.findElement(By.xpath(locator));
    }

    //find screen button for the toggle elements method
    public WebElement toggleScreen(WebDriver chromeDriver) {
        return chromeDriver.findElement(By.xpath("//a[contains(text(),'Toggle')]"));
    }

    //Method that returns the button element for the window screen
    public WebElement windowButtonScreen(WebDriver chromeDriver){
        return chromeDriver.findElement(By.xpath("//a[contains(text(),'Tabs')]"));
    }


    //Method to find the window screen buttons elements
    public WebElement findWindowButtonsScreen(WebDriver chromeDriver, int element){
        String locator = switch (element){
            case 1 -> "//button[@id='home']";
            case 2 -> "//button[@id='multi']";
            default -> throw new IllegalArgumentException("Invalid Button value: " + element);
        };
        return chromeDriver.findElement(By.xpath(locator));
    }

    public void multipleWindowId( WebDriver chromeDriver, int element){
        Set<String> windowHandles = chromeDriver.getWindowHandles();
        List<String> list = new ArrayList<String>(windowHandles);
        chromeDriver.switchTo().window(list.get(element));
    }

    public void multipleWindowId( WebDriver chromeDriver){
        Set<String> windowHandles = chromeDriver.getWindowHandles();
        List<String> list = new ArrayList<String>(windowHandles);
        for (String s : list) {
            chromeDriver.switchTo().window(s);
            System.out.println(chromeDriver.getTitle());
        }
    }


    //Method to find the multiple elements screen button
    public WebElement screendMultipleElementsButton(WebDriver chromeDriver){
        return chromeDriver.findElement(By.xpath("//a[contains(text(),'Find Elements')]"));
                                                  //a[contains(text(),'Simple table')]
    }

    //Method to find the username input
    public WebElement inputUsername(WebDriver chromeDriver){
        return chromeDriver.findElement(By.name("username"));
    }


    //Method to find multiple elements of the github user links
    public void mulipleElements(WebDriver chromeDriver) {
        List<WebElement> elements = chromeDriver.findElements(By.xpath("(//div[@Class='block'][1]//li)"));
        for (WebElement element : elements) {
            System.out.println(element.getText());
        }
    }
    //Method to find the user image
    public WebElement usernameImage(WebDriver chromeDriver){
        return chromeDriver.findElement(By.xpath("//body/app-root[1]/app-githome[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-usercard[1]/div[1]/div[1]/div[1]/div[1]/figure[1]/img[1]"));
        }

    //Method to find multiple elements of the github user information
    public void mulipleUserElements(WebDriver chromeDriver) {
        List<WebElement> userinfo = chromeDriver.findElements(By.xpath("(//div[@Class='media-content'])"));
        for (WebElement info : userinfo) {
            System.out.println(info.getText());
        }
    }

    //Method to find the table screen
    public WebElement simpleTableButton(WebDriver chromeDriver){
        return chromeDriver.findElement(By.xpath("//a[contains(text(),'Simple table')]"));
    }

    //Method to sum table elements
    public int simpleTableHandelerSum(WebDriver ChromeDriver){
        int sum = 0;
        WebElement table = ChromeDriver.findElement(By.cssSelector("table#shopping>tbody"));
        List <WebElement> rows = table.findElements(By.tagName("tr"));
        for (int i = 0; i < rows.size(); i++){
            List <WebElement> cols = rows.get(i).findElements(By.tagName("td"));
            WebElement data = cols.get(1);
            sum = Integer.parseInt(data.getText()) + sum;
        }
        return sum;
    }

    //Method to find table elements
    public int simpleTableHandelerSumTotal(WebDriver ChromeDriver){
        WebElement data;
        int total;
        WebElement table = ChromeDriver.findElement(By.cssSelector("table#shopping>tfoot"));
        List <WebElement> rows = table.findElements(By.tagName("td"));
        data = rows.get(0).findElement(By.xpath("//b[contains(text(),'858')]"));
        total = Integer.parseInt(data.getText());
        return total;
    }

    //Method to Users table elements
    public void rajTable(WebDriver ChromeDriver){
        WebElement table = ChromeDriver.findElement(By.cssSelector("table#simpletable>tbody"));
        List <WebElement> rows = table.findElements(By.tagName("tr"));
        for (WebElement row : rows) {
            List<WebElement> cols = row.findElements(By.tagName("td"));
            WebElement data = cols.get(1);
            if(data.getText().equals("Raj")){
                cols.get(3).findElement(By.xpath("//input[@id='second']")).click();
            }
        }

    }

    //Method to find sorting table elements
       public void sortingTable(WebDriver chromeDriver) throws InterruptedException {
        //create a 2D list
        WebElement table = chromeDriver.findElement(By.xpath("//body/app-root[1]/app-simpletable[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]"));
        List <WebElement> colSorting = table.findElements(By.tagName("th")); //col headers 6
        List <List<WebElement>> data2D = new ArrayList<>(); // 2d List table
        List <String> tableStringData = new ArrayList<>();
        for(int i = 0; i < colSorting.size(); i++){
            WebElement rowHead = colSorting.get(i);
            List <WebElement> sortingButton = rowHead.findElements(By.xpath("//div[contains(@role,'button')]"));
            System.out.println(sortingButton.get(i).getText());
            for (int w = 0; w < 3; w++) {
                sortingButton.get(i).click();
                List <WebElement> rows = table.findElements(By.tagName("tr")); // rows data 5
                for (int q = 0; q < rows.size(); q++) {
                    WebElement row = rows.get(q);
                    List <WebElement> rowData = row.findElements(By.tagName("td"));
                    data2D.add(rowData);
                }
                int counter = switch (w) {
                    case 0 -> {
                        for (int j = 0; j < data2D.size(); j++) {
                            WebElement element = data2D.get(j).get(i);
                            tableStringData.add(element.getText());
                            if (j == 4) {
                                List<String> copyTableStringData = new ArrayList<>(tableStringData);
                                System.out.println(tableStringData);
                                Collections.sort(copyTableStringData);
                                System.out.println(copyTableStringData);
                                boolean sorted = copyTableStringData.equals(tableStringData);
                                System.out.println("Is sorted Ascending? " + sorted);
                                copyTableStringData.clear();
                                tableStringData.clear();
                            }
                        }
                        yield 0;
                    }
                    case 1 -> {
                        for (int j = 0; j < data2D.size(); j++) {
                            WebElement element = data2D.get(j).get(i);
                            tableStringData.add(element.getText());
                            if (j == 4) {
                                List<String> copyTableStringData = new ArrayList<>(tableStringData);
                                System.out.println("Col number " + i);
                                System.out.println(tableStringData);
                                copyTableStringData.sort(Collections.reverseOrder());
                                System.out.println("Col number " + i + " Sorted");
                                System.out.println(copyTableStringData);
                                boolean sorted = copyTableStringData.equals(tableStringData);
                                System.out.println("Is sorted Descending? " + sorted);
                                copyTableStringData.clear();
                                tableStringData.clear();
                            }
                        }
                        yield 1;
                    }
                    case 2 -> {
                        for (int j = 0; j < data2D.size(); j++) {
                            WebElement element = data2D.get(j).get(i);
                            tableStringData.add(element.getText());
                            if (j == 4) {
                                List<String> copyTableStringData = new ArrayList<>(tableStringData);
                                System.out.println("Col number " + i);
                                System.out.println(tableStringData);
                                System.out.println("Col number " + i + " Sorted");
                                System.out.println(copyTableStringData);
                                boolean sorted = copyTableStringData.equals(tableStringData);
                                System.out.println("Is sorted Mixed? " + sorted);
                                copyTableStringData.clear();
                                tableStringData.clear();
                            }
                        }
                        yield 2;
                    }
                    default -> throw new IllegalArgumentException("Invalid comparition value: " + w);
                };
                //Thread.sleep(1000);
                data2D.clear();

            }
        }

    }

    //Alert screen button test
    public WebElement alertButtonScreen(WebDriver chromeDriver){
        return chromeDriver.findElement(By.xpath("//a[contains(text(),'Timeout')]"));
    }

    //Alert accept method to find element
    public WebElement findAlertButton(WebDriver chromeDriver){
        return chromeDriver.findElement(By.xpath("//button[@id='accept']"));
    }

    //Alert wait method until the Alert is displayed
    public void awaitMethod(WebDriver chromeDriver, Duration time){
        WebDriverWait wait = new WebDriverWait(chromeDriver,time);
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println(alert.getText());
        alert.accept();
    }

    //Drag and drop screen method
    public WebElement dragAndDropScreenFinder(WebDriver chromeDriver, int element){
        String locator = switch (element){
            case 1 -> "//a[contains(text(),'AUI - 1')]";
            case 2 -> "//a[contains(text(),'AUI - 2')]";
            default -> throw new IllegalArgumentException("Invalid element value: " + element);
        };
        return chromeDriver.findElement(By.xpath(locator));
    }

    //Drag screen test elements
    public WebElement dragElement(WebDriver chromeDriver){
        return chromeDriver.findElement(By.cssSelector("#sample-box"));
    }

    //Drag and drop Element method
    public WebElement elementDragAndDropFinder(WebDriver chromeDriver, int element){
        String locator = switch (element){
            case 1 -> "//div[@id='draggable']";
            case 2 -> "//div[@id='droppable']";
            default -> throw new IllegalArgumentException("Invalid element value: " + element);
        };
        return chromeDriver.findElement(By.xpath(locator));
    }

    public WebElement formButton(WebDriver chromeDriver){
        return chromeDriver.findElement(By.xpath("//a[contains(text(),'All in One')]"));
    }







}
