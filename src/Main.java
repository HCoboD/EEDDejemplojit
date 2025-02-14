import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome");
        int vi = 2;
        double vd = 2.3;
        char vc = 'A';
        String cad="hola";
        // Mostrando
        // Actua como operador de concatenacion.
        System.out.println("vi:" +vi + "vd" +vd + "vc" +vc + "cad" +cad);


        //Bool
        boolean vb=false;
        vi=(int) 2.9 +1;//Con el int se hace una conversion, del numero a la derecha y no redondea.
        //Formas de arreglar si los dos son decimales.
        vi=(int) 2.9 +(int)1.1;
        vi=(int)(2.9 + 1.2);
        //Hay que entender la diferencia entre esas dos posibles soluciones.
        //vi= (int) vb + vb; NO SE PODRIA HACER YA QUE NO SE PUEDE PASAR UN BOOLIANO A UN NUMERO.

        vi= vc +1;// Daria 66 ya que en la tabla Asci "A"=65;(Unicode)
        System.out.println("vi (entero): "+ vi + "vi (char): " +(char)vi);


        //Operadores.
        int a=1, b=2;
        System.out.println("a: " +a + " b: " +b);
        a++;//postincremento
        ++b;//preincremento
        System.out.println("a: " +a + " b: " +b);
        int c = a++ * ++b;// el preincremento incrementa y luego toma el valor y el postincremento lo contrario.
        System.out.println("a: " +a + " b: " +b + " c: " +c);

        //Precedencia de operadores () ++ -- */% +- <>===!= ||&&!.
        boolean bo = (2+8)< ++a || 2+5*9 == a++ + 43;// El || es un or.
        //10< ++a || 2+5*9 == a++ + 43;
        //10< 4 || 2+5*9 == 4 + 43; (a ahora valdria 5)
        //10< 4 || 2+45 == 4 + 43;
        //10< 4 || 47 == 47;
        //false || true;
        //True;
        System.out.println("bo: " +bo);
        bo = ++a < 10 || ++a ==6;
        System.out.println("bo: " +bo + " a: " +a);//El or con un solo palo haria que a = 7.


        cad="Hola";
        //Sobrecarga de operadores: El operador se comporta de forma diferente.
        //Según sus operadores.
        a= 1 + 1;//+ es una suma algebraica.
        cad= "1" +"1" + 2 + 3;//+ Es una concatenación incluir otro tipo se denomina wropping.
        System.out.println("cad: " +cad);
        String cad1= cad.substring(2,4);//coge desde el dos hasta el 4-1 es decir el 3 si en el cad de arriba ponemos un 4 no loo cogería hay q cambiar esto.
        System.out.println("cad1: " +cad1);

        bo=cad1.equals("23");
        System.out.println("bo: " +bo);


        //Arrays.
        int[]arrInt1 = new int[5];
        int[]arrInt2 = {0,1,2,3,4};
        System.out.println("arrInt1: " + Arrays.toString(arrInt1));
        System.out.println("arrInt2: " + Arrays.toString(arrInt2));
        //Matriz
        int[][]matriz1=new int [5][5];
        int[][]matriz2={{0,1,2,3,4},
                        {0,1,2,3,4}};
        System.out.println("matriz1: " + Arrays.toString(matriz1));//No fufa.
        System.out.println("matriz2: " + Arrays.toString(matriz2));//No fufa.













        System.exit(0);//Para no continuar con la lectura.












        Scanner sc= new Scanner(System.in);
        // sout y se rellena solo el system...
        System.out.println("Introduzca un valor entero ...");
        vi= sc.nextInt();
        System.out.println("Valor entero leido:" +vi);

        // Sentencia de bifurcacion.

        if(vi%2 ==0){
            System.out.println("El numero:" +vi +" es un numero par");
        }else{
            System.out.println("El numero:" +vi +" es un numero impar");
        }

        // Sentencia de bifurcaciones anidadas.

        if (vi<50){
            System.out.println("El numero:" +vi +" es menor que 50.");
        }else if(vi>50){
            System.out.println("El numero:" +vi +" es mayor que 50.");
        }else {
            System.out.println("El numero" +vi +" =50.");
        }


        // Sentencias switch-case.
        System.out.println("Introduzca un color(R/r, V/v, A/a)");
        cad= sc.next();
        vc= cad.charAt(0);//Es como un Array de caracteres en Clion.

        switch(vc){
            case 'V':
            case 'v':
                System.out.println("Color Verde.");
                break;
            case 'R':
            case 'r':
                System.out.println("Color Rojo.");
                break;
            case 'A':
            case 'a':
                System.out.println("Color Azul.");
                break;

            default:
                System.out.println("Color Erroneo.");


        }

        // Bucles for cuando se conoce a priori el numero de interacciones.
        int suma1=0, suma2=0;
        for(int i=1;i<=10;i++){
            suma1=suma1+i;
            suma2+=i;
        }
        System.out.println("Suma1:" +suma1 +"suma2" + suma2);


        // Bucle while cuando no es conocido a priori el numero de interacciones.
        // Bucle que solicite numeros al usuario hasta que introduzca un numero par.
        int num=sc.nextInt();
        while(num%2 !=0);







    }

}