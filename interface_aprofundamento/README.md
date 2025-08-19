# Inicializando propriedades em interfaces

Começaremos inicializando alguns métodos para a nossa interface, lembre-se que quando trabalhamos com interfaces nossos métodos não possuem corpo e sempre são considerados ``abstract``.

```java
public interface MusicPlayer {

    abstract void playMusic();

    abstract void pauseMusic();

    abstract void stopMusic();

}       

```
Como interfaces trabalham com méotodos abstratos, qualquer função que criarmos ela será considerada como abstrata, assim podemos diminuir um pouco a escrita de código removendo o operador ``abstract`` dos métodos
```java
public interface MusicPlayer {
    void playMusic();

    void pauseMusic();

    void stopMusic();
 
}       

```
O mesmo pensamento serve para criarmos variáveis, elas sempre serão `Public`, `static` e `final`.

Vamos agora criar 3 novas classe chamadas `Smartphone`, `Computer` que implementarão `MusicPlayer` e `VideoPlayer`
e `MusicBox` que implementará MusicPlayer, ja que uma caixa de som não reproduz video.







## Curiosidades 
Vamos agora criar uma nova interface denominada `VideoPlayer` que irá extender `MusicPlayer`. Normalmente como nossos métodos são abstratos precisariamos implementá-los nas classes que extendem dela, mas o java entende que quando se trata de relações com interfaces não precisa ser feito essa ação. 



```java
public  interface VideoPlayer extends MusicPlayer {  
    void playVideo();

    void pauseVideo();

    void stopVideo();
}
```

>[!NOTE]
> Interfaces não possuem implementação, então não precisam implementar métodos de outras interfaces, quando uma interface A herda uma interface B, ela automaticamente herda os métodos abstratos sem precisar implementá-los



Criaremos um record chamado `MusicBox` e faremos com que ele implemente a interface MusicPlayer. Lembrando que quando trabalhamos com records por se tratar de uma classe com propriedade final, não é possivel que outras classes extendam dela mas elas são capazes de implementar interfaces.

```java
public record MusicBox(String music, boolean isPaused) implements MusicPlayer {

    public void playMusic() {
        
    }

    public void pauseMusic() {
        
    }

    public void stopMusic() {
        
    }
}   
```