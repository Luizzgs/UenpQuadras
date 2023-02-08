/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import dao.Dao;
import dao.DaoUser;
import java.util.List;
import modelos.Usuario;

/**
 *
 * @author temporario
 */
public class ControladorUsuario {
    private Usuario usuario;
    private Dao<Usuario> dao;
    private DaoUser daoUser;   
    private List<Usuario> lista;
    private Boolean mostraPopupAlteracao;
    private Boolean verificarUser;


    public void iniciar() {
     
    }

    public void alterar() {
          
    }
      
    public void excluir() { 
        
    }
    
    public void salvar() {
     
    }
    
    public void salvarAlteracao() {
     
    }
    
    public void fecharPopupAlteracao(){
        mostraPopupAlteracao = false; 
    }
    
    //Getters and Setters
    


}
