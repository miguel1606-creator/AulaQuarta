import transporte.Carro;
import transporte.Veiculo;
import transporte.Busao;

public class Principal {
    public static void main(String[] args) {
        
        Carro Ka = new Carro();
        Ka.locomover();

        Veiculo Roberto = new Busao();
        Roberto.locomover();
    }
}