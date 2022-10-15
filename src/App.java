import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String Continue = "continue";
        String operation;
        Calaculator calc = new Calaculator();
        while (Continue.equals("continue"))
        {
        System.out.println("Welcome to calaculator");
        System.out.print("Please enter intiger: ");
        Calaculator.num1 = scan.nextDouble();
        System.out.println("Choose an operation: " + "\n" + "Type + for Add + "+ "\n" + "Type + for subtract - "+ 
        "\n" + "Type + for multiply * "+ "\n" + "Type + for divide /" +"\n");
        operation = scan.next();
             if (operation.equals("+")) {
                System.out.println("Please enter second intiger: ");
                Calaculator.num2 = scan.nextDouble();
                System.out.println( calc.num1 + " + " +calc.num2 +" = " +calc.add());
            } 
            else if (operation.equals("-")) {
                System.out.print("Please enter second intiger: ");
                Calaculator.num2 = scan.nextDouble();
                System.out.println(calc.num1 + " - " +calc.num2 + " = " +calc.subtract());
            }
            else if (operation.equals("*")) {
                System.out.println("Please enter second intiger: ");
                Calaculator.num2 = scan.nextDouble();
                System.out.println(calc.num1 + " * " +calc.num2 + " = " + calc.multiply());
            }
            else if (operation.equals("/")) {
                System.out.print("Please enter second intiger: ");
                Calaculator.num2 = scan.nextDouble();
                if (Calaculator.num2 != 0) {
                    System.out.println(calc.num1 + " / " +calc.num2 + " = " +calc.divide());
                } else {
                    System.out.println("Cannot divide 0 ");
                }
            }
            System.out.print("What to continue? or quit?: ");
            Continue = scan.next();
         }
           System.out.println("You exit the calculator ");
            scan.close();
    }
}

 class Calaculator {

    static double num1;
    static double num2;

    public void setNum1(double num1) {
        Calaculator.num1 = num1;
    }

    public void setNum2(double num2) {
        Calaculator.num2 = num2;
    }

    // Calculator formulas // 
    public double add(){
        return Calaculator.num1 + Calaculator.num2;
    }

    public double subtract(){
        return Calaculator.num1 - Calaculator.num2;
    }

    public double multiply(){
        return Calaculator.num1 * Calaculator.num2;
    }

    public double divide(){
        return (Calaculator.num1 / Calaculator.num2) ;
    }
}