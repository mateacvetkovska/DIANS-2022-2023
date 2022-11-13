package PipeAndFilterPackage;

public class toUpperCase implements Filter<String>{

    @Override
    public String execute(String input) {
        return input.toUpperCase();
    }
}
