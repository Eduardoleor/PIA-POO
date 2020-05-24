/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.WindowConstants;
import views.CompleteInfo;
import views.Profile;

/**
 *
 * @author eduardoleal
 */
public class ConnectionService {

    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://sql9.freemysqlhosting.net/sql9342917";
    private static final String user = "sql9342917";
    private static final String password = "v3NB522jCj";

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    private static JFrame panel_update, panel_profile;

    public static void guardarAlumno(String matricula, String nombre, String ap_pa, String ap_ma, String cal, String grupo, String salon, String clase, String hora, String facultad) {
        String query = " insert into pia (id, matricula, nombre, apellido_paterno, apellido_materno, calificacion, grupo, salon, clase, hora, facultad )"
                + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        int matr = Integer.parseInt(matricula);
        int cali = Integer.parseInt(cal);

        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, null);
            preparedStmt.setInt(2, matr);
            preparedStmt.setString(3, nombre);
            preparedStmt.setString(4, ap_pa);
            preparedStmt.setString(5, ap_ma);
            preparedStmt.setInt(6, cali);
            preparedStmt.setString(7, grupo);
            preparedStmt.setString(8, salon);
            preparedStmt.setString(9, clase);
            preparedStmt.setString(10, hora);
            preparedStmt.setString(11, facultad);

            // execute the preparedstatement
            preparedStmt.execute();
            showMessageDialog(null, "Nuevo alumno guardado!");

        } catch (SQLException sqlEx) {
            showMessageDialog(null, "Existe un problema al guardar el alumno.");
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try {
                con.close();
            } catch (SQLException se) {
                /*can't do anything */ }
        }

    }

    public static void actualizarAlumno(String facultad, String matricula) {
        String query = " update pia set facultad = ? where matricula = ?";
        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, facultad);
            preparedStmt.setString(2, matricula);

            // execute the preparedstatement
            preparedStmt.execute();
            showMessageDialog(null, "Datos actualizados!");
            panel_update.dispose();

            obtenerTodo(matricula);
        } catch (SQLException sqlEx) {
            showMessageDialog(null, "Existe un problema al actualizar los datos.");
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try {
                con.close();
            } catch (SQLException se) {
                /*can't do anything */ }
        }

    }

    public static void buscarAlumno(String matricula) {
        String query = "select * from pia where matricula=" + matricula;

        try {
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);

            if (rs.next() == false) {
                int input = JOptionPane.showConfirmDialog(null,
                        "El alumno no ha sido registrado", "Mensaje", JOptionPane.DEFAULT_OPTION);
            } else {
                do {
                    String id = rs.getString("id");
                    String matr = rs.getString("matricula");
                    String nombre = rs.getString("nombre");
                    String apellido_pa = rs.getString("apellido_paterno");
                    String apellido_ma = rs.getString("apellido_materno");
                    String cali = rs.getString("calificacion");
                    String salon = rs.getString("salon");
                    String facultad = rs.getString("facultad");

                    if (facultad.equals("")) {
                        CompleteInfo completeinfo_panel = new CompleteInfo(matr);
                        panel_update = new JFrame();
                        panel_update.add(completeinfo_panel);
                        panel_update.pack();
                        panel_update.setVisible(true);
                        panel_update.setLocationRelativeTo(null);
                        panel_update.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        panel_update.setTitle("Completa tu pérfil");
                    } else {
                        Profile profile_panel = new Profile(id, matr, nombre, apellido_pa, apellido_ma, cali, salon, facultad);
                        panel_profile = new JFrame();
                        panel_profile.add(profile_panel);
                        panel_profile.pack();
                        panel_profile.setVisible(true);
                        panel_profile.setLocationRelativeTo(null);
                        panel_profile.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        panel_profile.setTitle("Perfil: " + matr);
                    }

                } while (rs.next());
            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try {
                con.close();
            } catch (SQLException se) {
                /*can't do anything */ }
            try {
                stmt.close();
            } catch (SQLException se) {
                /*can't do anything */ }
            try {
                rs.close();
            } catch (SQLException se) {
                /*can't do anything */ }
        }
    }

    public static void obtenerTodo(String matricula) {
        String query = "select * from pia where matricula=" + matricula;

        try {
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);

            while (rs.next()) {
                String id = rs.getString("id");
                String matr = rs.getString("matricula");
                String nombre = rs.getString("nombre");
                String apellido_pa = rs.getString("apellido_paterno");
                String apellido_ma = rs.getString("apellido_materno");
                String calificacion = rs.getString("calificacion");
                String salon = rs.getString("calificacion");
                String facultad = rs.getString("facultad");

                Profile perfil = new Profile(id, matr, nombre, apellido_pa, apellido_ma, calificacion, salon, facultad);
                panel_profile = new JFrame();
                panel_profile.add(perfil);
                panel_profile.pack();
                panel_profile.setVisible(true);
                panel_profile.setLocationRelativeTo(null);
                panel_profile.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                panel_profile.setTitle(nombre + " " + matr);

            }
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try {
                con.close();
            } catch (SQLException se) {
                /*can't do anything */ }
            try {
                stmt.close();
            } catch (SQLException se) {
                /*can't do anything */ }
            try {
                rs.close();
            } catch (SQLException se) {
                /*can't do anything */ }
        }
    }

    public static void actualizarPerfilAlumno(String matricula, String name, String ap_pa, String ap_ma, String cal, String salon, String facultad, String id) {
        String query = " update pia set matricula = ?, nombre = ?, apellido_paterno = ?, apellido_materno = ?, calificacion = ?, salon = ?, facultad = ? where id = ?";

        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, matricula);
            preparedStmt.setString(2, name);
            preparedStmt.setString(3, ap_pa);
            preparedStmt.setString(4, ap_ma);
            preparedStmt.setString(5, cal);
            preparedStmt.setString(6, salon);
            preparedStmt.setString(7, facultad);
            preparedStmt.setString(8, id);

            // execute the preparedstatement
            preparedStmt.execute();
            showMessageDialog(null, "Datos del perfil actualizados!");

            //getAll(matricula);
        } catch (SQLException sqlEx) {
            showMessageDialog(null, "Existe un problema al actualizar los datos.");
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try {
                con.close();
            } catch (SQLException se) {
                /*can't do anything */ }
        }
    }

    public static void eliminarAlumno(String Id) {
        String query = "delete from pia where id =" + Id;

        try {
            con = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStmt = con.prepareStatement(query);
            //preparedStmt.setInt(1, 3);

            // execute the preparedstatement
            preparedStmt.execute();
            showMessageDialog(null, "Perfil eliminado con éxito!");
            panel_profile.dispose();

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try {
                con.close();
            } catch (SQLException se) {
                /*can't do anything */ }
            try {
                stmt.close();
            } catch (SQLException se) {
                /*can't do anything */ }
            try {
                rs.close();
            } catch (SQLException se) {
                /*can't do anything */ }
        }
    }

}
