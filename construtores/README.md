# Construtores 

Para criar um objeto na linguagem java utilizamos a seguinte sintaxe: 

```java
1 Classe novoObjeto = new Classe();
```

Esse código cria um novo objeto na memória, passo que denominamamos como **instanciar** um novo objeto.

Criaremos uma nova pessoa, mas neste caso não utilizaremos o método set para mudar os valores: 

```java
public class SistemaCadastro {
	public static void main(String[] args) {
		//criamos uma pessoa no sistema
		Pessoa marcos = new Pessoa();
		
		//definimos o endereço de marcos
		marcos.setEndereco("RUA DAS MARIAS");
		
		//e como definir o nome e cpf do marcos ?
		
		//imprimindo o marcos sem o nome e cpf
		
		System.out.println(marcos.getNome() + "-" + marcos.getCpf());
	}
}

```
Agora criaremos um construtor para criar nossos objetos com valores requiridos no momento da criação: 

```java 
public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	
	// método construtor
	// o nome deverá ser igual ao nome da classe
    // Não deve retornar nada
	public Pessoa (String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}

}
```

Feito isso alteraremos nosso código principal para que o objeto seja criado com os requerimentos que escolhemos? 

```java 
public class SistemaCadastro {
	public static void main(String[] args) {
		//criamos uma pessoa no sistema
		Pessoa marcos = new Pessoa("06724506716","MARCOS SILVA");
		
	}
}
```

Os construtores servem primordialmente para garantir que na inicialização de um objeto nós ja informemos os atributos que julgamos como relevantes.

>[!ATTENTION]
> Não é uma boa prática criarmos construtores para todos os atributos que desejamos armazenar no nosso objeto. Você deve selecionar qual tipo de dado é mais relevante para o objeto e assim usar um construtor. Por exemplo, o dado mais relevante para um objeto aluno, seria seu nome e matricula provavelmente, cabe você a julgar dependendo do que quer criar.