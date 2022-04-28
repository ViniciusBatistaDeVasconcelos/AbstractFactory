package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColaboradorTest {

    /**
     * Testes - Contrato
     */
    @Test
    void deveEmitirContratoCLT() {
        FabricaAbstrata fabrica = new FabricaCLT();
        Colaborador colaborador = new Colaborador(fabrica);
        assertEquals("Contrato CLT", colaborador.emitirContrato());
    }

    @Test
    void deveEmitirContratoTemporario() {
        FabricaAbstrata fabrica = new FabricaTemporario();
        Colaborador colaborador = new Colaborador(fabrica);
        assertEquals("Contrato Temporário", colaborador.emitirContrato());
    }

    @Test
    void deveEmitirContratoJovemAprendiz() {
        FabricaAbstrata fabrica = new FabricaJovemAprendiz();
        Colaborador colaborador = new Colaborador(fabrica);
        assertEquals("Contrato Jovem Aprendiz", colaborador.emitirContrato());
    }

    /**
     * Testes - Folha de Benefícios
     */
    @Test
    void deveEmitirFolhaBeneficiosCLT() {
        FabricaAbstrata fabrica = new FabricaCLT();
        Colaborador colaborador = new Colaborador(fabrica);
        assertEquals("Folha de Benefícios CLT", colaborador.emitirFolhaBeneficios());
    }

    @Test
    void deveEmitirFolhaBeneficiosTemporario() {
        FabricaAbstrata fabrica = new FabricaTemporario();
        Colaborador colaborador = new Colaborador(fabrica);
        assertEquals("Folha de Benefícios Temporário", colaborador.emitirFolhaBeneficios());
    }

    @Test
    void deveEmitirFolhaBeneficiosJovemAprendiz() {
        FabricaAbstrata fabrica = new FabricaJovemAprendiz();
        Colaborador colaborador = new Colaborador(fabrica);
        assertEquals("Folha de Benefícios Jovem Aprendiz", colaborador.emitirFolhaBeneficios());
    }


}