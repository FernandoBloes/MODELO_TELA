import javax.swing.*;
import java.awt.*;

public class AWT_TESTE {
    public static void main(String[] args) {
        // Criando o JFrame com o título AWT Test
        JFrame frame = new JFrame("AWT Test");

        // Ação de fechamento do programa
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tamanho da janela principal (largura, altura)
        frame.setSize(400, 200);

        // Layout principal da janela
        frame.setLayout(new BorderLayout());

        // JLabel (etiqueta de texto) e um JTextField (campo de texto)
        JLabel label1 = new JLabel("Label1");
        JTextField textField1 = new JTextField(17);

        // Painel para adicionar o JLabel e JTextField
        JPanel topPanel = new JPanel();

        // Layout do painel superior como FlowLayout (organiza os componentes
        // horizontalmente
        topPanel.setLayout(new FlowLayout());

        // Adicionando o JLabel e JTextField ao painel superior
        topPanel.add(label1);
        topPanel.add(textField1);

        // Criando três botões e define seus textos
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        // Criando outro painel para os botões
        JPanel buttonPanel = new JPanel();

        // Definindo o layout do painel de botões como FlowLayout
        buttonPanel.setLayout(new FlowLayout());

        // Adicionando os botões ao painel de botões
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);

        // Adicionando o painel superior ao norte (parte superior) do BorderLayout
        frame.add(topPanel, BorderLayout.NORTH);

        // Adicionando o painel de botões ao centro do BorderLayout
        frame.add(buttonPanel, BorderLayout.CENTER);

        // Tornando a janela visível
        frame.setVisible(true);
    }
}