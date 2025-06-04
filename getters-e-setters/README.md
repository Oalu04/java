# Getters e Setters 
Os métodos "Getters" e "Setters" são usados para buscar valores ou definir novos valores de atributos dos objetos de classes. 
 
O método **Getter** retorna o valor do atributo especificado. 

O método **Setter** define outro novo valor para o atributo especificado. 

```java
public class Aluno {
    String nome; 
    int idade; 
}

public class Escola {
    public static void main (String[] args) {
        Aluno felipe = new Aluno();
        felipe.nome = "Felipe";
        felipe.idade = 8;

        System.out.println("O aluno " + felipe.nome + " tem " + felipe.idade + " anos");
    }
}    
```

Seguindo a convenção, uma classe que possua esse tipo de estrutura deve seguir algumas regras abaixo: 

+ Os atributos precisam ter o modificador de acesso `private`.

+ Agora que os atributos estarão em nivel de classe, precisaremos dos 
métodos **get**X e **set**X. Ex: getNome() e setNome(String novoNome).

+ O método **get** é responsável por obter o valor atual do atributo, logo ele precisa ser public e retorna o tipo correspondente ao valor. 
Ex: Para retornar uma String: `public String getNome() {}`

+ O método **set** é responsável por definir ou modificar o valor de um atributo em um objeto logo ele também precisa ser public, receber um parâmetro do mesmo tipo da variável mas que não retorne nenhum valor 
Ex: `public void setNome(String newNome);`