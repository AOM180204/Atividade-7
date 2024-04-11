public class NumeroInteiro {
    int numero;

    NumeroInteiro() {
        numero = 0;
    }

    NumeroInteiro(int numero) {
        this.numero = numero;
    }

    void soma(int somado) {
        numero = numero + somado;
        System.out.println(numero);
    }

    void subtrai(int sub) {
        numero = numero - sub;
        System.out.println(numero);
    }

    boolean isPrimo(int numero) {
        if (numero == 0) {
            System.out.println("Número é zero");
            return false;
        } else {
            for (int i = 1; i < numero; i++) {
                if (i!=1 && numero % i == 0) {
                    System.out.println("Número não é primo");
                    return false;
                }
            }

            return true;
        }
    }

    int getNextPrimo(int numero) {
        int i;
        if (numero == 0) {
            System.out.println("Próximo primo é um");
            return 1;
        }
        else{
            for (i=numero+1;i>0;i++){
                if(isPrimo(i)==true){
                    System.out.println("Próximo primo é "+i);
                    break; 
                }
                
            }
         return i;}
    }


}