# Interfaces 

O pilar da herança nos traz uma forma de uma classe conseguir distribuir suas funções para outras que serão seus "filhos", utilizando a palavra reservada `extends`. E em algumas situações poderiamos precisar que uma classe "filho" ou **subclasse** tivesse as características de outras classes, mas o java não permite isso, não usando o extends. 

```java
public class EquipamentoMultiFuncional extends Copiadora, Impressora{
    public static void main(String[] args) {
        
    }
}

```

Em nosso exemplo criamos uma copiadora uma digitalizadora e uma impressora e queremos que nossa classe principal tenha os atributos das duas, porém o java não aceita que fazemos desta forma. 

![visualização de pacotes](Captura%20de%20tela%202025-06-12%20182335.png)

Depois de termos feito todo o tratamento de pacotes, por pura organização e visualização de código, para fazermos com que nossa classe principal possua as características da impressora, copiadora e digitalizadora precisamos transformar essas classes como interfaces.

```java
package equipamento.copiadora;
public interface Copiadora {
    public void copiar();
      
}

```
Parecido como fizemos quando transformamos uma classe em abstrata, você apenas informa os "contratos" que as classes que irão extender dessa principal terá, mas agora não usamos o `extends` e sim o `implement`: 

```java
package equipamento.copiadora;
public class Xerox implements Copiadora {

   
    public void copiar() {
        System.out.println("Copiando");
    }

}

```

E repetiremos esse processo para todos os nossos equipamentos e agora assim adicionaremos as características para a classe nossa classe Multifuncional: 

```java

package equipamento.multifuncional;

import equipamento.copiadora.Copiadora;
import equipamento.digitalizadora.Digitalizadora;
import equipamento.impressora.Impressora;

public class EquipamentoMultiFuncional implements Copiadora, Digitalizadora, Impressora {

    public void copiar() {

    }

    
    public void digitalizar() {
        
    }

    
    public void imprimir() {

    }
    
}

```
<br>
Como essa classe está implementando as outras interfaces ela também precisa seguir seus contratos. 

```java
package estabelecimento;

import equipamento.impressora.Deskjet;
import equipamento.impressora.Impressora;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new Deskjet();

        impressora.imprimir();
    }
}

```

Nosso código agora funciona normalmente, instanciamos nosssa interface com a impressora que escolhemos, se trocarmos para o outro tipo de impressora funcionará igualmente.

<br>

```java
package estabelecimento;

import equipamento.impressora.Deskjet;
import equipamento.impressora.Impressora;
import equipamento.multifuncional.EquipamentoMultiFuncional;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new EquipamentoMultiFuncional();

        impressora.imprimir();
    }
}

```
E funcionará da mesma forma se utilizarmos o EquipamentoMultiFuncional.
