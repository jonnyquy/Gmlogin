//Dùng Chromedriver.exe 
    String CodeCmd = "\"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe\" --profile-directory=\"Default\" --remote-debugging-port=1998 -- \"%1\"";
    ChromeDriverService service = new ChromeDriverService.Builder().usingDriverExecutable(new File("F:\\ProjectJava\\BotViewYoutube\\BotViewYoutube\\chromedriver.exe")).build();
    System.setProperty("webdriver.chrome.driver", "F:\\ProjectJava\\BotViewYoutube\\BotViewYoutube\\chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
    options.setExperimentalOption("debuggerAddress", "127.0.0.1:1999");
    options.addArguments("--auto-open-devtools-for-tabs");
    UndetectChromeDriver driver = new UndetectChromeDriver(service, options);
    driver.Get("https://www.google.com.vn/");

//Code Chạy gpmdriver.exe
String codeGMLogin=    "F:\ProjectJava\Change Chrome Selenium Webdriver\GPMLogin_v139\GPMLogin.exe" --mode=open --profile_id=tegk7ozquvg5dmhim8iy1qenanwf2ccwsbac2rqib5ia07n2t5 --remote-port=1999
    System.setProperty("webdriver.chrome.driver", "F:\\ProjectJava\\Change Chrome Selenium Webdriver\\GPMLogin_v139\\gpmdriver.exe");
    File file = new File("F:\\ProjectJava\\Change Chrome Selenium Webdriver\\GPMLogin_v139\\gpmdriver.exe");
    ChromeDriverService service = new ChromeDriverService.Builder().usingDriverExecutable(file).build();
    ChromeOptions options = options = new ChromeOptions();
    options.setExperimentalOption("debuggerAddress", "127.0.0.1:" + port);
    options.addArguments("--auto-open-devtools-for-tabs");
    driver = new UndetectChromeDriver(service, options);
    driver.Get("https://www.google.com/");
