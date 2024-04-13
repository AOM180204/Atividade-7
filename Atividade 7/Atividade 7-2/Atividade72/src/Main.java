import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        String str=JOptionPane.showInputDialog("Insira a data no formato DD/MM/AAAA");
        String[] data=str.split("/");
        String Dia=data[0];
        String mês=data[1];
        String ano=data[2];
        Data data1= new Data(Dia, mês, ano);
        Data data2= new Data("12","12","2023");
        data1.getDia();
        data1.getMes();
        data1.getAno();
        data1.getMesExtenso();
        data1.compara(data2);
    }
}
