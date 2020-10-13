package main;

/**
 * Spooky ghost for Halloween
 */
public class Ghost {
    private final String name;
    private final String nickname;
    private final String color;


    public Ghost(String name, String nickname, String color) {
        this.name = name;
        this.nickname = nickname;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public String getColor() {
        return color;
    }
}
