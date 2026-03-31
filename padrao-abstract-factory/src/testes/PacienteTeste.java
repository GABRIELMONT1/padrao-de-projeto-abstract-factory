package hospital;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PacienteTeste {

    @Test
    void deveRealizarConsultaParticular() {
        Paciente paciente = new Paciente(new FabricaParticular());
        assertEquals("Consulta Particular", paciente.realizarConsulta());
    }

    @Test
    void deveRealizarExameParticular() {
        Paciente paciente = new Paciente(new FabricaParticular());
        assertEquals("Exame Particular", paciente.realizarExame());
    }
}