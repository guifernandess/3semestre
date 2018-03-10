/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADOI;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ADOI.*;

/**
 *
 * @author guilherme.rocha
 */
public class Main {
    
    public static void main(String[] args) {
    boolean condicao = true;
        
        listaSimples b = new listaSimples();
        while (condicao){
        JFrame frame = new JFrame("JOptionPane exemplo");
        String s = JOptionPane.showInputDialog(frame,
                "1- entrar com os dados dos carros no inicio. \n"
                + "2- entrar com os dados dos carros no fim da lista. \n"
                + "3- pesquisar se o carro está na lista, pelo modelo, e se estiver mostrar os outros dados. \n"
                + "4- imprimir todos os elementos da lista. \n"
                + "5- remover um elemento da lista, escolhido pelo modelo. \n"
                + "6- remover todos os elementos da lista.",
                "Menu de Seleção",
                JOptionPane.INFORMATION_MESSAGE
        );

        switch (s) {
            case "1":
                carros c = new carros();
                c.setModelo(JOptionPane.showInputDialog(frame,
                        "Modelo:",
                        JOptionPane.INFORMATION_MESSAGE
                ));
                c.setMarca(JOptionPane.showInputDialog(frame,
                        "Marca:",
                        JOptionPane.INFORMATION_MESSAGE
                ));
                c.setMarca(JOptionPane.showInputDialog(frame,
                        "Ano:",
                        JOptionPane.INFORMATION_MESSAGE
                ));
                b.inserirPrimeiro(c);
                break;
            case "2":
                carros d = new carros();
                d.setModelo(JOptionPane.showInputDialog(frame,
                        "Modelo:",
                        JOptionPane.INFORMATION_MESSAGE
                ));
                d.setMarca(JOptionPane.showInputDialog(frame,
                        "Marca:",
                        JOptionPane.INFORMATION_MESSAGE
                ));
                d.setMarca(JOptionPane.showInputDialog(frame,
                        "Ano:",
                        JOptionPane.INFORMATION_MESSAGE
                ));
                b.inserirPrimeiro(d);
                break;
            case "3":
                System.out.println("3");
                break;
            case "4":
                b.imprimirLista();
                break;
            case "5":
                System.out.println("5");
                break;
            case "6":
                System.out.println("6");
                break;
            default:
                System.out.println("Invalido");
              condicao = false;
                break;
        }
    }
    }
}
