
package juego;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Conexion 
{
    
    private static Connection con;
    private static Statement stm;
    private static ResultSet rss;
    
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "Daniel100";
    private static final String url = "jdbc:mysql://localhost:3306/juego";
      
    public void conector() {

        con = null;
        String estado = "";
        
        try
        {
            Class.forName(driver);

            con = (Connection) DriverManager.getConnection(url, user, pass);

            if (con!=null){
                estado = "Conexion establecida";
            }
        }
        // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (ClassNotFoundException | SQLException e){
            estado = "Error de conexion: " + e;
        }
        
        JOptionPane.showMessageDialog(null, estado);
    }
    
    public void Ingresar(String username, Integer puntaje){
        
        String estado = "";
        
        try
        {
            String query;
            Conexion.con = (Connection) DriverManager.getConnection(Conexion.url, Conexion.user, Conexion.pass);
            //Conexion.stm = con.createStatement();
            query = "insert into jugadores (Nombre, Puntuacion) values (?, ?)";
            
            PreparedStatement stm = con.prepareStatement(query);
            
            stm.setString(1, username);
            stm.setInt(2, puntaje);
            
            stm.executeUpdate();

        } 
        catch (SQLException e){
            estado = "Error de Conexion: " + e.toString();
            JOptionPane.showMessageDialog(null, estado);
        }
    }
    
    public void ConsultarTop10(JTable tabla_puntajes)
    {
        String estado = "";
        
        try
        {
            Conexion.con = (com.mysql.jdbc.Connection) DriverManager.getConnection(Conexion.url, Conexion.user, Conexion.pass);
            Conexion.stm = con.createStatement();
            Conexion.rss = stm.executeQuery("Select Nombre, Puntuacion FROM jugadores ORDER BY puntuacion desc Limit 10");
            DefaultTableModel modelo = (DefaultTableModel) tabla_puntajes.getModel();
            
            int cont = 1;
            
            while (rss.next())
            {
                // Se crea un array que será una de las filas de la tabla.
                Object [] fila = new Object[3]; // Hay dos columnas en la tabla
                // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.

                fila[0] = cont;
                fila[1] = rss.getObject(1);
                fila[2] = rss.getObject(2);
                
                // El primer indice en rs es el 1, no el cero, por eso se suma 1.

                // Se añade al modelo la fila completa.
                modelo.addRow(fila);
                
                cont++;
            }
            
            tabla_puntajes.setModel(modelo);

            DefaultTableCellRenderer centrado = new DefaultTableCellRenderer();
            centrado.setHorizontalAlignment(JLabel.CENTER);
            
            for (int i = 0; i<3; i++)
            {
                tabla_puntajes.getColumnModel().getColumn(i).setCellRenderer(centrado);
            }

        }
        catch (SQLException e){
            estado = "Error de Conexion: " + e.toString();
            JOptionPane.showMessageDialog(null, estado);
        }
    }
    
    public Integer ConsultarID()
    {
        String estado = "";
        Integer Id = null;
        
        try
        {
            Conexion.con = (com.mysql.jdbc.Connection) DriverManager.getConnection(Conexion.url, Conexion.user, Conexion.pass);
            Conexion.stm = con.createStatement();
            Conexion.rss = stm.executeQuery("select * from jugadores");
            
            while (rss.next())
            {
                Id = rss.getInt("Id_jugador");
            }
            
        }
        catch (SQLException e){
            estado = "Error de Conexion: " + e.toString();
            JOptionPane.showMessageDialog(null, estado);
        }

        return Id;
    }
     
    public Integer ConsultarPosicion(Integer id)
    {
        
        String estado = "";
        Integer cont = 1;
        Integer cont2 = null;
        try
        {
            Conexion.con = (com.mysql.jdbc.Connection) DriverManager.getConnection(Conexion.url, Conexion.user, Conexion.pass);
            Conexion.stm = con.createStatement();
            Conexion.rss = stm.executeQuery("Select Id_jugador FROM jugadores ORDER BY puntuacion desc");
            
            
            while (rss.next())
            {
                if (rss.getObject(1).equals(id))
                {
                    cont2 = cont;
                }

                cont++;
            }

        }
        catch (SQLException e){
            estado = "Error de Conexion: " + e.toString();
            JOptionPane.showMessageDialog(null, estado);
        }
        
        return cont2;
    }
}
