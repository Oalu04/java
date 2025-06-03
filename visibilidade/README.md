# Visibilidade 
Em java, usamos 3 palavras reservadas e um Default para definir os tipos de visibilidade dos atributos, métodos e classes 
## Modificador Public 
Quando um método, classe ou atributo possui essa classe, isto quer dizer que qualquer outra classe em qualquer outro pacote pode visualisar seus conteúdos. 

## Modificador Default 
Este modificador de acesso define que a classe, atributo, etc só será visivel se estiver dentro do mesmo pacote. Se nenhum modificador de acesso for definido, automaticamente o Default será atribuido. 

```java
void x(){

}
```
O que antes usariamos public, agora que não definimos nenhum modificador ele será default.

## Modificador private 
Ja esse modificador ele é ainda mais restrito, permitindo visibilidade apenas dentro da própria classe. Assim mesmo classes que estão no mesmo pacote não poderão acessar os arquivos dentro de um private 