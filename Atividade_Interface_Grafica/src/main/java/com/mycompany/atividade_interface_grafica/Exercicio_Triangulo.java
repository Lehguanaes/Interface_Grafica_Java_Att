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
public class Exercicio_Triangulo extends JFrame{
    // CRIAÇÃO DE VARIÁVEIS DE INSTANCIA
    // Label dos campos
    JLabel foto, foto_e, foto_i, foto_es, rotulo_a, rotulo_b, rotulo_c, exibir_resultado, resultado;
    
    //Campos
    JTextField a, b, c;
   
    //Botões
    JButton calcular;
   
   // CRIAÇÃO DO MÉTODO CONSTRUTOR
    public Exercicio_Triangulo(){
        // TITULO DA PÁGINA
        super("Tipo de Triângulo");
        
        // CRIAÇÃO DO CONTAINER PARA RECEBER OBJETOS
        Container tela = getContentPane();

        // SERVE PARA AUTORIZAR O USO DO setBounds E DOS OBJETOS - PRECISA ESTAR NULL
        setLayout(null);
        
        // Definindo o título da janela
        JLabel titleLabel = new JLabel("Calculando o Tipo de Triângulo", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 23));
        titleLabel.setForeground(new Color(153,51,153));
        titleLabel.setBounds(0, 0, 450, 70);
        tela.add(titleLabel);
        
        //Icone da janela 
        ImageIcon icone = new ImageIcon("triangulo.png");
        setIconImage(icone.getImage());
        
        // Definindo o Subtítulo da janela
        JLabel subLabel = new JLabel("Preencha os campos abaixo:", SwingConstants.CENTER);
        subLabel.setFont(new Font("Serif", Font.BOLD, 23));
        subLabel.setForeground(Color.DARK_GRAY);
        subLabel.setBounds(0, 35, 450, 70);
        tela.add(subLabel);
        
        // Fotos
        // Foto Principal
        ImageIcon foto_triangulo = new ImageIcon("triangulo_foto.png");
        foto = new JLabel (foto_triangulo);
        foto.setBounds(220,95,200,200);
        foto.setVisible(true);
        tela.add(foto);
        
        // Foto Equilatero
        ImageIcon foto_equi = new ImageIcon("equilatero.png");
        foto_e = new JLabel (foto_equi);
        foto_e.setBounds(220,80,200,200);
        foto_e.setVisible(false);
        tela.add(foto_e);
        
        // Foto Escaleno
        ImageIcon foto_esc = new ImageIcon("escaleno.png");
        foto_es = new JLabel (foto_esc);
        foto_es.setBounds(220,90,200,200);
        foto_es.setVisible(false);
        tela.add(foto_es);
        
        // Foto Principal
        ImageIcon foto_is = new ImageIcon("isos.png");
        foto_i = new JLabel (foto_is);
        foto_i.setBounds(220,85,200,200);
        foto_i.setVisible(false);
        tela.add(foto_i);
        
        // Adicionando Nomes aos Label's
        rotulo_a = new JLabel ("* Lado 1:");
        rotulo_b = new JLabel("* Lado 2:");
        rotulo_c = new JLabel ("* Lado 3:");
        
        // Mudando a Fonte
        rotulo_a.setFont(new Font("Serif", Font.BOLD, 17));
        rotulo_b.setFont(new Font("Serif", Font.BOLD, 17));
        rotulo_c.setFont(new Font("Serif", Font.BOLD, 17));
        
        rotulo_a.setForeground(new Color(153,51,153));
        rotulo_b.setForeground(new Color(153,51,153));
        rotulo_c.setForeground(new Color(153,51,153));
        
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
        resultado.setForeground(new Color(153,51,153));

        // Botões
        calcular = new JButton("Verificar Tipo");
        
        // Adicionando Cor aos Botão e fonte.
        calcular.setBackground(new Color(182,149,192));
        calcular.setForeground(Color.WHITE);
        calcular.setFont(new Font("Serif", Font.BOLD, 17));
        
        // Posicionando os Elementos
        // Rótulos
        rotulo_a.setBounds(60, 100, 148, 25);
        rotulo_b.setBounds(60, 165, 148, 25);
        rotulo_c.setBounds(60, 225, 148, 25);

        // Campos
        a.setBounds(60, 130, 130, 30);
        b.setBounds(60, 190, 130, 30);
        c.setBounds(60, 250, 130, 30);
        
        //Botão
        calcular.setBounds(110, 315, 250, 30);
      
        // Resultados
        resultado.setBounds(240, 250, 250, 30);
        exibir_resultado.setBounds(240, 275, 250, 30);
       
        // Ações que o programa fará
        // Método para o botão de Calcular
        calcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Variaveis das Notas
                double lado_um = Double.parseDouble(a.getText());
                double lado_dois = Double.parseDouble(b.getText());
                double lado_tres = Double.parseDouble(c.getText());
                
                // Verificação de qual tipo é
                // 3 lados iguais
                if (lado_um == lado_dois && lado_dois == lado_tres){
                  resultado.setText("Equilatero, ");
                  exibir_resultado.setText("pois possui 3 lados iguais.");
                  
                  //Trocando as fotos
                  foto.setVisible(false);
                  foto_e.setVisible(true);
                  foto_es.setVisible(false);
                  foto_i.setVisible(false);
                }
                // 3 lados diferentes
                else if (lado_um != lado_dois && lado_dois != lado_tres && lado_um != lado_tres){
                  resultado.setText("Escaleno, ");
                  exibir_resultado.setText("pois possui 3 lados diferentes.");
                  
                  //Trocando as fotos
                  foto.setVisible(false);
                  foto_e.setVisible(false);
                  foto_es.setVisible(true);
                  foto_i.setVisible(false);
                }
                // lado 1 diferente
                else if (lado_um != lado_dois && lado_dois == lado_tres){
                  resultado.setText("Isôsceles,");
                  exibir_resultado.setText("pois possui 2 lados iguais.");
                  
                  //Trocando as fotos
                  foto.setVisible(false);
                  foto_e.setVisible(false);
                  foto_es.setVisible(false);
                  foto_i.setVisible(true);
                }
                // lado 2 diferente
                else if (lado_dois!= lado_um && lado_um == lado_tres){
                  resultado.setText("Isôsceles,");
                  exibir_resultado.setText("pois possui 2 lados iguais.");
                  
                  //Trocando as fotos
                  foto.setVisible(false);
                  foto_e.setVisible(false);
                  foto_es.setVisible(false);
                  foto_i.setVisible(true);
                }
                // lado 3 diferente
                else if (lado_tres != lado_dois && lado_dois == lado_um){
                  resultado.setText("Isôsceles,");
                  exibir_resultado.setText("pois possui 2 lados iguais.");
                  
                  //Trocando as fotos
                  foto.setVisible(false);
                  foto_e.setVisible(false);
                  foto_es.setVisible(false);
                  foto_i.setVisible(true);
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
        setSize(480,410);
        setVisible(true);
        setLocationRelativeTo(null); 
   }
     public static void main(String[] args) {
        //INSTANCIAMENTO DA CLASSE 
        Exercicio_Triangulo start = new Exercicio_Triangulo();
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 