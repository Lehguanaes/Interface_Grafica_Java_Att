/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_interface_grafica;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;
import java.text.*;
import java.awt.*;

/**
 *
 * @author Letícia Guanaes Moreira
 */
public class Exercicio_Media extends JFrame{
    // CRIAÇÃO DE VARIÁVEIS DE INSTANCIA
    //Label dos campos
    JLabel foto, foto_aprovado, foto_reprovado, rotulo_nota_um, rotulo_nota_dois, rotulo_nota_tres, rotulo_nota_quatro, exibir_maior_nota, exibir_menor_nota, exibir_media, resultados;
    
    //Campos
    JFormattedTextField nota_um, nota_dois, nota_tres, nota_quatro;
    
    //Mascara dos Campos
    MaskFormatter  mascara_nota_um, mascara_nota_dois ,mascara_nota_tres ,mascara_nota_quatro;
    
    //Botões
    JButton calcular, limpar, sair;
    
    //icone botão
    ImageIcon calcular_icon, limpar_icon, sair_icon;
    
   // CRIAÇÃO DO MÉTODO CONSTRUTOR
    public Exercicio_Media(){
        // TITULO DA PÁGINA
        super("Média dos Alunos");
        
        // CRIAÇÃO DO CONTAINER PARA RECEBER OBJETOS
        Container tela = getContentPane();

        // SERVE PARA AUTORIZAR O USO DO setBounds E DOS OBJETOS - PRECISA ESTAR NULL
        setLayout(null);
        
        // Não redimencionar a tela
        setResizable(false);
        
        // Definindo o título da janela
        JLabel titleLabel = new JLabel("Média do Aluno (a)", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 23));
        titleLabel.setForeground(new Color(225,0,127));
        titleLabel.setBounds(0, 0, 450, 70);
        tela.add(titleLabel);
        
        // Icone da janela 
        ImageIcon icone = new ImageIcon("cerebro_icon.png");
        setIconImage(icone.getImage());
        
        // Definindo o Subtítulo da janela
        JLabel subLabel = new JLabel("Informe as Quatro Notas do Aluno(a):", SwingConstants.CENTER);
        subLabel.setFont(new Font("Serif", Font.BOLD, 21));
        subLabel.setForeground(new Color(3,187,133));
        subLabel.setBounds(0, 35, 450, 70);
        tela.add(subLabel);
        
        // Fotos
        // Principal
        ImageIcon foto_aluno = new ImageIcon("aluna.png");
        foto = new JLabel (foto_aluno);
        foto.setBounds(220,60,200,210);
        foto.setVisible(true);
        tela.add(foto);
        
        // Foto Aprovado
        ImageIcon foto_aprovada = new ImageIcon("aprovar.png");
        foto_aprovado = new JLabel (foto_aprovada);
        foto_aprovado.setBounds(220,60,200,210);
        foto_aprovado.setVisible(false);
        tela.add(foto_aprovado);
        
        // Foto Reprovado
       ImageIcon foto_reprovada = new ImageIcon("reprovado.png");
        foto_reprovado = new JLabel (foto_reprovada);
        foto_reprovado.setBounds(220,60,200,210);
        foto_reprovado.setVisible(false);
        tela.add(foto_reprovado);
        
        // Adicionando Nomes aos Label's
        rotulo_nota_um = new JLabel ("* 1° Nota:");
        rotulo_nota_dois = new JLabel("* 2° Nota:");
        rotulo_nota_tres = new JLabel ("* 3° Nota:");
        rotulo_nota_quatro = new JLabel ("* 4° Nota:");
        
        rotulo_nota_um.setFont(new Font("Serif", Font.BOLD, 17));
        rotulo_nota_dois.setFont(new Font("Serif", Font.BOLD, 17));
        rotulo_nota_tres.setFont(new Font("Serif", Font.BOLD, 17));
        rotulo_nota_quatro.setFont(new Font("Serif", Font.BOLD, 17));
       
