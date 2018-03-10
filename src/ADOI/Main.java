/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADOI;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ADOI.*;
import java.util.Scanner;

/**
 *
 * @author guilherme.rocha
 */
public class Main {

    public static void main(String[] args) {
        boolean condicao = true;
        Scanner console = new Scanner(System.in);
        listaSimples b = new listaSimples();
        while (condicao) {
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
                    System.out.print("Digite o Modelo do veiculo: ");
                    String modelo = console.next();
                    System.out.print("Digite a Marca do veiculo: ");
                    String marca = console.next();
                    System.out.print("Digite o ano do veiculo: ");
                    int anoVeiculo = console.nextInt();

                    carros d = new carros();
                    d.setModelo(modelo);
                    d.setMarca(marca);
                    d.setAno(anoVeiculo);

                    b.inserirPrimeiro(d);

                    break;
                case "2":
                    System.out.print("Digite o Modelo do veiculo: ");
                    String Modelo = console.next();
                    System.out.print("Digite a Marca do veiculo: ");
                    String Marca = console.next();
                    System.out.print("Digite o ano do veiculo: ");
                    int AnoVeiculo = console.nextInt();
                    carros e = new carros();
                    e.setModelo(Modelo);
                    e.setMarca(Marca);
                    e.setAno(AnoVeiculo);
                    b.inserirUltimo(e);
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
