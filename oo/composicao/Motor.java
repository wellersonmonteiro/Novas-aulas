package oo.composicao;

public class Motor {
    boolean ligado = false;
    Carro carro;
    double fatorInjecao =1;
    Motor(Carro carro){
        this.carro = carro;
    }
    int giros(){
        if(!ligado){
            return 0;
        }
        else{
        return (int) Math.round(fatorInjecao*3000);}
    }
}
