package keyword;

public class Client {
    private String name;

    private int age;

    private Address address = new Address();

    public String getName() {
        System.out.println(address.description);
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
