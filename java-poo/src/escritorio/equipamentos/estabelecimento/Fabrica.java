package escritorio.equipamentos.estabelecimento;

import escritorio.equipamentos.copiadora.Copiadora;
import escritorio.equipamentos.digitalizadora.Digitalizadora;
import escritorio.equipamentos.impressora.Impressora;
import escritorio.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {

        //pode representar qualquer um dos 3 papéis que foi definido dentro da minha estrutura de objetos
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
