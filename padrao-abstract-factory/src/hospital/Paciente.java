package hospital;

public class Paciente {

    private Consulta consulta;
    private Exame exame;

    public Paciente(FabricaHospital fabrica) {
        this.consulta = fabrica.createConsulta();
        this.exame = fabrica.createExame();
    }

    public String realizarConsulta() {
        return this.consulta.realizar();
    }

    public String realizarExame() {
        return this.exame.realizar();
    }
}