import java.awt.*;
public class java_AWT extends Frame{
    java_AWT(){
        Button b=new Button("click me");
        b.setBounds(30,100,80,30);
        add(b);
        setSize(300,300);
        setTitle("AWT window");
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new java_AWT();
    }
    
}
