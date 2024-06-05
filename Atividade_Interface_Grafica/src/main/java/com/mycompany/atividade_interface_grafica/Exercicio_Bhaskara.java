/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_interface_grafica; 
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Letícia Guanaes Moreira
 */
public class Exercicio_Bhaskara extends JFrame{
    // CRIAÇÃO DE VARIÁVEIS DE INSTANCIA
    // Label dos campos
    JLabel foto,foto_sraiz, rotulo_a, rotulo_b, rotulo_c, exibir_x1, exibir_x2, resultado;
    
    // Campos
    JTextField a, b, c;
   
    // Botões
    JButton calcular;
    
    // Icone botão
    ImageIcon formula_icon;
    
   // CRIAÇÃO DO MÉTODO CONSTRUTOR
    public Exercicio_Bhaskara(){
        // TITULO DA PÁGINA
        super("Bhaskara");
        
        // CRIAÇÃO DO CONTAINER PARA RECEBER OBJETOS
        Container tela = getContentPane();

        // SERVE PARA AUTORIZAR O USO DO setBounds E DOS OBJETOS - PRECISA ESTAR NULL
        setLayout(null);
        
        // Não redimencionar a tela
        setResizable(false);
        
        // Definindo o título da janela
        JLabel titleLabel = new JLabel("Calculando Fórmula de Bhaskara", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 23));
        titleLabel.setForeground(new Color(239,133,151));
        titleLabel.setBounds(0, 0, 450, 70);
        tela.add(titleLabel);
        
        // Icone da janela 
        ImageIcon icone = new ImageIcon("cerebroo_icon.png");
        setIconImage(icone.getImage());
        
        // Definindo o Subtítulo da janela
        JLabel subLabel = new JLabel("Preencha os campos abaixo:", SwingConstants.CENTER);
        subLabel.setFont(new Font("Serif", Font.BOLD, 23));
        subLabel.setForeground(new Color(246,120,40));
        subLabel.setBounds(0, 35, 450, 70);
        tela.add(subLabel);
        
        // Fotos
        // Principal
        ImageIcon foto_triangulo = new ImageIcon("trie.png");
        foto = new JLabel (foto_triangulo);
        foto.setBounds(115,55,200,200);
        foto.setVisible(true);
        tela.add(foto);

        // Foto sem raiz
        ImageIcon foto_raiz = new ImageIcon("x.png");
        foto_sraiz = new JLabel (foto_raiz);
        foto_sraiz.setBounds(115,55,200,200);
        foto_sraiz.setVisible(false);
        tela.add(foto_sraiz);
        
        // Adicionando Nomes aos Label's
        rotulo_a = new JLabel ("* A:");
        rotulo_b = new JLabel("* B:");
        rotulo_c = new JLabel ("* C:");
        
        // Mudando a Fonte
        rotulo_a.setFont(new Font("Serif", Font.BOLD, 17));
        rotulo_b.setFont(new Font("Serif", Font.BOLD, 17));
        rotulo_c.setFont(new Font("Serif", Font.BOLD, 17));
        
        // Campos
        a = new JTextField ();
        b = new JTextField ();
        c = new JTextField ();
        
        // Exibindo os Resultados 
        resultado = new JLabel("");
        exibir_x1 = new JLabel("");
        exibir_x2 = new JLabel("");
        
        // Mudando a fonte dos resultados 
        resultado.setFont(new Font("Serif", Font.CENTER_BASELINE, 18));
        exibir_x1.setFont(new Font("Serif", Font.CENTER_BASELINE, 16));
        exibir_x2.setFont(new Font("Serif", Font.CENTER_BASELINE, 16));
        
        // Dando cor ao subtitulo "Resultado"
        resultado.setForeground(new Color(239,133,151));

        // Botões
        calcular = new JButton("Calcular");
        
        // Adicionando Cor aos Botão e fonte.
        calcular.setBackground(new Color(239,133,151));
        calcular.setForeground(Color.WHITE);
        calcular.setFont(new Font("Serif", Font.BOLD, 17));
        
        // Posicionando os Elementos
        // Rótulos
        rotulo_a.setBounds(85, 225, 150, 25);
        rotulo_b.setBounds(175, 225, 150, 25);
        rotulo_c.setBounds(265, 225, 150, 25);

        // Campos
        a.setBounds(85, 250, 70, 30);
        b.setBounds(175, 250, 70, 30);
        c.setBounds(265, 250, 70, 30);
        
        // Botão
        calcular.setBounds(85, 290, 250, 30);
      
        // Resultados
        resultado.setBounds(85, 330, 250, 30);
        exibir_x1.setBounds(85, 360, 250, 30);
        exibir_x2.setBounds(85, 387, 250, 30);
        
        // Ações que o programa fará
        // Método para o botão de Calcular
        calcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Variaveis das Notas
                double A = Double.parseDouble(a.getText());
                double B = Double.parseDouble(b.getText());
                double C = Double.parseDouble(c.getText());
                double x1 = 0;
                double x2 = 0;
                
                // Cálculos
                // Calculando Delta
                double delta = ((B * B) - 4 * A * C);
                
                if (delta > 0) {
                    //Calculando o X1
                    x1 = (( - B + Math.sqrt(delta)) / (2*A)); 
                    
                    //Calculando o X2
                    x2 = (( - B - Math.sqrt(delta)) / (2*A)); 
                    
                    // Exibindo os Resultados
                    resultado.setText("Os Resultados são: "); 
                    exibir_x1.setText("x1 = " +x1);
                    exibir_x2.setText("x2 = " +x2);
                    
                    //Para trocar as fotos
                    foto.setVisible(true);
                    foto_sraiz.setVisible(false);
                }
                else if (delta == 0) {
                    //Calculando o X1
                    x1 = (( - B + Math.sqrt(delta)) / (2*A)); 
                    
                    //Calculando o X2
                    x2 = (( - B - Math.sqrt(delta)) / (2*A));
                    
                    // Exibindo os Resultados
                    resultado.setText("Os Resultados de x1 e x2 são iguais: "); 
                    exibir_x1.setText("x1 = " +x1);
                    exibir_x2.setText("x2 = " +x2);
                    
                    //Para trocar as fotos
                    foto.setVisible(true);
                    foto_sraiz.setVisible(false);
                }
                else if (delta < 0) {
                    resultado.setText("Não possui raízes reais!");
                    exibir_x1.setText("");
                    exibir_x2.setText("");
                    
                    //Para trocar as fotos
                    foto.setVisible(false);
                    foto_sraiz.setVisible(true);
                }
            }
        });
        
        // Adicionando na Tela
        tela.add(a);
        tela.add(b);
        tela.add(c);
        tela.add(calcular);
        tela.add(rotulo_a);
        tela.add(rotulo_b);
        tela.add(rotulo_c);
        tela.add(resultado);
        tela.add(exibir_x1);
        tela.add(exibir_x2);
        
        // Tela
        setSize(450,470);
        setVisible(true);
        setLocationRelativeTo(null); 
   }
     public static void main(String[] args) {
        // INSTANCIAMENTO DA CLASSE 
        Exercicio_Bhaskara start = new Exercicio_Bhaskara();
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 