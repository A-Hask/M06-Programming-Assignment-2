import java.sql.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SQLClient extends Application {
    Statement statement;

    Connection connection.setAutoCommit(false);
    PreparedStatement prepStament = connection.prepareStatement("CREATE TABLE ? (num1 DOUBLE, num2 DOUBLE, num3 DOUBLE)");
    String tableName = "temp";
    prepStatement.setString(1, tableName);
    prepStatement.addBatch();
    private double[] dbArray = new double[1000];
   private void insertToDB() {
       for (int i = 0; i < 1000; i++){
           dbArray[i] = Math.random();
       }
   }
  
    // String SQL= "CREATE TABLE tempTable (num1 DOUBLE, num2 DOUBLE, num3 DOUBLE);";
    // statement.addBatch(SQL);
   String query = "INSERT INTO Temp VALUES " + dbArray ; 

}

public class DBConnectionPane extends BorderPane {
    TextField tfDriver = new TextArea();
    TextField tfUrl = new TextArea();
    TextField tfUN = new TextArea();
    TextField tfPW = new TextArea();

    Button btConnect = new Button("Connect to DB");
    VBox vBox = new VBox(5);
    vBox.getChildren().addAll(new Label("JDBC Driver"), tfDriver, new Label("Database URL"), tfUrl, new Label("Username"), tfUN, new Label("Password"), tfPW);

    tfDriver.setPrefColumnCount(40);
    tfUrl.setPrefColumnCount(40);
    tfUN.setPrefColumnCount(40);
    tfPW.setPrefColumnCount(40);
    btConnect.setOnAction( e -> {
        try {
            Class.forName(tfDriver);
            System.out.println("Driver loaded");

            Connection connection = DriverManager.getConnection
            (tfUrl, tfUN, tfPW);
            System.out.println("Database connected");

            Statement statement = connection.createStatement();

            statement.executeUpdate(query);

        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    });
}



