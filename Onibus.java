//Exemplo de classe usando a herança de veiculo
public class Onibus extends Veiculo{
    private float capacidadeCarga;
    private float cargaAtual;
    public Onibus(int codigo, String modelo){
        super(codigo, modelo);
    }
    public Onibus(int codigo, String modelo, float capacidadeCarga, float cargaAtual){
        super(codigo, modelo);
        this.capacidadeCarga = capacidadeCarga;
        this.cargaAtual = cargaAtual;
    }
    public double getEspacoDisponivel(){
        return capacidadeCarga - cargaAtual;
    }
    public double getCargaAtual(){
        return cargaAtual;
    }
}
