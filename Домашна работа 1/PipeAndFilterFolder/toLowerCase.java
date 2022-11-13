package PipeAndFilterPackage;

import java.util.Locale;

public class toLowerCase implements Filter<String>{

    @Override
    public String execute(String input) {
        return input.toLowerCase();
    }
}
