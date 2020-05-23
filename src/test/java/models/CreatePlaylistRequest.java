package models;

public class CreatePlaylistRequest {
    public String name;
    public String[] rules;

    public CreatePlaylistRequest(String name, String[] rules) {
        this.name = name;
        this.rules = rules;
    }
}
