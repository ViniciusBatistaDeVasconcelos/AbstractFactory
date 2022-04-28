package model;

public class FabricaCLT implements FabricaAbstrata {

    @Override
    public Contrato createContrato() {
        return new ContratoCLT();
    }

    @Override
    public FolhaBeneficios createFolhaBeneficios() {
        return new FolhaBeneficiosCLT();
    }
}
