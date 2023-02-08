/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import dao.Dao;
import java.util.List;
import modelos.Quadras;
import modelos.Reserva;
import modelos.Usuario;

/**
 *
 * @author temporario
 */
public class ControladorReserva {
    private Dao<Reserva> daoReserva;
    private Dao<Quadras> daoQuadras;
    private Reserva reserva;
    private List<Reserva> listaReserva;
    private List<Quadras> listaQuadras;
    private Boolean mostraPopupAlteracao;
    private Usuario usuario;


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
