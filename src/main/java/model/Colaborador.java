package model;

public class Colaborador {

    private Contrato contrato;
    private FolhaBeneficios folhaBeneficios;

    public Colaborador(FabricaAbstrata fabricaAbstrata) {
        this.contrato = fabricaAbstrata.createContrato();
        this.folhaBeneficios = fabricaAbstrata.createFolhaBeneficios();
    }

    public String emitirContrato() {
        return this.contrato.emitir();
    }

    public String emitirFolhaBeneficios() {
        return this.folhaBeneficios.emitir();
    }
}
