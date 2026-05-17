package uniandes.dpoo.swing.interfaz.principal;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import uniandes.dpoo.swing.mundo.Restaurante;

@SuppressWarnings("serial")
public class PanelDetallesRestaurante extends JPanel
{
    private JLabel labNombre;
    private JLabel labCalificacion;
    private JCheckBox chkVisitado;

    public PanelDetallesRestaurante( )
    {
        setLayout( new GridLayout( 3, 1 ) );
        JPanel panelNombre = new JPanel( new FlowLayout( FlowLayout.LEFT ) );
        panelNombre.add( new JLabel( "Nombre: " ) );
        labNombre = new JLabel( "" );
        panelNombre.add( labNombre );

        JPanel panelCalif = new JPanel( new FlowLayout( FlowLayout.LEFT ) );
        panelCalif.add( new JLabel( "Calificación: " ) );
        labCalificacion = new JLabel( "" );
        panelCalif.add( labCalificacion );

        JPanel panelVisitado = new JPanel( new FlowLayout( FlowLayout.LEFT ) );
        panelVisitado.add( new JLabel( "Visitado: " ) );
        chkVisitado = new JCheckBox( );
        chkVisitado.setEnabled( false );
        panelVisitado.add( chkVisitado );

        add( panelNombre );
        add( panelCalif );
        add( panelVisitado );
    }

    private void actualizarRestaurante( String nombre, int calificacion, boolean visitado )
    {
        labNombre.setText( nombre );
        labCalificacion.setIcon( buscarIconoCalificacion( calificacion ) );
        chkVisitado.setSelected( visitado );
    }
    public void actualizarRestaurante( Restaurante r )
    {
        this.actualizarRestaurante( r.getNombre( ), r.getCalificacion( ), r.isVisitado( ) );
    }

    private ImageIcon buscarIconoCalificacion( int calificacion )
    {
        String imagen = "./imagenes/stars" + calificacion + ".png";
        return new ImageIcon( imagen );
    }
}