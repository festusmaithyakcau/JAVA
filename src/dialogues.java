import javax.swing.JOptionPane;
public class dialogues{
    public static void main (String [] args){
        String firstNumber= JOptionPane.showInputDialog("Enter the first number");
        //Convert string to integer
        int number1 =Integer.parseInt(firstNumber);
        String secondNumber= JOptionPane.showInputDialog("Enter the second number");
        //Convert string to integer
        int number2 = Integer.parseInt(secondNumber);
        int sum = number1+number2;
        double average= (double)sum/2;
        JOptionPane.showMessageDialog(null,"Sum is :" + sum + "\n Average : "
                +average);

    }

}