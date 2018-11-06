/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.web;

import java.util.ArrayList;
/**
 *
 * @author thais.lopes
 */
public class Bd {
    public static ArrayList<Questions> getTeste(){
        ArrayList<Questions> teste = new ArrayList<>();
        teste.add(new Questions("1º Ao definir uma classe em um programa orientado a objetos, o programador pode especificar um ou "
                + "mais construtores, cuja função é:", "garantir que objetos iniciem em um estado consistente", 
                new String[] {"inicializar os dados da classe", 
                    "retornar valores para os métodos de outras classes",
                    "garantir que objetos iniciem em um estado consistente", 
                    "instanciar atributos da classe"}));
        
        teste.add(new Questions("2º Na programação orientada a objetos, há um mecanismo que permite definir modificadores de acesso. "
                + "Quando se define um atributo de uma classe com o modificador de acesso privado, significa que:", 
                "o atributo é acessível somente aos métodos da classe", 
                new String[] {"o acesso à classe é privado", 
                    "o atributo é acessível a um programa que tenha uma referência a um objeto da classe",
                    "a classe é abstrata", 
                    "o atributo é acessível somente aos métodos da classe"}));
        
        teste.add(new Questions("3º A programação orientada a objetos:", "faz uso de conceitos como classe, interfaces e envio de mensagens.", 
                new String[] {"impossibilita o polimorfismo sem herança (extends em JAVA)", 
                    "impede a construção de software de difícil manutenção", 
                    "faz uso de conceitos como classe, interfaces e envio de mensagens", 
                    "requer que classes sejam estendidas para a reutilização de código"}));
        
        teste.add(new Questions("4º Se você transforma os atributos públicos de uma classe em atributos privados com métodos de acesso "
                + "públicos (get/set), esses métodos de acesso:", "podem ser usados para assegurar as regras de negócio", 
                new String[] {"aumentam o desempenho do programa", 
                    "diminuem o número total de linhas de código do programa",
                    "são mais fáceis de escrever", 
                    "podem ser usados para assegurar as regras de negócio"}));
        
        teste.add(new Questions("5º Em um programa orientado a objetos, verifica-se que a classe X estende a classe Y. Ou seja, pode-se "
                + "afirmar, pelos preceitos da POO, que:", "a classe X é derivada de Y", 
                new String[] {"a classe X é superclasse de Y", 
                    "a classe Y é derivada de X",
                    "a classe Y é subclasse de X", 
                    "a classe X é derivada de Y"}));
        
        teste.add(new Questions("6º Em Orientação a Objetos, para que uma subclasse de uma classe possa ter seu próprio comportamento, e "
                + "mesmo assim compartilhar algumas das funcionalidades da classe pai, deve-se implementar:", "polimorfismo", 
                new String[] {"abstração", 
                    "polimorfismo",
                    "agregação", 
                    "generalização"}));
        
        teste.add(new Questions("7º Assinale a alternativa que apresenta, corretamente, o conceito de programação orientada a objetos que "
                + "promove a reutilização de software.", "Herança", 
                new String[] {"Sobrecarga de operadores", 
                    "Abstração de dados",
                    "Herança", 
                    "Polimorfismo"}));
        
        teste.add(new Questions("8º Na orientação a objetos, a alteração do comportamento dos métodos herdados das superclasses para um "
                + "comportamento mais específico nas subclasses, de forma a se criar um novo método na classe filha que contém a mesma "
                + "assinatura e o mesmo tipo de retorno, relaciona-se a:", "sobrescrita", 
                new String[] {"sobrescrita",
                    "abstração", 
                    "overloading",
                    "portabilidade"}));
        
        teste.add(new Questions("9º Quais são os modos de visibilidades existentes em POO?", "público, protegido, privado", 
                new String[] {"pacote, classe, herança", 
                    "público, protegido, privado",
                    "protegido, pacote, privado", 
                    "abstrata, concreta, público"}));
        
        teste.add(new Questions("10º São linguagens orientadas a objeto:", "Java e PHP", 
                new String[] {"SQL e C++", 
                    "Pascal e Java",
                    "Delphi e Natural", 
                    "Java e PHP"}));
        
        return teste;
    }
    
    
}
