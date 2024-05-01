package contaBanco;

public class Conta {

    String nome;
    String agencia;
    String numero;
    double saldo;


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", agencia='" + getAgencia() + "'" +
            ", numero='" + getNumero() + "'" +
            ", saldo='" + getSaldo() + "'" +
            "}";
    }

    public Conta(){

    }

   public Conta( String nome, String agencia, String numero, double saldo){
     this.nome = nome;
     this.agencia = agencia;
     this.numero = numero;
     this.saldo = saldo;

   }
    
}
