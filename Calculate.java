import java.util.Scanner;
public class Calculate {

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("digite  1 para somar\n2 para subtrair\n3para multiplicar\n4 para dividir\n");
    int escolha=scanner.nextInt();
    

    switch(escolha){
        case 1:
            System.out.println("digite o primeiro numero");
            float x=scanner.nextFloat();
            System.out.println("digite o segundo numero");
            float y=scanner.nextFloat();
            sum(x,y);
            break;

        case 2:
            System.out.println("digite o primeiro numero");
            float a=scanner.nextFloat();
            System.out.println("digite o segundo numero");
            float b=scanner.nextFloat();
            minus(a,b);
            break;

        case 3:
            System.out.println("digite o primeiro numero");
            float z=scanner.nextFloat();
            System.out.println("digite o segundo numero");
            float w=scanner.nextFloat();
            mult(z,w);
            break;

        case 4:
            System.out.println("digite o primeiro numero");
            float c=scanner.nextFloat();
            System.out.println("digite o segundo numero");
            float d=scanner.nextFloat();
            div(c,d);
            break;

        default:
            System.out.println("opção invalida!");
    }
    scanner.close();


    }
    static void sum(float x, float y){
        System.out.print("o resultado é:");
        System.out.println(x+y);
    }
    static void minus(float x, float y){
        System.out.print("o resultado é:");
        System.out.println(x-y);
    }
    static void mult(float x, float y){
        System.out.print("o resultado é:");
        System.out.println(x*y);
    }
    static void div(float x, float y){
        System.out.print("o resultado é:");
        System.out.println(x/y);
    }
}
