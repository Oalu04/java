# Enums
Enum é um tipo de classe onde os objetos são previamente criados(eles ja existem mesmo sem nós precisarmos utilizar um `new`), imutáveis e disponiveis para toda a aplicação.

Utilizamos enums quando nossa estrutura possui valores que não vão sofrer tantas alterações, pode ser o nome de uma pessoa ou estado, duas coisas que dificilmente são alteradas.

>[!CAUTION]
> Constantes não são a mesma coisa do que Enums,
Constantes são variáveis de tipo com valores imutáveis, já um Enum é um conjunto de objetos que serão pré-estabelecidos, possuindo todas as características de um objeto como atributos e métodos.

Ex: 
```java 
public enum EstadoBrasileiro {
    SAO_PAULO("SP", "São Paulo"), 
    RIO_JANEIRO("RJ", "Rio de Janeiro"), 
    PIAUI("PI", "Piauí"), 
    MARANHAO("MA", "Maranhão"); 

    private String nome; 
    private String sigla; 

    private EstadoBrasileiro(String sigla, String nome) {
        this.sigla = sigla; 
        this.nome = nome;
    }

    public String getSigla() {
        return sigla; 
    }

    public String getNome() {
        return nome; 
    }

    public String getNomeMaiusculo() {
        return nome.toUppercase();
    }
}
```
