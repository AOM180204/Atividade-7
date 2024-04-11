import java.util.*;

public class Info {
    public int[] ocupados=new int[100];
    private Data data;
    private int numero;
    int i;
    

    public Info(int numeroVoo, int dia, int mes, int ano){
        this.data= new Data(dia, mes, ano);
        this.numero=numeroVoo;

        
    }

    void getVoo(){
        System.out.println(numero);
    }
    void getData(){
        System.out.println(data.getDia()+"/"+data.getMes()+"/"+data.getAno());
    }

    void proximoLivre(int assento){
        Arrays.sort(ocupados);
        for(int i=0;i<ocupados.length;i++){
            if(assento>ocupados[i] && assento<ocupados[i+1]){
                System.out.println("Proximo livre é "+ocupados[i]+1);
            }
        }
    }

    void vagas(){
        System.out.println(100-i+" livres");
    }

    void ocupa(int assento){
        int teste=assento;
        if(i==0){
            ocupados[0]=teste;
            i++;
        }
        else{
        if(verifica(teste)==false){
            System.out.println("Assento ocupado");
            proximoLivre(teste);
            
        }
        ocupados[ocupados.length]=teste;
        i++;
    }
    }

    boolean verifica(int assento){
        int i;
        for(i=0;i<ocupados.length;i++){
            if(ocupados[i]==assento){
                i=-1;
                break;
            }
            else{
                i=1;
            }
        }
        if(i==-1){
            System.out.println("Assento ocupado");
            return false;
        }
        else{
            return true;
        }
    }
}
