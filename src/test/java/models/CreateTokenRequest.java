package models;

public class CreateTokenRequest {
    String email;
    String password;

    public CreateTokenRequest(String name, String pass) {
        this.email = name;
        this.password = pass;
    }
}
