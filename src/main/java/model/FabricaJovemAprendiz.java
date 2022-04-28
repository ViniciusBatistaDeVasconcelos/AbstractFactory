package model;

public class FabricaJovemAprendiz implements FabricaAbstrata {

    @Override
    public Contrato createContrato() {
        return new ContratoJovemAprendiz();
    }

    @Override
    public FolhaBeneficios createFolhaBeneficios() {
        return new FolhaBeneficiosJovemAprendiz();
    }
}
