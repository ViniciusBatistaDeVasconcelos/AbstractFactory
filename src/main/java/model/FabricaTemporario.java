package model;

public class FabricaTemporario implements FabricaAbstrata {

    @Override
    public Contrato createContrato() {
        return new ContratoTemporario();
    }

    @Override
    public FolhaBeneficios createFolhaBeneficios() {
        return new FolhaBeneficiosTemporario();
    }
}
