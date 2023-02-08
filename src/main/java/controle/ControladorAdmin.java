/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import dao.Dao;
import dao.DaoUser;
import java.util.List;
import modelos.Reserva;
import modelos.Usuario;

/**
 *
 * @author temporario
 */
public class ControladorAdmin {
    private Usuario usuario;
    private Dao<Usuario> dao;
    private DaoUser daoUser;   
    private List<Usuario> lista;    
    private Dao<Reserva> daoReserva;    
    private Boolean mostraPopupAlteracao;    

    
    public void salvarTerceiros(Reserva salvarReserva) {
     
    }
    
    public void cancelarTerceiros(Reserva cancelarReserva) {
     
    }
    
    public void permitirUsuario(Usuario usuarioPermitido){
        
    }   
    
    public void bloquearUsuario(Usuario usuarioBloqueado){
        
    }
    
    public void excluirUsuario(Usuario usuarioExcluido){
        
    }     
  
    public void fecharPopupAlteracao(){
        mostraPopupAlteracao = false; 
    }
}
