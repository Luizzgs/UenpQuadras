/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import java.time.LocalDateTime;
/**
 *
 * @author temporario
 */
public class Reserva {
    private Usuario usuario;
    private Quadras quadra;
    private LocalDateTime myDateObj;

    public Reserva(Usuario usuario, Quadras quadra, LocalDateTime myDateObj) {
        this.usuario = usuario;
        this.quadra = quadra;
        this.myDateObj = myDateObj;
    }  
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Quadras getQuadra() {
        return quadra;
    }

    public void setQuadra(Quadras quadra) {
        this.quadra = quadra;
    }

    public LocalDateTime getMyDateObj() {
        return myDateObj;
    }

    public void setMyDateObj(LocalDateTime myDateObj) {
        this.myDateObj = myDateObj;
    }
    
    
    
    
    
    
    
}
