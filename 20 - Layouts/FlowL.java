import java.awt.*;
import javax.swing.*;
public class FlowL extends JFrame {
    //componentes
    JLabel etiqueta = new JLabel("FlowLayout");
    JButton boton1 = new JButton("Uno");
    JButton boton2 = new JButton("Dos");
    JButton boton3 = new JButton("Tres");
    

    public FlowL() {
        super("FlowLayout");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setup();
    }

    public static void main(String args[]) {
        FlowL fl = new FlowL();
    }
    
    public void setup() {
        Container contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());
        contenedor.add(etiqueta);
        contenedor.add(boton1);
        contenedor.add(boton2);
        contenedor.add(boton3);
        this.setSize( 300,100 );
        this.setVisible( true );
    }
    
}