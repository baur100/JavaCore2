package pageObjects;

public class HomePageSelectors {
    public static final String homeButtonXpath = "//*[@class='home active']";
    public static final String addPlaylistButtonXpath = "//i[@class='fa fa-plus-circle control create']";
    public static final String newPlaylistFieldXpath = "//*[@placeholder='↵ to save']";
    public static final String deletePlaylistButtonXpath = "//button[@class='del btn btn-red btn-delete-playlist']";
    public static final String findPlaylistXpath = "//a[contains(text(),'ag20')]";
    public static final String successShowAlertXpath = "//div[@class='success show']";
    public static final String lastPlaylistXpath = "//*[@id='playlists']/ul/li[last()]";
    public static final String activePlaylistXpath = "//li[@class='playlist playlist editing']//input";
    public static String playlitsName;
    public static final String playlitsNameXpath = " //span[contains(text(),'" + playlitsName + "')]";
}