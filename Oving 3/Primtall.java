import static javax.swing.JOptionPane.*;

public class Primtall {
    public static void main(String[] args) {

        String numberRead = showInputDialog("Hvilket tall vil du teste? \nAvslutt med esc.");
        
        while(numberRead != null) {
            int number = Integer.parseInt(numberRead);
            

            if(number <= 1) {
                showMessageDialog(null, number + " er ikke et primtall");  
            } 
            if(number == 2) {
                showMessageDialog(null, number + " er et primtall");
            }
            for(int i = 2; i < number; i ++) {
                if(number % i == 0){
                    showMessageDialog(null, number + " er ikke et primtall fordi " + i + " er en faktor i " + number);
                    break;
                    
                } else if(i == number -1) {
                    showMessageDialog(null, number + " er et primtall");
                    
                } 
            } 
            numberRead = showInputDialog("Hvilket tall vil du teste? \nAvslutt med esc.");
        }


    }
}