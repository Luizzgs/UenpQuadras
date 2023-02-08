package modelos;

public class Quadras {
    private Integer indentificacao;
    private String nome;

    public Quadras(Integer indentificacao, String nome) {
        this.indentificacao = indentificacao;
        this.nome = nome;
    }   
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    } 

    public Integer getIndentificacao() {
        return indentificacao;
    }

    public void setIndentificacao(Integer indentificacao) {
        this.indentificacao = indentificacao;
    }

   


     
}
