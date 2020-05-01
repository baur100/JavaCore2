package enums;

public enum DriverType {
    CHROME,
    FIREFOX;

    public String getChromeClass() {
        return "webdriver.chrome.driver"; }

    public String getChromeFile() {
        return "chromedriver.exe"; }

    public String getFireFoxClass() {
        return "webdriver.gecko.driver"; }

    public String getFireFoxFile() {
        return "geckodriver.exe"; }
}
