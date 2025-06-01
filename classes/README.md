# Classes 
Toda estrutura de código em java é distribuido em arquivos com extensão **.java** denominados de **classe**.

Todas as classes são compostas por: 
**Identificador, Características** e **Comportamentos**

+ **Classe**(class): Local ou estrutura que direciona a criação de objetos de mesmo tipo.
+ **Identificador**: Serve para termos uma ideia do objetivo dos objetos que serão criados.
+ **Características**: São os atributos ou propriedades dos objetos que serão criados. 
+ **Comportamentos**: É toda parte comportamental que compõe um objeto. 
+ **Instanciar**(new): É o ato de criar um objeto a partir da estrutura feita para a determinada classe. 

![Ilustração de uma classe Estudente e 03 objetos criados](<image (9).png>)

Em termos de código primeiro nós definimos a estrutura para assim podermos adicionar as características e os comportamentos. 

```java
// Criando a classe Student
// Com todas as características e compartamentos aplicados

public class Student {
    String name;
    int age;
    Color color;
    Sex sex;

    void eating(Food food){
      //NOSSO CÓDIGO AQUI
    }
    void drinking(Eat eat){
      //NOSSO CÓDIGO AQUI
    }
    void running(){
      //NOSSO CÓDIGO AQUI
    }
}

```

```java
// Criando objetos a partir da classe Student

public class School {
    public static void main(String[] args) throws Exception {
      Student student1 = new Student();
      student1.name= "John";
      student1.age= 12;
      student1.color= Color.FAIR;
      student1.sex= Sex.MALE;

      Student student2 = new Student();
      student2.name= "Sophia";
      student2.age= 10;
      student2.color= Color.FAIR;
      student2.sex= Sex.FEMALE;

      Student student3 = new Student();
      student3.name= "Lily";
      student3.age= 11;
      student3.color= Color.DARK;
      student3.sex= Sex.FEMALE;
    }
}
```