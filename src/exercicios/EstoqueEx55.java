package exercicios;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class EstoqueEx55 {
    private ArrayList<String> produtos = new ArrayList<>();
    private final static String TITULO = "Sistema de Estoque";

    void addProduto() {
        String input = JOptionPane.showInputDialog(null, "Digite o nome do produto:", TITULO, JOptionPane.QUESTION_MESSAGE);
        
        if (input != null && !input.isBlank()) {
            produtos.add(input.trim());
            JOptionPane.showMessageDialog(null, "Produto '" + input + "' cadastrado!", TITULO, JOptionPane.INFORMATION_MESSAGE);
        } else if (input != null) {
            JOptionPane.showMessageDialog(null, "O nome não pode estar vazio!", TITULO, JOptionPane.WARNING_MESSAGE);
        }
    }

    void removeProduto() {
        if (produtos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "A lista está vazia!", TITULO, JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            String inputIndice = JOptionPane.showInputDialog(null, listarFormatado() + "\nDigite o índice para remover:", TITULO, JOptionPane.QUESTION_MESSAGE);
            
            if (inputIndice != null) {
                int indice = Integer.parseInt(inputIndice);
                
                if (indice >= 0 && indice < produtos.size()) {
                    String removido = produtos.remove(indice);
                    JOptionPane.showMessageDialog(null, "Produto '" + removido + "' removido!", TITULO, JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Índice inválido! Use um dos números da lista.", TITULO, JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Digite apenas números inteiros para o índice.", TITULO, JOptionPane.ERROR_MESSAGE);
        }
    }

    void exibirLista() {
        if (produtos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Estoque vazio!", TITULO, JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, listarFormatado(), TITULO, JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private String listarFormatado() {
        StringBuilder sb = new StringBuilder("--- Produtos em Estoque ---\n");
        for (int i = 0; i < produtos.size(); i++) {
            sb.append("[").append(i).append("] ").append(produtos.get(i)).append("\n");
        }
        return sb.toString();
    }

    int mostrarOpcoes() {
        String menu = "Escolha uma opção:\n"
                + "1. Adicionar Item\n"
                + "2. Remover Item\n"
                + "3. Ver Estoque\n"
                + "4. Sair";
        
        String input = JOptionPane.showInputDialog(null, menu, TITULO, JOptionPane.PLAIN_MESSAGE);
        
        try {
            return (input == null) ? 4 : Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1; 
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }

        EstoqueEx55 sistema = new EstoqueEx55();
        boolean rodando = true;

        while (rodando) {
            int opcao = sistema.mostrarOpcoes();

            switch (opcao) {
                case 1 -> sistema.addProduto();
                case 2 -> sistema.removeProduto();
                case 3 -> sistema.exibirLista();
                case 4 -> {
                    JOptionPane.showMessageDialog(null, "Encerrando sistema...", "Logout", JOptionPane.INFORMATION_MESSAGE);
                    rodando = false;
                }
                default -> JOptionPane.showMessageDialog(null, "Opção inválida!", TITULO, JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}