public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("8764654");
        jeep.ligar();

        Moto yamaha = new Moto();
        yamaha.setChassi("5648432");
        yamaha.ligar();
    }
}
