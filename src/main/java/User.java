import javax.swing.text.html.Option;
import java.util.Scanner;

public class User {
    private String name;
    private RPS choose;
    private Scanner input = new Scanner(System.in);

    public User() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Scanner getNameInput() {
        return input;
    }

    public void setNameInput() {
        this.name = input.next();
    }

    public RPS getChoose() {
        return choose;
    }

    public void setChoose(RPS choose) {
        this.choose = choose;
    }


}

