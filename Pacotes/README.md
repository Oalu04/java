# Pacotes
A linguagem java possui diversas classes cada uma com uma finalidade diferente, representação de texto, números, datas. Agora imagine se todas essas classes armazenadas em um único diretório, com ainda as classes que nós criamos?   

Para prover uma melhor organização, a linguagem Java dispõe de um recurso que organiza as classes padrão do java com as nossas que iremos criar, que são os **packages**

Pacotes são subdiretórios localizados na pasta src do nosso projeto onde ficarão localizadas as classes do nosso projeto. Existe algumas convenções para a criação das packages

## Nomenclatura 

Vamos imaginar que sua empresa se chama Power Soft e está desenvolvendo softwares comercial, governamental e software livre: 

+ **Comercial**: com.powersoft
+ **Governamental**: gov.powersoft
+ **Código Aberto**: org.powersoft

Existem essas definições para nomenclatura de pacotes, contudo podemos organizar também conforme a proposta da classe que criamos: 

+ **model**: Classes que representam a camada e o modelo da aplicação: Cliente,Pedido, NotaFiscal, Usuario.
+ **repository**: Classes ou interfaces que possuem a finalidade de interagir com tabelas no banco de dados: ClienteRepository.
+ **service**: Classes que contém regras de negócio do sistema: ClienteService possui o método para validar o CPF o cliente cadastrado.
+ **controller**: Classes que possuem a finalidade de disponibilizar os nossos recursos da aplicação para outras aplicações via padrão HTTP. 
+ **view**: Classes que possuem alguma interação com a interface gráfica acessada pelo usuário.
+ **util**: Pacote que contém classes utilitárias do sistema: FormatadorNumeroUtil. 

## Identificação 
Normalmente as classes que criamos são identificadas como, Cliente, Notafiscal, contudo quando esta classe está organizada por pacotes, ela passa a ter duas identificações. O nome simples e o nome qualificado(**endereçamento do pacote + nome**), exemplo: Considere a classe Usuario que está endereçada no pacote `com.controle.acesso.model`, o nome qualificado desta classe é: 
**`com.controle.acesso.model.Usuario`**

## Package Versus Import

A localização de uma classe é definida pela palavra reservada package, logo, uma classe só contém uma definição de package no arquivo e sempre na primeira linha de código. Para utilizar classes existentes em outros pacotes utilizamos o comando `import` para fazer a importação.

```java
package

import...
import...

public class Minhaclasse {
    
}
```