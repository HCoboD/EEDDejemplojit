import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome");
        int vi = 2;
        double vd = 2.3;
        char vc = 'A';
        String cadena="hola";
        // Mostrando
        // Actua como operador de concatenacion.
        System.out.println("vi:" +vi + "vd" +vd + "vc" +vc + "cadena" +cadena);

        Scanner sc= new Scanner(System.in);
        // sout y se rellena solo el system...
        System.out.println("Introduzca un valor entero ...");
        vi= sc.nextInt();
        System.out.println("Valor entero leido:" +vi);

        if(vi%2 ==0){
            System.out.println("El numero:" +vi +" es un numero par");
        }else{
            System.out.println("El numero:" +vi +" es un numero impar");
        }


    }

}