import java.util.Locale;

public class greetclass {


    public static String greetmethod(Object name) {
        Object myStringArray;
        myStringArray = new String[]{};

        if (name instanceof String) {
            if (name == null) {
                return "Hey my friend";
            } else if (name == name.toString().toUpperCase(Locale.ROOT)) {
                return "HELLO" + name;

            } else
                return "greeting, " + name;
        } else if (name instanceof String[]) {
            myStringArray = name;
        }
        return "Hello" + name;
    }


}
