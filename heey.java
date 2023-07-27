import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;
public class heey implements ActionListener {
    int a,r,i=0,j=0;
    JButton R,P,S,P1,SC,Set;
    JLabel l2,l3,l4;
    JTextField U,C,RE,US,CS;
    heey(){

        JFrame f=new JFrame("Rock-Paper-Scissors");
        Color be=new Color(255,234,213);

        //creating text fields
        U =new JTextField();
        C =new JTextField();
        RE =new JTextField();

        //creating buttons
        ImageIcon R1=new ImageIcon("rock.png");
        ImageIcon P2=new ImageIcon("paper.png");
        ImageIcon S1=new ImageIcon("scissor.png");
        R=new JButton();
        R.setIcon(R1);
        P=new JButton();
        P.setIcon(P2);
        S=new JButton();
        S.setIcon(S1);
        P1=new JButton("Play");
//        SC=new JButton("Score");
//        Set=new JButton("Score");
        US=new JTextField();
        CS=new JTextField();

        //labels:
        l2=new JLabel();
        l2.setText("User: ");
        l3=new JLabel();
        l3.setText("Computer: ");
        l4=new JLabel();
        l4.setText("Result: ");

        //setting background image
        ImageIcon img=new ImageIcon("back.jpg");
        JLabel l1=new JLabel("",img,JLabel.CENTER);
        l1.setBounds(0,0,520,450);

        //setting bounds
        U.setBounds(50,50,100,30);
        C.setBounds(200,50,100,30);
        RE.setBounds(350,50,100,30);
        R.setBounds(50,120,100,100);
        P.setBounds(200,120,100,100);
        S.setBounds(350,120,100,100);
        P1.setBounds(200,270,100,40);
//        Set.setBounds(200,270,100,40);
//        Set.setBounds(350,270,100,40);
        l2.setBounds(50,20,50,20);
        l3.setBounds(200,20,50,20);
        l4.setBounds(350,20,50,20);
        US.setBounds(200,270,100,40);
        CS.setBounds(350,270,100,40);

        //setting background color
        P.setBackground(be);
        R.setBackground(be);
        S.setBackground(be);
        P1.setBackground(be);
//        SC.setBackground(be);
        U.setBackground(be);
        C.setBackground(be);
        RE.setBackground(be);
//        Set.setBackground(be);
        US.setBackground(be);
        CS.setBackground(be);

        //adding elements to the frame
        f.add(R);
        f.add(P);
        f.add(S);
        f.add(P1);
        f.add(l1);
//        f.add(SC);
        f.add(U);
        f.add(C);
        f.add(RE);
//        f.add(Set);
        f.add(l2);
        f.add(l3);
        f.add(l4);
//        f.add(US);
//        f.add(CS);

        //action listener
        R.addActionListener(this);
        P.addActionListener(this);
        S.addActionListener(this);
        P1.addActionListener(this);

        ImageIcon ic=new ImageIcon("icon.png");
        f.setIconImage(ic.getImage());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(520,420);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e ){
        if(e.getSource()==R){
            U.setText("Rock");
            a=1;
        }
        if(e.getSource()==P){
            U.setText("Paper");
            a=2;
        }
        if(e.getSource()==S){
            U.setText("Scissor");
            a=3;
        }
        if(e.getSource()==P1){
            r = ThreadLocalRandom.current().nextInt(1, 3);
            if(r==1){
                C.setText("Rock");
            }
            if(r==2){
                C.setText("Paper");
            }
            if(r==3){
                C.setText("Scissor");
            }
            if (r==a){
                RE.setText("Draw");
            }
            if(a==1&r==2 || a==2&r==3 || a==3&r==1){
                RE.setText("Computer");
            }
            if(r==1&a==2 || r==2&a==3 || r==3&a==1){
                RE.setText("User");
            }
//            if(RE.getText()=="User"){
//                i=i+1;
//                US.setText("User: "+i);
//            }
//            if(RE.getText()=="Computer"){
//                j=j+1;
//                CS.setText("Computer: "+j);
//            }
        }


    }

    public static void main(String args[]) {
        heey obj =new heey();
    }
}
