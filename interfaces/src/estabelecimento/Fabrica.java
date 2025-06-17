package estabelecimento;

import equipamento.copiadora.Copiadora;
import equipamento.digitalizadora.Digitalizadora;
import equipamento.impressora.Deskjet;
import equipamento.impressora.Impressora;
import equipamento.multifuncional.EquipamentoMultiFuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultiFuncional em = new EquipamentoMultiFuncional();

        Copiadora copiadora = em; 
        Impressora impressora = em; 
        Digitalizadora digitalizadora = em; 

        copiadora.copiar();
        impressora.imprimir();
        digitalizadora.digitalizar();
    }
}
