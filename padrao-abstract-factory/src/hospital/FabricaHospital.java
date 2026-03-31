package hospital;

public interface FabricaHospital {
    Consulta createConsulta();
    Exame createExame();
}