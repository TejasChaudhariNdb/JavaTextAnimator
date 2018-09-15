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
       int curSize = 10;
       int tarSize;
       int fStyle;
       String fonts[] = {"Calibri","Comic Sans","Consolas","Times new roman","Segoe UI light","Century Gothic"};
       String fholder;
       j.setLayout(new FlowLayout());

       j.setExtendedState(JFrame.MAXIMIZED_BOTH);
       j.setSize(500,500);
       j.add(l);
       j.setVisible(true);
        for(int i =0; i < 100; i++){
            
           fholder = fonts[i%4];
           fStyle = i%4;
            tarSize = r.nextInt(100);

             l.setForeground(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
            for (int cn = curSize; cn < tarSize; cn++){
                    l.setFont(new Font(fholder,fStyle,cn));
                 try{
        Thread.sleep(10);
            } 
            catch (InterruptedException ie){}
            }
       
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
