package hospital;

public class FabricaParticular implements FabricaHospital {

    @Override
    public Consulta createConsulta() {
        return new ConsultaParticular();
    }

    @Override
    public Exame createExame() {
        return new ExameParticular();
    }
}