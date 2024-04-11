import javax.swing.JOptionPane;

public class Aluno {
    private int matricula;
    private String nome;
    private float prova1;
    private float prova2;
    private float trabalho;
    private float media;

    public void setInfo(){
        System.out.println("Insira o nome");
        nome=JOptionPane.showInputDialog(nome);
        System.out.println(nome);
        System.out.println("Insira a matricula");
        matricula=Integer.parseInt(JOptionPane.showInputDialog(matricula));
        System.out.println("Insira a nota da primeria prova");
        prova1=Float.parseFloat(JOptionPane.showInputDialog(prova1));
        System.out.println("Insira a nota da segunda prova");
        prova2=Float.parseFloat(JOptionPane.showInputDialog(prova2));
        System.out.println("Insira a nota do trabalho");
        trabalho=Float.parseFloat(JOptionPane.showInputDialog(trabalho));
        media=media();
        System.out.println(media);
    }

    public float media(){
        media=(prova1+prova2+trabalho);
        return media;}

    public void isAprovado(){
        if(media<4.2){
            System.out.println("Aluno reprovado");
        }
        else{
            System.out.println("Aluno aprovado");
        }
    }
}
