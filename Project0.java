import javax.swing.JOptionPane;//import library

public class Project0 {// name of class

    public static void main(String[] args) {// main function
        while (true) { // infinite loop to repeat the process
            String sentence;// parameter datatype for string
            sentence = JOptionPane.showInputDialog("Enter a sentence: ");// input sentence
            if (sentence.equalsIgnoreCase("stop")) {// repeat process until user inputs stop
                break;
            }
            int numE = 0;//
            int nume = 0;
            for (int i = 0; i < sentence.length(); i++) {// count number of lower and Upper e's.
                if (sentence.charAt(i) == 'E')// number of upper E
                    numE++;
                else if (sentence.charAt(i) == 'e')// number of lower e
                    nume++;
            }
            JOptionPane.showMessageDialog(null,
                    "Number of lower case e's:" + nume + "\n" + "Number of upper case e's:" + numE);
        } // print statement
    }
}