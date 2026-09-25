public class Aluno{

    private String nome,sexo,resultado;
    private int ra, idade;
    private double media;


    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public int getRa() {return ra;}
    public void setRa(int ra) {this.ra = ra;}

    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}

    public String getSexo() {return sexo;}
    public void setSexo(String sexo) {this.sexo = sexo;}

    public double getMedia() {return media;}
    public void setMedia(double media) {
        this.media = media;
        if (media >= 6.0) {
            this.resultado = "Aprovado";
        } else {
            this.resultado = "Reprovado";
        }
    }

    public String getResultado() {return resultado;}

    public Aluno() {this("Sem nome",0,0,"I",0.0);}

    public Aluno(String nome, int ra, int idade, String sexo, double media) {

        this.nome = nome;
        this.ra = ra;
        this.idade = idade;
        this.sexo = sexo;
        this.media = media;

        if (media >= 6.0) {
            this.resultado = "Aprovado";
        } else {
            this.resultado = "Reprovado";
        }

    }
}