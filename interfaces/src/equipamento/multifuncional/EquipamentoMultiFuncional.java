package equipamento.multifuncional;

import equipamento.copiadora.Copiadora;
import equipamento.digitalizadora.Digitalizadora;
import equipamento.impressora.Impressora;

public class EquipamentoMultiFuncional implements Copiadora, Digitalizadora, Impressora {

    public void copiar() {

        System.out.println("Copiando via equipamento multifuncional");

    }

    
    public void digitalizar() {

        System.out.println("Digitalizando via equipamento multifuncional");

    }

    
    public void imprimir() {

        System.out.println("Imprimindo via equipamento multifuncional");
        
    }
    
}
