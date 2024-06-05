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
public class Exercicio_Temperatura extends JFrame{
    // CRIAÇÃO DE VARIÁVEIS DE INSTANCIA
    // Label dos campos
    JLabel foto, foto_f, foto_k, foto_dois, rotulo_a, exibir_fahrenheit, exibir_kelvin, resultado;
    
    //Campos
    JTextField a;
   
    //Botões
    JButton calcular;
    
   // CRIAÇÃO DO MÉTODO CONSTRUTOR
    public Exercicio_Temperatura(){
        // TITULO DA PÁGINA
        super("Convertor Temperatura");
        
        // CRIAÇÃO DO CONTAINER PARA RECEBER OBJETOS
        Container tela = getContentPane();

        // SERVE PARA AUTORIZAR O USO DO setBounds E DOS OBJETOS - PRECISA ESTAR NULL
        setLayout(null);
        
        // Adicionando Cor a Janela
        tela.setBackground(Color.WHITE);
        
        // Definindo o título da janela
        JLabel titleLabel = new JLabel("Convertendo a Temperatura", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 24));
        titleLabel.setForeground(new Color(246,120,40));
        titleLabel.setBounds(0, 0, 450, 70);
        tela.add(titleLabel);
        
        //Icone da janela 
        ImageIcon icone = new ImageIcon("termometro.png");
        setIconImage(icone.getImage());
        
        // Definindo o Subtítulo da janela
        JLabel subLabel = new JLabel("Escreva a temperatura em °c:", SwingConstants.CENTER);
        subLabel.setFont(new Font("Serif", Font.BOLD, 23));
        subLabel.setForeground(new Color(18,10,143));
        subLabel.setBounds(0, 35, 450, 70);
        tela.add(subLabel);
        
        // Fotos
        // Foto principal - Um
        ImageIcon foto_temperatura = new ImageIcon("temperatura.png");
        foto = new JLabel (foto_temperatura);
        foto.setBounds(200,60,200,200);
        foto.setVisible(true);
        tela.add(foto);
        
        // Foto principal - Um
        ImageIcon foto_sol = new ImageIcon("sol.png");
        foto_dois = new JLabel (foto_sol);
        foto_dois.setBounds(40,200,200,200);
        foto_dois.setVisible(true);
        tela.add(foto_dois);
        
        // Foto Kelvin
        ImageIcon foto_kelvin = new ImageIcon("kelvin.png");
        foto_k = new JLabel (foto_kelvin);
        foto_k.setBounds(0,200,200,200);
        foto_k.setVisible(false);
        tela.add(foto_k);
        
        // Foto Fahrenheit
        ImageIcon foto_Fahrenheit = new ImageIcon("fahrenheit.png");
        foto_f = new JLabel (foto_Fahrenheit);
        foto_f.setBounds(70,200,200,200);
        foto_f.setVisible(false);
        tela.add(foto_f);
        
        // Adicionando Nomes aos Label's
        rotulo_a = new JLabel ("* Temperatura:");
        
        // Mudando a Fonte
        rotulo_a.setFont(new Font("Serif", Font.BOLD, 17));
        
        //Campos
        a = new JTextField ();
        
        // Exibindo os Resultados 
        resultado = new JLabel("");
        exibir_fahrenheit = new JLabel("");
        exibir_kelvin = new JLabel("");
        
        // Mudando a fonte dos resultados 
        resultado.setFont(new Font("Serif", Font.CENTER_BASELINE, 19));
        exibir_fahrenheit.setFont(new Font("Serif", Font.CENTER_BASELINE, 17));
        exibir_kelvin.setFont(new Font("Serif", Font.CENTER_BASELINE, 17));
                
        // Dando cor ao subtitulo "Resultado"
        resultado.setForeground(new Color(18,10,143));

        //Botões
        calcular = new JButton("Converter");
        
        //Adicionando Cor aos Botão e fonte.
        calcular.setBackground(new Color(246,120,40));
        calcular.setForeground(Color.WHITE);
        calcular.setFont(new Font("Serif", Font.BOLD, 17));
        
        // Posicionando os Elementos
        // Rótulos
        rotulo_a.setBounds(85, 100, 150, 25);

        // Campos
        a.setBounds(85, 130, 117, 30);
        
        //Botão
        calcular.setBounds(85, 180, 130, 30);
      
        // Resultados
        resultado.setBounds(260, 240, 250, 30);
        exibir_fahrenheit.setBounds(230, 268, 250, 30);
        exibir_kelvin.setBounds(230, 292, 250, 30);
       
        // Ações que o programa fará
        // Método para o botão de Calcular
        calcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Variavel
                double celsius = Double.parseDouble(a.getText());
                
                // Calculo fahrenheit
                double fahrenheit = ((celsius * 1.8)+32);
                resultado.setText("Conversão: ");
                exibir_fahrenheit.setText(+celsius+"°C são "+fahrenheit+"°F");
                
                // Calculo kelvin
                double kelvin = (celsius + 273.15);
                exibir_kelvin.setText(+celsius+"°C são "+kelvin+"K");
                
                // Trocando as fotos
                foto_dois.setVisible(false);
                foto_k.setVisible(true);
                foto_f.setVisible(true);
            }
        });   
         
        // Adicionando na Tela
        tela.add(a);
        tela.add(calcular);
        tela.add(rotulo_a);
        tela.add(resultado);
        tela.add(exibir_fahrenheit);
        tela.add(exibir_kelvin);
        
        // Tela
        setSize(450,430);
        setVisible(true);
        setLocationRelativeTo(null); 
   }
     public static void main(String[] args) {
        //INSTANCIAMENTO DA CLASSE 
        Exercicio_Temperatura start = new Exercicio_Temperatura();
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 