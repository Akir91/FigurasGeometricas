import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Programa que calcula perimetro y area de diferentes figuras geometricas");
        
        byte opcion;
        double lado1, lado2;
        
        do
        {    
            System.out.println("\nMENU");
            System.out.println("1.Cuadrado");
            System.out.println("2.Rectangulo");
            System.out.println("3.Triangulo rectangulo");
            System.out.println("4.Circulo");
            System.out.println("5.Salir");
            System.out.print("Ingresa una opcion: ");
            opcion = scanner.nextByte();
            
            switch(opcion)
            {
                case 1:
                    

                    break;
                
                case 2:
                    break;
                    
                case 3:
                    System.out.print("Ingresa el valor de la base: ");
                    lado1 = scanner.nextDouble();

                    System.out.print("Ingresa el valor de la altura: ");
                    lado2 = scanner.nextDouble();

                    if(lado1 > 0 && lado2 > 0)
                    {
                        Triangulo triangulo1 = new TrianguloRectangulo(lado1, lado2);
                        System.out.println(triangulo1.toString());
                    }

                    else
                        System.out.println("Ingresa valores mayores a cero");

                    break;
                    
                case 4:
                    break;
                        
                case 5:
                    System.out.println("Hasta luego");
                    break;
                    
                default:
                    System.out.println("Ingresa una opcion valida.");
            }
            
            if(opcion != 5)
            {
                System.out.println("Presiona enter para continuar...");
                scanner.nextLine(); // Limpiar el buffer del scanner
                scanner.nextLine(); // Esperar la pulsación de Enter
            }
            
        }while(opcion != 5);
        
        scanner.close();
    }
}