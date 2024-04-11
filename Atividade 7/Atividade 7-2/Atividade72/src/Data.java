import javax.swing.JOptionPane;

public class Data {
    String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "junho", "julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
    private int Dia;
    private int mês;
    private int ano;
    public Data(){
        Dia=Integer.parseInt(JOptionPane.showInputDialog("Insira o dia atual"));
        mês=Integer.parseInt(JOptionPane.showInputDialog("Insira o mês atual"));
        ano=Integer.parseInt(JOptionPane.showInputDialog("Insira o ano atual"));
        if(Dia==31 && mês%2==0){
            if(mês==8){

            }
            else{
                Dia=1;
                mês=1;
                ano=1;
            }
        }
        if(Dia==30 && mês==2){
                Dia=1;
                mês=1;
                ano=1;
        }
        if(Dia>31 || mês>12 || ano<1){
                Dia=1;
                mês=1;
                ano=1;
        }
    }

    public int getDia(){
        System.out.println(Dia);
        return Dia;
    }
    public int getMes(){
        System.out.println(mês);
        return mês;
    }
    public void getMesExtenso(){
        System.out.println(meses[mês-1]);
    }
    public int getAno(){
        System.out.println(ano);
        return ano;
    }
    public int compara(Data objeto){
        if(objeto.ano==ano){
            if(objeto.mês==mês){
                if(objeto.Dia==Dia){
                    System.out.println(0);
                    return 0;
                }else if(objeto.Dia<Dia){
                    System.out.println(1);
                    return 1;
                }
                else{
                    System.out.println(-1);
                    return -1;
                }
            }else if(objeto.mês<mês){
                System.out.println(1);
                return 1;
            }
            else{
                System.out.println(-1);
                return -1;
            }
        }else if(objeto.ano<ano){
            System.out.println(1);
            return 1;
        }
        else{
            System.out.println(-1);
            return -1;
        }
    }
}
