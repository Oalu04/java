# Pilares do POO

**Programação Orientada a Objetos** (POO), é um paradigma de programação baseado no conceito de objetos que podem conter dados na forma de campos conhecidos como atributos, e códigos, na forma de procedimentos conhecidos como métodos

Para uma linguagem ser considerada orientada a objetos, ela deve seguir **Os quatro pilares da orientação a objetos:**

+ **Encapsulamento:** Nem tudo precisa estar visível, grande parte do nosso algoritmo pode ser distribuido em métodos com finalidades específicas que complementa uma ação em nossa aplicação. 
Exemplo: Ligar um véiculo exige muitas etapas, mas para a engenharia, para o condutor basta apenas visualizar a ignição e dar a partida. 

+ **Herança:** Características e comportamentos comuns podem ser compartilhados através de uma hierarquia de objetos.
Exemplo: Um carro e uma Motocicleta possuem propriedades como placa, chassi, ano de fabricação e métodos como acelerar, frear. Logo para não ser um processo de codificação repetitiva e demorada, podemos criar uma classe **Veiculo** para que seus atributos sejam herdadas por Carro e Motocicleta

+ **Abstração:** É a indisponibilidade para determinar a lógica de um ou vários comportamentos em um objeto.
Exemplo: **Veículo** determina duas ações, acelerar e frear, logo esses comportamentos deverão ser abstratos pois existem mais de uma maneira de se realizar a mesma operação.

+ **Polimorfismo:** São as inúmeras maneiras de se realizar uma mesma ação. 
Exemplo: Veículo determina duas ações como acelerar e frear, primeiramente precisamos identificar se estaremos nos referindo a **Carro** ou **Motocicleta** para determinar a lógica de aceleração e frenagem.