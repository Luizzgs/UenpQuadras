/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author temporario
 */
public class Usuario{
    private String nome;
    private Integer matricula;
    private Integer telefone;
    private String email;
    private Integer id;
    private String login;
    private String senha;
    private Boolean admin;
    private Boolean bloqueio;

    public Usuario(String nome, Integer matricula, Integer telefone, String email, Integer id, String login, String senha, Boolean admin, Boolean bloqueio) {
        this.nome = nome;
        this.matricula = matricula;
        this.telefone = telefone;
        this.email = email;
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.admin = admin;
        this.bloqueio = bloqueio;
    
    }

    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }
    
    
      
    
    
}
