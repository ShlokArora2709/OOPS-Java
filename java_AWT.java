import java.awt.*;

/* 
// AWT by inheritance of Frame class

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
*/

//AWT by Association:
public class java_AWT{
    java_AWT(){
        Frame f=new Frame();
        Button b=new Button("Submit");
        Label l=new Label("Employees");
        TextField t=new TextField();
        Checkbox c= new Checkbox("Python",true);
        Choice ch=new Choice();
        List l1=new List(5);

        b.setBounds(20,100,80,30);
        l.setBounds(20,80,80,30);
        t.setBounds(100,100,80,30);
        c.setBounds(100,80,80,30);
        ch.setBounds(100, 50, 80, 30);
        l1.setBounds(100, 150, 80, 80);

        ch.add("Java");
        ch.add("Python");
        ch.add("C++");
        
        l1.add("Java");
        l1.add("Python");
        l1.add("C++");
        l1.add("C#");
        l1.add("Ruby");

        f.add(b);
        f.add(l);
        f.add(t);
        f.add(c);
        f.add(ch);
        f.add(l1);

        f.setSize(400,300);
        f.setTitle("AWT window");
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new java_AWT();
    }
    
}