package pageObjects;

public class HomePageSelectorsOne {


        public static final String homeButtonXpath = "//*[@class='home active']";
        public static final String plusButtonXPath = "//*[contains(@class,'create')]";

        public static final String newPlaylistFieldXpath = "//*[@class='create']/*";
        public static final String allSongsButtonXpath = "//*[@href='#!/songs']";
        public static final String titleOfSongXpath = "(//*[@class= 'title'])[3]";
        public static final String addSongToPlayListxpath = "(//*[@class= 'has-sub'])[1]";
        public static final String addToButtonXPath = "//button[contains(text(),'Add')]";
        public static final String createNewPlayListFieldXpath = "(//*[@data-v-f7ac59cc and @placeholder= 'Playlist name'])[2]";
        public static final String saveNewPlayListButtonXpath = "(//*[@data-v-f7ac59cc and @type= 'submit'])[2]";
        public static final String deletePlayListButtonXpath = "//*[@title='Delete this playlist']";
        public static final String okForDeletePlayListXpath = "//button[@class='ok']";
    }