        // Definindo as Mascaras dos Campos
        try{
            mascara_nota_um = new MaskFormatter ("##");
            mascara_nota_dois = new MaskFormatter ("##");
            mascara_nota_tres = new MaskFormatter ("##");
            mascara_nota_quatro = new MaskFormatter ("##");
            mascara_nota_um.setPlaceholderCharacter('_');
            mascara_nota_dois.setPlaceholderCharacter('_');
            mascara_nota_tres.setPlaceholderCharacter('_');
            mascara_nota_quatro.setPlaceholderCharacter('_');
        }
        catch(ParseException excp){}
        
        // Adicinando as Mascaras aos Campos
        nota_um = new JFormattedTextField (mascara_nota_um);
        nota_dois = new JFormattedTextField ( mascara_nota_dois);
        nota_tres = new JFormattedTextField (mascara_nota_tres);
        nota_quatro = new JFormattedTextField (mascara_nota_quatro);
        
        // Posicionando os Elementos
        // Rótulos
        rotulo_nota_um.setBounds(50, 105, 150, 25);
        rotulo_nota_dois.setBounds(140, 105, 150, 25);
        rotulo_nota_tres.setBounds(50, 170, 150, 25);
        rotulo_nota_quatro.setBounds(140, 170, 120, 25);
        rotulo_nota_um.setForeground(Color.BLACK);
        rotulo_nota_dois.setForeground(Color.BLACK);
        rotulo_nota_tres.setForeground(Color.BLACK);
        rotulo_nota_quatro.setForeground(Color.BLACK);
        
        // Campos
        nota_um.setBounds(50, 130, 73, 30);
        nota_dois.setBounds(140, 130, 73, 30);
        nota_tres.setBounds(50, 195, 73, 30);
        nota_quatro.setBounds(140, 195, 73, 30);

        // Adicionando Cor as Mascaras
        nota_um.setForeground(new Color(225,0,127));
        nota_dois.setForeground(new Color(225,0,127));
        nota_tres.setForeground(new Color(225,0,127));
        nota_quatro.setForeground(new Color(225,0,127));
        
        // Icone dos botões
        calcular_icon = new ImageIcon("calcular_icon.png");
        limpar_icon = new ImageIcon("limpar_icon.png");
        sair_icon = new ImageIcon("sair_icon.png");
        
        // Botões
        calcular = new JButton("Calcular", calcular_icon);
        limpar = new JButton("Limpar", limpar_icon);
        sair = new JButton("Sair", sair_icon);

        // Posicionando os Botões na Tela
        calcular.setBounds(50, 250, 110, 30);
        limpar.setBounds(170, 250, 110, 30);
        sair.setBounds(290, 250, 100, 30);
        
        // Adicionando Cor aos Botões
        calcular.setBackground(Color.WHITE);
        limpar.setBackground(Color.WHITE);
        sair.setBackground(Color.WHITE);
        
        // Exibindo os Resultados 
        resultados = new JLabel(" ");
        exibir_maior_nota = new JLabel(" ");
        exibir_menor_nota = new JLabel(" ");
        exibir_media = new JLabel(" ");
        
        // Mudando a fonte dos resultados 
        resultados.setFont(new Font("Serif", Font.CENTER_BASELINE, 17));
        exibir_maior_nota.setFont(new Font("Serif", Font.CENTER_BASELINE, 16));
        exibir_menor_nota.setFont(new Font("Serif", Font.CENTER_BASELINE, 16));
        exibir_media.setFont(new Font("Serif", Font.CENTER_BASELINE, 16));
        
        // Dando cor ao subtitulo "Resultado"
        resultados.setForeground(new Color(3,187,133));
        
        // Posicionando os Resultados na Tela
        resultados.setBounds(50, 290, 300, 20);
        exibir_maior_nota.setBounds(50, 315, 300, 20);
        exibir_menor_nota.setBounds(50, 340, 300, 20);
        exibir_media.setBounds(50, 365, 300, 20);
        
