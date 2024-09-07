import java.util.ArrayList;
import java.util.List;

import co.edu.uptc.services.ManagerTxt;

public class App {
    public static void main(String[] args) throws Exception {
        ManagerTxt managerTxt = new ManagerTxt();
        List<String> text = new ArrayList<>();
        text.add("Hello, World!");
        managerTxt.writeTxt(text, "hello.txt");
    }
}
