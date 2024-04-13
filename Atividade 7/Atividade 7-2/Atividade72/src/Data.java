public class Data {
    String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "junho", "julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
    private int dia;
    private int mês;
    private int ano;
    public Data(String Dia, String mes, String Ano){
        dia=Integer.parseInt(Dia);
        mês=Integer.parseInt(mes);
        ano=Integer.parseInt(Ano);
        if(dia==31 && mês%2==0 && mês<8){
            if(mês==8){

            }
            else{
                dia=1;
                mês=1;
                ano=1;
            }
        }
        if(dia==30 && mês==2){
                dia=1;
                mês=1;
                ano=1;
        }
        if(dia>31 || mês>12 || ano<1){
                dia=1;
                mês=1;
                ano=1;
        }
    }

    public int getDia(){
        System.out.println(dia);
        return dia;
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
                if(objeto.dia==dia){
                    System.out.println(0);
                    return 0;
                }else if(objeto.dia<dia){
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
