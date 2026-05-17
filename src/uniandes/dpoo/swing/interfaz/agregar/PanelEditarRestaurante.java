package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    private JTextField txtNombre;

    private JComboBox<String> cbbCalificacion;

    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
        setLayout( new GridLayout( 3, 1 ) );
        JPanel panelNombre = new JPanel( new FlowLayout( FlowLayout.LEFT ) );
        panelNombre.add( new JLabel( "Nombre" ) );
        txtNombre = new JTextField( 15 );
        panelNombre.add( txtNombre );
        JPanel panelCalif = new JPanel( new FlowLayout( FlowLayout.LEFT ) );
        panelCalif.add( new JLabel( "Calificación" ) );
        cbbCalificacion = new JComboBox<>( new String[]{ "1", "2", "3", "4", "5" } );
        panelCalif.add( cbbCalificacion );

        JPanel panelVisitado = new JPanel( new FlowLayout( FlowLayout.LEFT ) );
        panelVisitado.add( new JLabel( "Visitado" ) );
        cbbVisitado = new JComboBox<>( new String[]{ "Sí", "No" } );
        panelVisitado.add( cbbVisitado );
        add( panelNombre );
        add( panelCalif );
        add( panelVisitado );
    }

    public boolean getVisitado( )
    {
        return "Sí".equals( cbbVisitado.getSelectedItem( ) );
    }

    public int getCalificacion( )
    {
        String calif = ( String )cbbCalificacion.getSelectedItem( );
        return Integer.parseInt( calif );
    }

    public String getNombre( )
    {
        return txtNombre.getText( );
    }
}
