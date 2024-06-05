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
public class Exercicio_Imc extends JFrame{
    // CRIAÇÃO DE VARIÁVEIS DE INSTANCIA
    // Label dos campos
    JLabel foto, foto_acima, foto_abaixo, foto_ideal, rotulo_a, rotulo_b, exibir_resultado, resultado;
    
    // Campos
    JTextField a, b;
   
    // Botões
    JButton calcular;
    
   // CRIAÇÃO DO MÉTODO CONSTRUTOR
    public Exercicio_Imc(){
        // TITULO DA PÁGINA
        super("Imc");
        
        // CRIAÇÃO DO CONTAINER PARA RECEBER OBJETOS
        Container tela = getContentPane();

        // SERVE PARA AUTORIZAR O USO DO setBounds E DOS OBJETOS - PRECISA ESTAR NULL
        setLayout(null);
        
        // Definindo o título da janela
        JLabel titleLabel = new JLabel("Calculando o seu Imc", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 24));
        titleLabel.setForeground(new Color(65,105,225));
        titleLabel.setBounds(0, 0, 450, 70);
        tela.add(titleLabel);
        
        // Icone da janela 
        ImageIcon icone = new ImageIcon("balanca.png");
        setIconImage(icone.getImage());
        
        // Definindo o Subtítulo da janela
        JLabel subLabel = new JLabel("Preencha os campos abaixo:", SwingConstants.CENTER);
        subLabel.setFont(new Font("Serif", Font.BOLD, 23));
        subLabel.setForeground(Color.BLACK);
        subLabel.setBounds(0, 35, 450, 70);
        tela.add(subLabel);
        
        // Fotos
        // Foto principal
        ImageIcon foto_imc = new ImageIcon("altura.png");
        foto = new JLabel (foto_imc);
        foto.setBounds(120,60,200,200);
        foto.setVisible(true);
        tela.add(foto);
        
        // Foto IMC Acima
        ImageIcon foto_perda = new ImageIcon("acima.png");
        foto_acima = new JLabel (foto_perda);
        foto_acima.setBounds(120,60,200,200);
        foto_acima.setVisible(false);
        tela.add(foto_acima);
        
        // Foto IMC Ideal
        ImageIcon foto_bom = new ImageIcon("saudavel.png");
        foto_ideal = new JLabel (foto_bom);
        foto_ideal.setBounds(120,60,200,200);
        foto_ideal.setVisible(false);
        tela.add(foto_ideal);
        
        // Foto IMC Abaixo
        ImageIcon foto_ganhar = new ImageIcon("abaixo.png");
        foto_abaixo = new JLabel (foto_ganhar);
        foto_abaixo.setBounds(120,60,200,200);
        foto_abaixo.setVisible(false);
        tela.add(foto_abaixo);
        
        // Adicionando Nomes aos Label's
        rotulo_a = new JLabel ("* Peso:");
        rotulo_b = new JLabel("* Altura:");
        
        // Mudando a Fonte
        rotulo_a.setFont(new Font("Serif", Font.BOLD, 17));
        rotulo_b.setFont(new Font("Serif", Font.BOLD, 17));
        
        // Campos
        a = new JTextField ();
        b = new JTextField ();
        
        // Exibindo os Resultados 
        resultado = new JLabel("", SwingConstants.CENTER);
        exibir_resultado = new JLabel("", SwingConstants.CENTER);
        
        // Mudando a fonte dos resultados 
        resultado.setFont(new Font("Serif", Font.CENTER_BASELINE, 18));
        exibir_resultado.setFont(new Font("Serif", Font.CENTER_BASELINE, 16));
        
        // Dando cor ao subtitulo "Resultado"
        resultado.setForeground(new Color(65,105,225));

        // Botões
        calcular = new JButton("Calcular Imc");
        
        // Adicionando Cor aos Botão e fonte.
        calcular.setBackground(new Color(65,105,225));
        calcular.setForeground(Color.WHITE);
        calcular.setFont(new Font("Serif", Font.BOLD, 17));
        
        // Posicionando os Elementos
        // Rótulos
        rotulo_a.setBounds(85, 232, 150, 25);
        rotulo_b.setBounds(225, 232, 150, 25);

        // Campos
        a.setBounds(85, 257, 110, 30);
        b.setBounds(225, 257, 110, 30);
        
        // Botão
        calcular.setBounds(85, 300, 250, 30);
      
        // Resultados
        resultado.setBounds(85, 345, 250, 30);
        exibir_resultado.setBounds(85, 370, 250, 30);
       
        // Ações que o programa fará
        // Método para o botão de Calcular
        calcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Variaveis
                double peso = Double.parseDouble(a.getText());
                double altura = Double.parseDouble(b.getText());
                
                // Calculando o IMC
                double imc = ((peso / (altura * altura) ));
                
                // Adquando aos diagnósticos
                if (imc < 18){
                  resultado.setText("O seu IMC diz: ");
                  exibir_resultado.setText("Você está abaixo do peso ideal!");
                  
                  // Trocando as fotos
                  foto.setVisible(false);
                  foto_acima.setVisible(false);
                  foto_abaixo.setVisible(true);
                  foto_ideal.setVisible(false);
                }
                else if (imc > 18.5 && imc < 24.99){
                  resultado.setText("O seu IMC diz: ");
                  exibir_resultado.setText("Você está no peso ideal!");
                  
                  // Trocando as fotos
                  foto.setVisible(false);
                  foto_acima.setVisible(false);
                  foto_abaixo.setVisible(false);
                  foto_ideal.setVisible(true);
                }
                else if (imc > 25){
                  resultado.setText("O seu IMC diz: ");
                  exibir_resultado.setText("Você está acima do peso ideal!");
                  
                  // Trocando as fotos
                  foto.setVisible(false);
                  foto_acima.setVisible(true);
                  foto_abaixo.setVisible(false);
                  foto_ideal.setVisible(false);
                }
            }
        });   
         
        // Adicionando na Tela
        tela.add(a);
        tela.add(b);
        tela.add(calcular);
        tela.add(rotulo_a);
        tela.add(rotulo_b);
        tela.add(resultado);
        tela.add(exibir_resultado);
        
        // Tela
        setSize(450,470);
        setVisible(true);
        setLocationRelativeTo(null); 
   }
     public static void main(String[] args) {
        //INSTANCIAMENTO DA CLASSE 
        Exercicio_Imc start = new Exercicio_Imc();
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 