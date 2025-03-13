/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package principal;

import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class BancoDeDados {

    public static void main(String[] args) throws SQLException {
        ConexaoBD conexaoBD = new ConexaoBD();
        conexaoBD.conectarBanco();
        
    }
}
