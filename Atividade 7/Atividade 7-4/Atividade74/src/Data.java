//Não vou mexer com path, sei lá onde voce coloca isso
public class Data {
    private int Dia;
    private int mês;
    private int ano;

    public Data(int dia, int mês, int ano){
        Dia=dia;
        this.mês=mês;
        this.ano=ano;
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
        return Dia;
    }
    public int getMes(){
        return mês;
    }
    public int getAno(){
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