package entities;

public class Notas {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double aprovacao(){
        return nota1 + nota2 + nota3;
    }

    public double notasFaltando(){
        if (aprovacao() < 60.0){
            return 60.0 - aprovacao();
        } else {
            return 0.0;
        }
    }
}
