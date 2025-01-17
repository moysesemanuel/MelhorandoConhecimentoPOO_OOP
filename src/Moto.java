public class Moto extends Veiculo{
    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("MOTO LIGADA");
    }
    private void confereCombustivel() {
        System.out.println("CONFERINDO COMBUSTÍVEL");
    }
    private void confereCambio() {
        System.out.println("CONFERINDO CAMBIO EM N");
    }
}
