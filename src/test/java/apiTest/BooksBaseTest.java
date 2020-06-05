package apiTest;

import java.util.HashMap;
import java.util.Map;

public class BooksBaseTest {
    protected Map<String, String> headers;
        protected final String baseUrl = "http://booklibrarywebapidev.azurewebsites.net/";

        void booksBaseTest(){
            headers=new HashMap<>();
            headers.put("Authorization","Basic YWJjQHh5ei5jb206VGVzdHRlc3QxMjMh");
            headers.put("Content-Type","application/JSON");
        }
}
