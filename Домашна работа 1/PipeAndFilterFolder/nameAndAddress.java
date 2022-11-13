package PipeAndFilterPackage;

public class nameAndAddress implements Filter<String>{

    @Override
    public String execute(String input) {
        return input.split(",")[3] + " " + input.split(",")[4];
    }
}
