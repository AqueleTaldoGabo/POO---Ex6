public class Decompositor {
    private String codigo;
    private String nome;

    public Decompositor() {
        this.codigo = "0000";
        this.nome = "Sem nome";
    }

    public Decompositor(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }
}
