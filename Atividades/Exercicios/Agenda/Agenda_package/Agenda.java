package Agenda_package;

public class Agenda {
    public static void main(String[] args) {
        Contato contatinho = new Contato(); // Criando uma instância de Contato

        String nome = "Claudio";
        String sobrenome = "Vargas";
        String telefone = "40028922";
        String endereco = "Palmas-To";

        contatinho.setContatos(nome, sobrenome, telefone, endereco); // Chamando o método setContatos da classe Contato
        contatinho.getContatosLinha(0); // Chamando o método listarContatos da classe Contato
    }
}
