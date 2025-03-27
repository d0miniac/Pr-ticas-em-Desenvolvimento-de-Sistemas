package controller;

import dal.ConexaoBD;
import java.sql.Connection;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.LoginDAO;
import model.Usuario;

public class LoginController {
    private Stage stageLogin;    
    private Connection conexao;
    private final LoginDAO dao = new LoginDAO();
    private ArrayList<String> listaDados;
    private Usuario user;
    
    @FXML
    private Button bntFechar;

    @FXML
    private Button bntLogar;

    @FXML
    private Label lblDB;

    @FXML
    private PasswordField txtSenha;

    @FXML
    private TextField txtUsuario;
    
    @FXML
    void bntFecharClick(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void bntLogarClick(ActionEvent event) {
        
    }
    
    public void setStage(Stage stage){
        this.stageLogin = stage;
    }
    
    public void verificarBanco(){
       this.conexao = ConexaoBD.conectar();
       if (this.conexao != null){
           System.out.println("Conectou no Banco de Dados!");
       } else {
           System.out.println("Problemas na conexão BD!");
       }
    }
    
    public void abrirJanela (){
        System.out.println("Janela exibida");
        verificarBanco();
    }
    
    public void processarLogin(){
        try{
            if(!dao.bancoOnline());
            
        }
    }
}
