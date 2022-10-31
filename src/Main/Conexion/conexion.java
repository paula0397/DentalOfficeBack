package Main.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").getDeclaredConstructor().newInstance();
        return DriverManager.getConnection("jdbc:h2:~/h2-integradorDb");
    }

    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS ANIMALES; CREATE TABLE ANIMALES"
            +"("
            +" ID INT PRIMARY KEY,"
            +" NOMBRE varchar(100) NOT NULL,"
            +" TIPO varchar(100) NOT NULL"
            +" )";
    private static final String SQL_INSERT = "INSERT INTO ANIMALES(ID, NOMBRE, TIPO) VALUES (1,'Pancho','Perro')";
    private static final String SQL_INSERT2 = "INSERT INTO ANIMALES(ID, NOMBRE, TIPO) VALUES (2,'Pillo','Gato')";

}