        // Ações que o programa fará
        // Método para o botão de Calcular
        calcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Variaveis das Notas
                double nota_01 = Double.parseDouble(nota_um.getText());
                double nota_02 = Double.parseDouble(nota_dois.getText());
                double nota_03 = Double.parseDouble(nota_tres.getText());
                double nota_04 = Double.parseDouble(nota_quatro.getText());

                //Cálculo da Média das Notas
                double media = ((nota_01 + nota_02 + nota_03 + nota_04)/4);
                if (media >= 7){
                    exibir_media.setText("- O aluno (a) foi Aprovado com média : " +media);
                    
                    //Para trocar as fotos
                    foto.setVisible(false);
                    foto_reprovado.setVisible(false);
                    foto_aprovado.setVisible(true);
                }
                else if (media < 7){
                    exibir_media.setText("- O aluno (a) foi Reprovado com média : " +media);
                    
                    //Para trocar as fotos
                    foto.setVisible(false);
                    foto_aprovado.setVisible(false);
                    foto_reprovado.setVisible(true);
                }
                // Título do Resultado
                resultados.setText("Os Resultados são:");
                
                // Cálculo da Maior e da Menor Nota
                // Verificando qual foi a Maior nota do usuario
                if (nota_01 >= nota_02 && nota_01 >= nota_03 && nota_01 >= nota_04) {
                    exibir_maior_nota.setText("- A maior nota do aluno (a) é: " + nota_01);
                } else if (nota_02 >= nota_01 && nota_02 >= nota_03 && nota_02 >= nota_04) {
                    exibir_maior_nota.setText("- A maior nota do aluno (a) é: " + nota_02);
                } else if (nota_03 >= nota_01 && nota_03 >= nota_02 && nota_03 >= nota_04) {
                    exibir_maior_nota.setText("- A maior nota do aluno (a) é: " + nota_03);
                } else {
                    exibir_maior_nota.setText("- A maior nota do aluno (a) é: " + nota_04);
                }

                // Verificando qual foi a MENOR nota do usuario
                if (nota_01 <= nota_02 && nota_01 <= nota_03 && nota_01 <= nota_04) {
                    exibir_menor_nota.setText("- A menor nota do aluno (a) é: " + nota_01);
                } else if (nota_02 <= nota_01 && nota_02 <= nota_03 && nota_02 <= nota_04) {
                    exibir_menor_nota.setText("- A menor nota do aluno (a) é: " + nota_02);
                } else if (nota_03 <= nota_01 && nota_03 <= nota_02 && nota_03 <= nota_04) {
                    exibir_menor_nota.setText("- A menor nota do aluno (a) é: " + nota_03);
                } else {
                    exibir_menor_nota.setText("- A menor nota do aluno (a) é: " + nota_04);
                } 
            }
        });
            // Método para o botão de Limpar Campos
            limpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                //Para limpar os Campos
                nota_um.setText(null);
                nota_dois.setText(null);
                nota_tres.setText(null);
                nota_quatro.setText(null);
                
                //Para trocar as fotos
                foto.setVisible(true);
                foto_aprovado.setVisible(false);
                foto_reprovado.setVisible(false);
                
                //Para limpar os Resultados
                resultados.setText("");
                exibir_media.setText("");
                exibir_maior_nota.setText("");
                exibir_menor_nota.setText("");
            }
        });
            
            // Método para o botão Sair
            sair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
   
        // Adicionando na Tela
        tela.add(rotulo_nota_um);
        tela.add(rotulo_nota_dois);
        tela.add(rotulo_nota_tres);
        tela.add(rotulo_nota_quatro);
        tela.add(nota_um);
        tela.add(nota_dois);
        tela.add(nota_tres);
        tela.add(nota_quatro);
        tela.add(calcular);
        tela.add(limpar);
        tela.add(sair);
        tela.add(exibir_maior_nota);
        tela.add(exibir_menor_nota);
        tela.add(exibir_media);
        tela.add(resultados);
        
        // Tela
        setSize(450,455);
        setVisible(true);
        setLocationRelativeTo(null); 
   }
     public static void main(String[] args) {
        // INSTANCIAMENTO DA CLASSE 
        Exercicio_Media start = new Exercicio_Media();
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 