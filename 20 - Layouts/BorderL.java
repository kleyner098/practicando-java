import java.awt.*;
import javax.swing.*;

public class BorderL extends JFrame {
    //componentes
    JButton botonN = new JButton( "Norte" );
    JButton botonS = new JButton( "Sur" );
    JButton botonE = new JButton( "Este" );
    JButton botonO = new JButton( "Oeste" );
    JButton botonC = new JButton( "Centro" );
    public static void main(String args[]) {
        BorderL bl = new BorderL();
    }

    public BorderL() {
        super("BorderLayout");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setup();
    }

    public void setup() {
        Container contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout());
        contenedor.add( "North",botonN );
        contenedor.add( "South",botonS );
        contenedor.add( "East",botonE );
        contenedor.add( "West",botonO );
        contenedor.add( "Center",botonC );
        this.setSize( 400,300 );
        this.setVisible( true );
    }
}
    