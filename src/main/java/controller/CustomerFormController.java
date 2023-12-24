package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import model.Customer;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;


public class CustomerFormController implements Initializable {

    @FXML
    private AnchorPane Panecutomer;

    @FXML
    private Text TxtCustomerId;

    @FXML
    private Text TxtCustomerName;

    @FXML
    private Text TxtCustomerAddress;

    @FXML
    private Text TxtCustomerSalary;

    @FXML
    private TextField TxtFieldCusID;

    @FXML
    private TextField TxtFieldCusName;

    @FXML
    private TextField TxtFieldCusAddress;

    @FXML
    private TextField TxtFieldCusSalary;

    @FXML
    private Button BtnCusUpdate;

    @FXML
    private Button S;

    @FXML
    private TableView<?> TblCus;

    @FXML
    private TableColumn<?, ?> ColumnId;

    @FXML
    private TableColumn<?, ?> ColumnName;

    @FXML
    private TableColumn<?, ?> ColumnAddress;

    @FXML
    private TableColumn<?, ?> ColumnSalary;

    @FXML
    private TableColumn<?, ?> ColumnOption;

    @FXML
    private Button BtnReload;

    @FXML
    private Text TxtTitleCustomer;
    private int results;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void reloadButtonOnAction(ActionEvent actionEvent) {
    }

    public void getIdOnAction(ActionEvent actionEvent) {
    }

    public void getNameOnAction(ActionEvent actionEvent) {
    }

    public void getAddressOnAction(ActionEvent actionEvent) {
    }

    public void getSalaryOnAction(ActionEvent actionEvent) {
    }

    public void updateButtonOnAction(ActionEvent actionEvent) {
    }

    public void saveButtonOnAction(ActionEvent actionEvent) {
        Customer c = new Customer(TxtCustomerId.getText(),
                TxtCustomerName.getText(),
                TxtCustomerAddress.getText(),
                Double.parseDouble(TxtCustomerSalary.getText())
        );
        String sql = "INSERT INTO customer VALUES('"+c.getId()+"','"+c.getName()+"','"+c.getAddress()+"','"+c.getSalary()+")";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/thogakade","root","1234");
            Statement stm = connection.createStatement();
            int result = stm.executeUpdate(sql);
            if (results>0){
                new Alert(Alert.AlertType.INFORMATION,"Customer Saved!").show();
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
