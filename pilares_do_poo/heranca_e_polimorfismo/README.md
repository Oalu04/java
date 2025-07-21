# Revisando herança e polimorfismo 

Neste nosso código criamos 4 classes cada uma com seus atributos e queremos aplicar o pilar da herança nos mesmos. Criamos a classe pai ``Employee`` que terá `Manager` e `Salesman` como subclasses. 

Não queremos que a classe `Employee` seja instanciada em nosso código principal, por isso transformamos ela em abstrata
```java
public abstract class Employee {}
```

Esta última classe chamada de cliente serve para exemplificar um controle de acesso, pois o código java permite que a classe `Cliente` herde os atributos da classe pai `Employee`, porém em questão de lógica não faz sentido um cliente ter acesso aos atributos de um empregado ou de um vendedor. Para resolvermos esse problema deixamos `Salesman` como final, assim nenhuma outra classe pode extender dela

```java
public final class Salesman extends Employee{}
```

Contudo, para nossa classe pai utilizar a propriedade final precisariamos descartar a abstrata, algo que não queremos. Todavia a nossa nova propriedade `sealed` está aqui para nos trazer a solução, parecida com o final mas com um poder maior, ela faz com que classes que não são permitidas não consigam herdar seus valores, nós podermos definir quais classes queremos que sejam permitidas utilizando o `permits`.

```java
public sealed abstract class Employee permits Manager, Salesman{}
```

>[!NOTE] 
> A propriedade `permits` só funciona para classes que são sealed, non-sealed ou final.

```java
public non-sealed class Manager extends Employee {}
public final class Salesman extends Employee{}
```

## Instance of

Com toda nossa hierarquia montada queremos agora de forma generica acessar nossos atributos utilizando apenas uma instanciação. Não conseguiremos fazer isso diretamente, pois nossa classe `Employee` ela é abstrata e não consegue ser instanciada, mas podemos fazer uma pequena manipulação para chegar no resultado: 

```java
public static void main(String[] args) throws Exception {

        Employee manager = new Manager();
    
    }
```

Como a classe `Manager` é uma classe filha de `Employeee` ela pode ser instanciada como um tipo `Employee` contudo dessa forma não conseguimos ter acesso as propriedades da classe manager apenas a da Employee. 

```java
static void printEmployee(Employee employee) {
        employee.setName("João");
        ((Manager)employee).setLogin("joao");
        ((Manager)employee).setPassword("123456");
        

        System.out.printf("=======%s=======\n", employee.getClass().getCanonicalName());
        System.out.println(employee.getName());
        System.out.println(((Manager)employee).getLogin());
        System.out.println(((Manager)employee).getPassword());
        System.out.println("==============");
    }
```
Para resolvermos isso criamos um método que recebe como parâmetro a classe Employee, portanto somente classes filhas dela são permitidas e fazendo um **casting** (uma conversão de tipo) transformamos um tipo `Employee` em um tipo `Manager`, dessa forma sim conseguimos ter acesso as propriedades do `Manager`. 

Porem, fazendo desse modo não conseguimos ter acesso à classe `Salesman` pois deixamos claros na nossa conversão para transformar em um tipo Manager, mas com o uso de estruturas condicionais, somado com o nosso novo comando resolveremos isso sem nenhum problema. 

O operador `instanceOf` é usado para verificar se um objeto é uma instância de uma determinada classe ou interface.
Nas versões mais atualizadas do java para não precisarmos escrever toda linha de código para fazer um casting, podemos criar uma variavel no comando instanceOf para facilitar o processo de escrita: 

```java
static void printEmployee(Employee employee) {
        System.out.printf("=======%s=======\n", employee.getClass().getCanonicalName());
        if (employee instanceof Manager manager) {
            manager.setName("João");
            manager.setLogin("joao");
            manager.setPassword("123456");

            System.out.println(employee.getName());
            System.out.println(manager.getLogin());
            System.out.println(manager.getPassword());
        }
        System.out.println("==============");
    }
```

## Herança com construtores 

Ao definirmos que nossa classe pai terá um construtor com argumentos, precisamos que as classes filhos dela possuam os mesmos argumentos apresentados: 

```java
public sealed abstract class Employee permits Manager, Salesman{
    public Employee(String code, String name, String address, int age, double salary) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }
}
```

```java
public non-sealed class Salesman extends Employee{ 
    public Salesman(String code, String name, String address, int age, double salary) {
        super(code, name, address, age, salary);
    }
}
```
```java
public non-sealed class Manager extends Employee{
     public Manager(String code, String name, String address, int age, double salary) {
        super(code, name, address, age, salary);
    }
}
```

O comando `super` ele serve como uma referencia para a classe pai e as classes filhas utilizam para acessar os valores da classe pai. 
