import transporte.Andar;
import transporte.Aviao;
import transporte.Busao;
import transporte.Caminhada;
import transporte.Carro;
import transporte.Skate;
import transporte.Veiculo;

public class Principal {
    public static void main(String[] args) {
        
        Carro Ka = new Carro();
        Ka.locomover();

        Veiculo Roberto = new Busao();
        Roberto.locomover();

        Veiculo EMBRAER = new Aviao();
        EMBRAER.locomover();

        Veiculo Transformer = new Veiculo();
        Transformer.locomover();

        Caminhada Noparque = new Caminhada();
        Noparque.locomover();
        
        Caminhada Rapida = new Andar();
        Rapida.locomover();

        Skate Cachorro = new Skate();
        Cachorro.locomover();
    }
}