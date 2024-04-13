public class Main {
    public static void main(String[] args) throws Exception {
        String str=JOptionPane.showInputDialog("Insira a hora no formato HH:MM:SS");
        String[] hora=str.split(":");
        String Hora=hora[0];
        String Minuto=hora[1];
        String Segundo=hora[2];
        Hora hora1= new Hora(Hora, Minuto, Segundo);
        Hora hora2= new Hora("23", "40", "30");
        hora1.getHoras();
        hora1.getMinutos();
        hora1.getSegundos();
        hora1.compara(hora2);
        hora1.displayHora();
    }
}

