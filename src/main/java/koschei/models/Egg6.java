package koschei.models;

import org.springframework.stereotype.Component;

public class Egg6 {
    private final Needle7 needle;

    public Egg6(Needle7 needle) {
        this.needle = needle;
    }

    @Override
    public String toString() {
        if (needle != null) {
            return ", в яйце иголка " + needle.toString();
        } else {
            return ", в яйце иголка отсутствует";
        }
    }
}
