public class App {
    public static void main(String[] args) throws Exception {
        NumeroInteiro numero1=new NumeroInteiro();
        NumeroInteiro numero2= new NumeroInteiro(3);
        numero2.subtrai(1);
        numero2.soma(2);
        numero2.isPrimo(numero2.numero);
        numero2.getNextPrimo(numero2.numero);
    }
}
