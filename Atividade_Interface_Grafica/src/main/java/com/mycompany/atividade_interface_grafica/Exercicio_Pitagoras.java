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
public class Exercicio_Pitagoras extends JFrame{
    // CRIAÇÃO DE VARIÁVEIS DE INSTANCIA
    // Label dos campos
    JLabel foto, formula, aviso, rotulo_a, rotulo_b, rotulo_c, exibir_resultado, resultado;
    
    // Campos
    JTextField a, b, c;
   
    //Botões
    JButton calcular;
    
   // CRIAÇÃO DO MÉTODO CONSTRUTOR
    public Exercicio_Pitagoras(){
        // TITULO DA PÁGINA
        super("Teorema de Pitágoras");
        
        // CRIAÇÃO DO CONTAINER PARA RECEBER OBJETOS
        Container tela = getContentPane();

        // SERVE PARA AUTORIZAR O USO DO setBounds E DOS OBJETOS - PRECISA ESTAR NULL
        setLayout(null);
        
        // Não redimencionar a tela
        setResizable(false);
        
        //Adicionando cor a tela
        tela.setBackground(Color.BLACK);
        
        // Definindo o título da janela
        JLabel titleLabel = new JLabel("Calculando Teorema de Pitágoras", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 23));
        titleLabel.setForeground(new Color(135 ,206,250));
        titleLabel.setBounds(0, 0, 450, 70);
        tela.add(titleLabel);
        
        // Icone da janela 
        ImageIcon icone = new ImageIcon("pitagoras.png");
        setIconImage(icone.getImage());
        
        // Definindo o Subtítulo da janela
        JLabel subLabel = new JLabel("Preencha os campos abaixo:", SwingConstants.CENTER);
        subLabel.setFont(new Font("Serif", Font.BOLD, 23));
        subLabel.setForeground(new Color(18,10,143));
        subLabel.setBounds(0, 35, 450, 70);
        tela.add(subLabel);
        
        // Fórmula
        formula = new JLabel ("A² = B² + C²", SwingConstants.CENTER);
        formula.setBounds(115,152,200,200);
        formula.setForeground(new Color(135 ,206,250));
        formula.setFont(new Font ("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 26));
        tela.add(formula);
        
        // Fotos
        // Foto Principal
        ImageIcon foto_triangulo = new ImageIcon("pitagorass.png");
        foto = new JLabel (foto_triangulo);
        foto.setBounds(115,60,200,200);
        foto.setVisible(true);
        tela.add(foto);
       
        // Foto aviso
        ImageIcon foto_aviso = new ImageIcon("aviso_p.png");
        aviso = new JLabel (foto_aviso);
        aviso.setBounds(115,60,200,200);
        aviso.setVisible(false);
        tela.add(aviso);

        // Adicionando Nomes aos Label's
        rotulo_a = new JLabel ("* A:");
        rotulo_b = new JLabel("* B:");
        rotulo_c = new JLabel ("* C:");
        
        // Mudando a FonteS
        rotulo_a.setFont(new Font("Serif", Font.BOLD, 17));
        rotulo_b.setFont(new Font("Serif", Font.BOLD, 17));
        rotulo_c.setFont(new Font("Serif", Font.BOLD, 17));
        
        // Adicionado Cor
        rotulo_a.setForeground(Color.WHITE);
        rotulo_b.setForeground(Color.WHITE);
        rotulo_c.setForeground(Color.WHITE);
        
        // Campos
        a = new JTextField ();
        b = new JTextField ();
        c = new JTextField ();
        
        // Exibindo os Resultados 
        resultado = new JLabel("");
        exibir_resultado = new JLabel("");
        
        // Mudando a fonte dos resultados 
        resultado.setFont(new Font("Serif", Font.CENTER_BASELINE, 18));
        exibir_resultado.setFont(new Font("Serif", Font.CENTER_BASELINE, 16));
        
        // Dando cor ao subtitulo "Resultado"
        resultado.setForeground(new Color(135 ,206,250));

        // Botões
        calcular = new JButton("Calcular");
        
        // Adicionando Cor aos Botão e fonte.
        calcular.setBackground(new Color(18,10,143));
        calcular.setForeground(Color.WHITE);
        calcular.setFont(new Font("Serif", Font.BOLD, 17));
        
        // Posicionando os Elementos
        // Rótulos
        rotulo_a.setBounds(85, 285, 150, 25);
        rotulo_b.setBounds(175, 285, 150, 25);
        rotulo_c.setBounds(265, 285, 150, 25);

        // Campos
        a.setBounds(85, 310, 70, 30);
        b.setBounds(175, 310, 70, 30);
        c.setBounds(265, 310, 70, 30);
        
        // Botão
        calcular.setBounds(85, 354, 250, 30);
      
        // Resultados
        resultado.setBounds(85, 394, 250, 30);
        exibir_resultado.setBounds(85, 420, 250, 30);
        exibir_resultado.setForeground(Color.WHITE);
       
        // Ações que o programa fará
        // Método para o botão de Calcular
        calcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Variaveis
                double A = Double.parseDouble(a.getText());
                double B = Double.parseDouble(b.getText());
                double C = Double.parseDouble(c.getText());
                double calculo = 0;
                
                // Calculos e verificação de qual campo está vazio.

               if (C == 0) 
               {
                  calculo = ((A * A) - (B * B));
                  calculo = (Math.sqrt(calculo));
                  resultado.setText(" O Resultado é:");
                  exibir_resultado.setText(" "+calculo);
                  
                  //Trocando as fotos
                  foto.setVisible(true);
                  aviso.setVisible(false);
               }
               else if (B == 0) 
               {
                  calculo = ((A * A) - (C * C));
                  calculo = (Math.sqrt(calculo));
                  resultado.setText(" O Resultado é:");
                  exibir_resultado.setText(" "+calculo);
                  
                  //Trocando as fotos
                  foto.setVisible(true);
                  aviso.setVisible(false);
               }
               else if (A == 0) 
               {
                  calculo = ((C * C) + (B * B));
                  calculo = (Math.sqrt(calculo));
                  resultado.setText(" O Resultado é:");
                  exibir_resultado.setText(" "+calculo);
                  
                  //Trocando as fotos
                  foto.setVisible(true);
                  aviso.setVisible(false);
               } 
               else {
                    resultado.setText("Por favor,");
                    exibir_resultado.setText("Determine a incógnita!");
                    
                    //Trocando as fotos
                    foto.setVisible(false);
                    aviso.setVisible(true);
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
        tela.add(exibir_resultado);
        
        // Tela
        setSize(450,520);
        setVisible(true);
        setLocationRelativeTo(null); 
   }
     public static void main(String[] args) {
        // INSTANCIAMENTO DA CLASSE 
        Exercicio_Pitagoras start = new Exercicio_Pitagoras();
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 