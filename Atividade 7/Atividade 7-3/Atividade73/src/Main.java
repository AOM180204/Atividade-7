public class Main {
    public static void main(String[] args) throws Exception {
        Hora hora1= new Hora(23, 44, 30);
        Hora hora2= new Hora(23, 40, 30);
        hora1.getHoras();
        hora1.getMinutos();
        hora1.getSegundos();
        hora1.compara(hora2);
        hora1.displayHora();
    }
}
