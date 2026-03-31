import hospital.FabricaParticular;
import hospital.Paciente;

public class Main {
    public static void main(String[] args) {

        Paciente paciente = new Paciente(new FabricaParticular());
        System.out.println(paciente.realizarConsulta());
        System.out.println(paciente.realizarExame());
    }
}