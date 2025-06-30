public record Person(String name, int age) {

    public String getInfo() {
        return "Name: " + this.name + " age: " + this.age;
    }
}
