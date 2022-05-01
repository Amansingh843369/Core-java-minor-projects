package StudentProject;
import java.awt.*;
import java.awt.event.*;



class Student extends Frame implements ActionListener
{
    TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8;
  public  Student(){
            setLayout(null);
            tf1 = new TextField();
            tf2 = new TextField();
            tf3 = new TextField();
            tf4 = new TextField();
            tf5 = new TextField();
            tf6 = new TextField();
            tf7 = new TextField();

            Label l1 =new Label("Student Name :   ");
            Label l2 =new Label("Marks in Linux :");
            Label l3 =new Label("Marks  in  JavaScript :");
            Label l4 =new Label("Marks  in  Java :");
            Label l5 =new Label("Marks in Php :");
            Label l6 =new Label("Marks  in Python :");
            Label l7 =new Label("Msrks  in Node.js :");

            Button b =new  Button("Generate Marksheet");
            add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);add(l7);
            add(tf1);add(tf2);add(tf3);add(tf4);add(tf5);add(tf6);add(tf7);
            add(b);
 

            tf1.setBounds(150,50,200,30);
            tf2.setBounds(150,100,200,30);
            tf3.setBounds(150,150,200,30);
            tf4.setBounds(150,200,200,30);
            tf5.setBounds(150,250,200,30);
            tf6.setBounds(150,300,200,30);
            tf7.setBounds(150,350,200,30);

              
            l1.setBounds(10,50,140,30);
            l2.setBounds(10,100,140,30);
            l3.setBounds(10,150,140,30);
            l4.setBounds(10,200,140,30);
            l5.setBounds(10,250,140,30);
            l6.setBounds(10,300,140,30);
            l7.setBounds(10,350,140,30);
            b.setBounds(150,400,150,30);


            b.addActionListener(this);

        }
             public  void actionPerformed(ActionEvent ae)
          {     
            
                   String s1 = tf1.getText();
                   String s2 = tf2.getText();
                   String s3 = tf3.getText();
                   String s4 = tf4.getText();
                   String s5 = tf5.getText();
                   String s6 = tf6.getText();
                   String s7 = tf7.getText();

                     
                    GeneratedMarksheet fr = new GeneratedMarksheet(s1,s2,s3,s4,s5,s6,s7);
                     fr.setSize(400,850);
                    fr.setTitle("Student  Marks calculator");
                    fr.setVisible(true);
               
           
          

     

          }

                public static void main(String[] args) {
                    Student ab =new Student();
                    ab.setSize(500,500);
                    ab.setTitle("Student  Marks calculator");
                    ab.setVisible(true);
                    // ab.dispose();
                }






}