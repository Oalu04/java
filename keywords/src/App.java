import keyword.*;

public class App {
    public static void main(String[] args) throws Exception {
        var user = new Client();

        user.setName("Jão");
        System.out.println(user.getName());
    }
}
