import java.util.Random;
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.util.Scanner;
import java.awt.*;
public class Animator{
    String animtext;
    
    public Animator(){
        animtext = "Sample Text";
        initComponents();
    }

    public Animator(String name){
        animtext = name;
        initComponents();
        }

       public void initComponents(){
        JFrame j = new JFrame();
       Random r = new Random();
       JLabel l = new JLabel(animtext);
       
       String fonts[] = {"Calibri","Comic Sans","Consolas","Times new roman","Segoe UI light","Century Gothic"};
       
       j.setLayout(new FlowLayout());

       j.setExtendedState(JFrame.MAXIMIZED_BOTH);
       j.setSize(500,500);
       j.add(l);
       j.setVisible(true);
        for(int i =0; i < 100; i++){
            try{
        Thread.sleep(200);
            } 
            catch (InterruptedException ie){}
        l.setForeground(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
        l.setFont(new Font(fonts[i%4],r.nextInt(4),r.nextInt(200)));
       }
       
} 


    public static void main(String args[]){
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter some text: ");
        String inputText = s.nextLine();
        if(inputText.length() != 0){
        Animator a = new Animator(inputText);
        } else {
            Animator a = new Animator();
        }
        
        System.exit(0);
    }
}
