package model;

import dal.ConexaoBD;
import java.sql.Connection;


public class GenericDAO {
    private Connection conexao;
    
    protected GenericDAO(){
        this.conexao = ConexaoBD.conectar();
    }
    
    protected Connection conectarDAO(){
        this.conexao = ConexaoBD.conectar();
        return conexao;
        
    }
}
