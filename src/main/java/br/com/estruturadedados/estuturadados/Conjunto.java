package br.com.estruturadedados.estuturadados;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Conjunto {
    
    private ArrayList<LinkedList<String>> tabela = new ArrayList<>();

    public Conjunto() {
        for (int i = 0; i<10; i++){
            tabela.add(new LinkedList<>());
        }
    }

    // Função para adicionar a palava
    public void adiciona (String palavra){
        if (!contem(palavra)){
            int indice = calculaIndiceDaTabela(palavra);
            List<String> lista = tabela.get(indice);
            lista.add (palavra);
        }
    }

    //Verifica se contem a palavra antes de adicionar
    private boolean contem(String palavra){
        int indice = calculaIndiceDaTabela(palavra);
        return tabela.get(indice).contains(palavra);
    }


    private int calculaIndiceDaTabela(String palavra) {
        return palavra.toLowerCase().charAt(0) % 26;
    }

    @Override
    public String toString(){
        return tabela.toString();
    }

}