package VentanaInterfaz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ManuelRamón
 */
public class BBDD {

    public String seleccion() {
        StringBuilder consulta = new StringBuilder();
        try {
            Class.forName("org.sqlite.JDBC");//cargando la biblioteca
            Connection conn = DriverManager.getConnection("jdbc:sqlite:datos.sqlite");
            Statement stat = conn.createStatement();//Un objeto Statement se usa para enviar sentencias SQL a la base de datos
            //ResultSet no es más que una clase java similar a una lista en la que está el resultado de la consulta
            ResultSet rs = stat.executeQuery("select * from datos");//executeQuery para su uso con SELECT
            while (rs.next()) //executeUpdate para INSERT, UPDATE, DELETE
            {//recorremos todas las filas
                //System.out.println("------------------------------------------------------");
                //System.out.println("Nombre: " + rs.getString("nombre"));
                consulta.append("Nombre: ").append(rs.getString("nombre")).append("\n");
                //System.out.println("Apellidos: " + rs.getString("apellidos"));
                consulta.append("Apellidos: ").append(rs.getString("apellidos")).append("\n");
               //System.out.println("Direccion: " + rs.getString("direccion"));
                consulta.append("Direccion: ").append(rs.getString("direccion")).append("\n");
                //System.out.println("Dni: " + rs.getString("dni"));
                consulta.append("Dni: ").append(rs.getString("dni")).append("\n");
                //System.out.println("Telefono: " + rs.getString("telefono"));
                consulta.append("Telefono: ").append(rs.getString("telefono")).append("\n");
                //System.out.println("--------------------------");
                consulta.append("--------------------------\n");
            }
            stat.close();
            conn.close();//Cerramos la conexion
            return consulta.toString();
        } catch (SQLException ex) {
            System.out.println("Error de seleccion");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BBDD.class.getName()).log(Level.SEVERE, null, ex);

        }
        return "Error de seleccion";
    }

    public String seleccion2(String nom, String ape) {
        StringBuilder consulta = new StringBuilder();
        try {
            Class.forName("org.sqlite.JDBC");//cargando la biblioteca
            Connection conn = DriverManager.getConnection("jdbc:sqlite:datos.sqlite");
            //Un objeto Statement se usa para enviar sentencias SQL a la base de datos
            Statement stat = conn.createStatement();
            //ResultSet no es más que una clase java similar a una lista en la que está el resultado de la consulta
            ResultSet rs = stat.executeQuery("select * from datos where nombre ='" + nom + "' and apellidos = '" + ape + "'");//executeQuery para su uso con SELECT
            while (rs.next()) //executeUpdate para INSERT, UPDATE, DELETE
            {//recorremos todas las filas
                // System.out.println("Nombre: " + rs.getString("nombre"));
                consulta.append("Nombre: ").append(rs.getString("nombre")).append("\n");
                //System.out.println("Apellidos: " + rs.getString("apellidos"));
                consulta.append("Apellidos: ").append(rs.getString("apellidos")).append("\n");
                //System.out.println("--------------------------");
                consulta.append("Direccion: ").append(rs.getString("direccion")).append("\n");
                //System.out.println("Dni: " + rs.getString("dni"));
                consulta.append("Dni: ").append(rs.getString("dni")).append("\n");
                //System.out.println("Telefono: " + rs.getString("telefono"));
                consulta.append("Telefono: ").append(rs.getString("telefono")).append("\n");
                consulta.append("--------------------------\n");
            }
            stat.close();
            conn.close();//Cerramos la conexion
            return consulta.toString();
        } catch (SQLException ex) {
            System.out.println("error");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "error";
    }

    public String seleccion3(String ape) {
        StringBuilder consulta = new StringBuilder();
        try {
            Class.forName("org.sqlite.JDBC");//cargando la biblioteca
            Connection conn = DriverManager.getConnection("jdbc:sqlite:datos.sqlite");
            //Un objeto Statement se usa para enviar sentencias SQL a la base de datos
            Statement stat = conn.createStatement();
            //ResultSet no es más que una clase java similar a una lista en la que está el resultado de la consulta
            ResultSet rs = stat.executeQuery("select * from datos where apellidos = '" + ape + "'datos");//executeQuery para su uso con SELECT
            while (rs.next()) //executeUpdate para INSERT, UPDATE, DELETE
            {//recorremos todas las filas
                //System.out.println("Nombre: " + rs.getString("nombre"));
                // consulta.append("nombre: ").append(rs.getString("nombre")).append("\n");
                System.out.println("Apellidos: " + rs.getString("apellidos"));
                consulta.append("Apellidos: ").append(rs.getString("apellidos")).append("\n");
                //System.out.println("--------------------------");
                consulta.append("--------------------------\n");
            }
            stat.close();
            conn.close();//Cerramos la conexion
            return consulta.toString();
        } catch (SQLException ex) {
            System.out.println("Error de seleccion");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BBDD.class.getName()).log(Level.SEVERE, null, ex);

        }
        return "Error de seleccion";
    }

    public String insercion(String nom, String ape, String direccion, String dni, String telefono) {
        try {
            Class.forName("org.sqlite.JDBC");//cargando la biblioteca
            Connection conn = DriverManager.getConnection("jdbc:sqlite:datos.sqlite");
            Statement stat = conn.createStatement();// enviar comandos SQL a la base de datos, se usa la clase Statement de java
            stat.executeUpdate("INSERT INTO datos(nombre,apellidos,direccion,dni,telefono) VALUES('" + nom + "','" + ape + "','" + direccion + "','" + dni + "','" + telefono + "')");//Si el id es auto_increment no hay que poner el id
            stat.close();
            conn.close();
            return "Insercion correcta";
        } catch (SQLException ex) {
            System.out.println("Error de insercion");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error de insercion2");
        }
        return "Error de insercion";
    }

    public String eliminar(String dni) {
        try {
            Class.forName("org.sqlite.JDBC");//cargando la biblioteca
            Connection conn = DriverManager.getConnection("jdbc:sqlite:datos.sqlite");
            Statement stat = conn.createStatement();
            stat.executeUpdate("DELETE FROM datos WHERE dni='" + dni + "'");
            stat.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Error de eliminacion");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "error eliminacion";
    }

    public String actualizar(String dni, String tlf) {
        try {
            Class.forName("org.sqlite.JDBC");//cargando la biblioteca
            Connection conn = DriverManager.getConnection("jdbc:sqlite:datos.sqlite");
            Statement stat = conn.createStatement();
            stat.executeUpdate("UPDATE datos SET telefono='" + tlf + "' WHERE dni='" + dni + "'");
            stat.close();
            conn.close();
            return "Modificacion correcta";
        } catch (SQLException ex) {
            System.out.println("Error de actualizacion");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error de actualizacion2");
        }
        return "Error de Modificacion";
    }

} //Fin public class BBDD

