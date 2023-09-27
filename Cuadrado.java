
import java.util.Scanner;
public class Cuadrado{
    public static void main (String[]args){
        int a,lim,c;
        Scanner tecla=new Scanner(System.in);
        System.out.println("DAME EL LIMITE:/n");
        lim=tecla.nextInt();
        for(a=1;a<=lim;a++){
            c=a*a;
            System.out.println(a+"="+c+"/n");
        }
    }
}