package PipeAndFilterPackage;

public class filterCity implements Filter<String>{
    @Override
    public String execute(String input) {
        return input.split(",")[5];
    }
}
