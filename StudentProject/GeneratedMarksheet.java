package StudentProject;
import java.awt.*; //import the  necassay library




class  GeneratedMarksheet extends Frame{



  public GeneratedMarksheet(String s1,String s2,String s3, String  s4,String s5,String s6, String s7)

  {
      setLayout(null);

      int tot;
      double av;

      int a=Integer.parseInt(s2);
      int b=Integer.parseInt(s2);
      int c=Integer.parseInt(s2);
      int d=Integer.parseInt(s2);
      int e=Integer.parseInt(s2);
      int f=Integer.parseInt(s2);
      int g=Integer.parseInt(s2);
         
      tot=a+b+c+d+e+f+g;
      av=tot/6;

      Label lb1=new Label("Student Name  :  " + s1);
      Label lb2=new Label("Linux");
      Label lb3=new Label("JavaScript");
      Label lb4=new Label("Java");
      Label lb5=new Label("Php");
      Label lb6=new Label("Python");
      Label lb7=new Label("Node js");
      Label lb8=new Label("Total Marks");
      Label lb9=new Label("Average Marks");
      Label lb10=new Label("Result");



      Label lbl1=new Label(s2);
      Label lbl2=new Label(s3);
      Label lbl3=new Label(s4);
      Label lbl4=new Label(s5);
      Label lbl5=new Label(s6);
      Label lbl6=new Label(s7);
      Label lbl7=new Label(""+tot);
      Label lbl8=new Label(""+av);
      Label lbl9=new Label();

      lb1.setBounds(50,50,200,35);
      lb2.setBounds(50,130,200,35);
      lb3.setBounds(50,210,200,35);
      lb4.setBounds(50,290,200,35);
      lb5.setBounds(50,370,200,35);
      lb6.setBounds(50,450,200,35);
      lb7.setBounds(50,530,200,35);

      lb8.setBounds(50,610,200,35);
      lb9.setBounds(50,690,200,35);
      lb10.setBounds(50,770,200,35);

      lbl1.setBounds(250,130,90,35);
      lbl2.setBounds(250,210,90,35);
      lbl3.setBounds(250,290,90,35);
      lbl4.setBounds(250,370,90,35);
      lbl5.setBounds(250,450,90,35);
      lbl6.setBounds(250,530,90,35);


      lbl7.setBounds(250,610,90,35);
      lbl8.setBounds(250,690,90,35);
      lbl9.setBounds(250,770,90,35);



    add(lb1); add(lb2); add(lb3); add(lb4); add(lb5);
    add(lb6); add(lb7); add(lb8); add(lb9); add(lb10);
    add(lbl1); add(lbl2); add(lbl3); add(lbl4); add(lbl5);
    add(lbl6); add(lbl7); add(lbl8); add(lbl9);


if(a<40 || b<40 || c<40 || d<40 || e<40 || f<40){
     lbl9.setText("Failed with ATKT :(");
     System.out.println("Sorry, You are failed");
    System.exit(0);
     
}
else{
    lbl9.setText("Passed :)");

}









}




}
