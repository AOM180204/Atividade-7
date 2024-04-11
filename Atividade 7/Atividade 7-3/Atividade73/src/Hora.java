public class Hora {
    private int hora;
    private int minutos;
    private int segundos;
    public Hora(int hora, int minutos, int segundos){
        if(hora>23 || minutos>59 || segundos>59){
            hora=0;
            minutos=0;
            segundos=0;
    }
    else{
        this.hora=hora;
        this.minutos=minutos;
        this.segundos=segundos;
    }
}

    public int getHoras(){
        System.out.println(hora);
        return hora;
    }

    public int getMinutos(){
        System.out.println(minutos);
        return minutos;
    }

    public int getSegundos(){
        System.out.println(segundos);
        return segundos;
    }

    public void displayHora(){
        System.out.println(hora+":"+minutos+":"+segundos);
    }

    public int compara(Hora objeto){
        if(objeto.hora==hora && objeto.minutos==minutos && objeto.segundos==segundos){
            System.out.println(0);
            return 0;
        }
        else if(objeto.hora>hora && objeto.minutos>minutos && objeto.segundos>segundos){
            System.out.println(((objeto.hora*3600)+(objeto.minutos*60)+objeto.segundos)-((hora*3600)+(minutos*60)+segundos));
            return ((objeto.hora*3600)+(objeto.minutos*60)+objeto.segundos)-((hora*3600)+(minutos*60)+segundos);
        }
        else{
            System.out.println(((hora*3600)+(minutos*60)+segundos)-((objeto.hora*3600)+(objeto.minutos*60)+objeto.segundos));
            return (((hora*3600)+(minutos*60)+segundos)+(objeto.hora*3600)-((objeto.minutos*60)+objeto.segundos));
        }
}}
