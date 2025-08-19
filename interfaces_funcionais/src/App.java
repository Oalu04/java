import java.util.List;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) throws Exception {
        List<User> users = List.of(new User("Maria", 21), (new User("Joao", 32)), (new User("Eduardo", 40)),
                new User("Ana", 19));

        var consumer = new Consumer<User>() {

            @Override
            public void accept(User user) {
                System.out.println(user);
            }

        };
        users.forEach(consumer);
    }
}
