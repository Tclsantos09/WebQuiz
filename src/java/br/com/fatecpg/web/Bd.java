/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.web;

import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author thais.lopes
 */
public class Bd {
    public static ArrayList<Questions> getTesteRandomico(){
        ArrayList<Questions> teste = new ArrayList<>();
        teste.add(new Questions("Quando, em uma mesma classe, se definem diversos métodos de mesmo nome, temos:", 
                "sobrecarga", 
                new String[] {"sobrecarga", 
                    "sobreposição",
                    "encapsulamento", 
                    "herança",
                    "composição"}));
        
        teste.add(new Questions("Quando se utiliza o conceito de encapsulamento da programação orientada a objetos, enquanto a"
                + " ______________ define os detalhes internos do componente, a ____________ lista os serviços fornecidos por ele.", 
                "implementação – interface", 
                new String[] {"interface - implementação", 
                    "classe – implementação",
                    "interface – classe", 
                    "implementação – interface",
                    "classe - interface"}));
        
        teste.add(new Questions("Um dos principais aperfeiçoamentos do modelo orientado a objeto do JAVA é o tratamento de todos os "
                + "objetos como referências ao invés de valores. Identifique a alternativa que possui o formato de referenciar atributos "
                + "de objetos em JAVA:", 
                "objeto.atributo", 
                new String[] {"objeto->atributo", 
                    "objeto<-atributo", 
                    "objeto.atributo", 
                    "atributo.objeto",
                    "atributo->objeto"}));
        
        teste.add(new Questions("Qual das declarações abaixo fará com que a classe Senha não possa ser estendida (herdada)?", 
                "final class Senha()", 
                new String[] {"private class Senha()", 
                    "protected class Senha()",
                    "final class Senha()", 
                    "public class Senha()",
                    "abstract class Senha()"}));
        
        teste.add(new Questions("Analise a definição a seguir: 'public class Clock extends Applet implements Runnable'. A palavra extends "
                + "é relativa a que conceito no campo da programação Orientada a Objeto?", 
                "Herança", 
                new String[] {"Polinômio", 
                    "Herança",
                    "Polimorfismo", 
                    "Abstração",
                    "Encapsulamento"}));
        
        teste.add(new Questions("Qual das alternativas abaixo é um exemplo de relação superclasse – subclasse, conforme as definições de "
                + "POO?", 
                "automóvel – motocicleta", 
                new String[] {"torta de maçã – maçã", 
                    "automóvel – motocicleta",
                    "colmeia - abelha", 
                    "alcateia – lobo",
                    "alunos - turma"}));
        
        teste.add(new Questions("Quais são os três pilares da Orientação a Objetos?", 
                "encapsulamento, herança e polimorfismo", 
                new String[] {"classe, atributo e método", 
                    "abstração, sobrecarga, sobreposição",
                    "encapsulamento, herança e polimorfismo", 
                    "classe, encapsulamento, sobrecarga",
                    "método, sobreposição e polimorfismo"}));
        
        teste.add(new Questions("Para a Orientação a Objetos, ____________ é algo que ele tem, ___________ é algo que ele faz e "
                + "____________ é o significado obtido pela combinação de suas variáveis internas.", 
                "atributo, método, estado", 
                new String[] {"método, atributo, estado",
                    "estado, método, atributo", 
                    "estado, atributo, método",
                    "atributo, método, herança",
                    "atributo, método, estado"}));
        
        teste.add(new Questions("Polimorfismo significa muitas formas. Em POO, polimorfismo significa que:", 
                "um único nome pode representar um código diferente selecionado por algum mecanismo automático", 
                new String[] {"precisamos necessariamente de um nome diferente por método para termos um código diferente", 
                    "um único nome pode receber apenas um parâmetro na sua declaração",
                    "podemos escrever o método em diversas linguagens", 
                    "nomes diferentes podem representar um mesmo comportamento",
                    "um único nome pode representar um código diferente selecionado por algum mecanismo automático"}));
        
        teste.add(new Questions("Os autores Booch, Rumbaugh e Jacobson reuniram suas propostas de representação e criaram o(a):", 
                "Linguagem de Modelagem Unificada", 
                new String[] {"Análise Estruturada", 
                    "Projeto Baseado em Objetos",
                    "Linguagem de Modelagem Unificada", 
                    "Programação Orientada a Objetos",
                    "Programação Móvel"}));
        Collections.shuffle(teste);
        return teste;
    }
    
    private static ArrayList<Usuario> users;
     
    public static ArrayList<Usuario> getUsuario(){
        if(users == null){
            users = new ArrayList<>();
            Usuario user = new Usuario("thais", "1234");
            users.add(user);
        }
       return users;
    }
    
}
