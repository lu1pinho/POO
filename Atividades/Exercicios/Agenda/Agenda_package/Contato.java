package Exercicios.Agenda.Agenda_package;
public class Contato {
    private final int contatos_max = 10; // Quantidade Maxima de Contatos
    private int adicionados = 0; // Quantidade de Contatos Adicionados
    private String[][] contatos = new String[contatos_max][4]; 

    // Getters and Setters

    // Adicionar um contato
    public int setContatos(String nome, String sobrenome, String telefone, String endereco) {
        if(adicionados<10) {
            this.contatos[adicionados][0] = nome;
            this.contatos[adicionados][1] = sobrenome;
            this.contatos[adicionados][2] = telefone;
            this.contatos[adicionados][3] = endereco;
            adicionados++;
            System.out.println("Contato Adicionado Coretamente!");
            return 0; // Retorna 0 se for adicionado corretamente.
        } else {
            return 1; // Retorna 1 se houver falha.
        }
    }

    // Contato na Linha
    public String[] getContatosLinha(int linha) {
        if (linha >= 0 && linha < contatos.length) {
            String[] dados = new String[3]; // Nome, Sobrenome, Telefone
            for (int j = 0; j < 3; j++) {
                dados[j] = contatos[linha][j];
            }
            return dados;
        } else {
            return null; 
        }
    }
    
    // Procurar Contato por Nome
    public String[] getbyFullName(String x, String y){
        String[] dados_busca= new String[3];
        for (int i = 0; i < adicionados; i++) {
            if(contatos[i][0].equalsIgnoreCase(x) && contatos[i][1].equalsIgnoreCase(y)){
                dados_busca[0] = contatos[i][0];
                dados_busca[1] = contatos[i][1];
                dados_busca[2] = contatos[i][2];
            }
        }
        return dados_busca;
    }
    
    public void listarContatos(int contatos_max) {
        for (String[] strings : contatos) {
            System.out.println(strings);
        }
    }

}




