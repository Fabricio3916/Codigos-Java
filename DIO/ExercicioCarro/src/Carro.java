public class Carro {
    private int velocidade = 0;
    private int marcha = 0;
    private boolean estaLigado = false;

    public void ligarCarro(){
        this.estaLigado = true;
        System.out.println("Ligando o carro...");
    }

    public void desligarCarro(){
        if(marcha > 0 || velocidade > 0){
            System.out.println("Desacelere o carro antes de desligar.");
        }else {
            estaLigado = false;
            System.out.println("Desligando o carro...");
        }
    }

    public void acelerar(){
        if(!verificaSeEstaLigado()) return;
        if (velocidade == 120){
            System.out.println("Carro ja atingiu velocidade máxima");
        }else{
            velocidade += 1;
            System.out.println("Acelerando...");
        }

    }

    public void dimininuirVelocidade(){
        if(!verificaSeEstaLigado()) return;
        if (velocidade == 0){
            System.out.println("Carro ja esta parado");
        }else{
            velocidade -= 1;
            System.out.println("Desacelerando...");
        }
    }

    public void virarEsquerda(){
        if(!verificaSeEstaLigado()) return;
        if (velocidade < 1 || velocidade > 40 ){
            System.out.println("Impossivel virar o carro com esta velocidade.");
        }else{
            System.out.println("Virando para esquerda...");
        }
    }

    public void virarDireita(){
        if(!verificaSeEstaLigado()) return;
        if (velocidade < 1 || velocidade > 40 ){
            System.out.println("Impossivel virar o carro com esta velocidade.");
        }else{
            System.out.println("Virando para direita...");
        }
    }

    public void trocarMarcha(){
        if(!verificaSeEstaLigado()) return;
        if(marcha =)
    }

    public boolean verificaSeEstaLigado(){
        if(!this.estaLigado){
           System.out.println("O Carro esta desligado e não poderá executar ação");
           return false;
        }
        return true;
    }

}


