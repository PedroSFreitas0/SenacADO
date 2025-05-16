/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ecarm
 */
public class Main {


    public static void main(String[] args) {
    /*  mostrar numero de 1 a 10 usando while  
        int soma = 1;  
    for (int num = 1; num <= 10; num++) {
    System.out.println(num);
    }
    */
    /* mostre os numeros pares entre 2 a 20 
    int i = 2;
    while (i<=20){
        System.out.println(i);
        i = i+2;
    }*/
    
    /*
    Escreva um programa que exibe a tabuada de um número informado pelo
usuário utilizando do-while
    
    Scanner read = new Scanner(System.in);
        System.out.print("Digite um numero para ver a tabuada: ");
        int numero = read.nextInt();
        int tabuada = 1;
        int res;  //<- variavel para guardar o resultado e colocar na tela 

        do {
            res = numero * tabuada; //<- multiplicação de duas variaveis e guandando na variavel res
            System.out.println(numero + " x " + tabuada + " = " + res);
            tabuada++;
        } while (tabuada <= 10);
        
        */
    
    
    
    /*
    
    Scanner read = new Scanner(System.in);
        System.out.print("Digite um numero para ver se ele eh primo: ");
        int numero = read.nextInt();
        int i = 2;
    
     // ou o numero é primo ou n, certo?? ent vamos usar o boolean para fazer essa diferença 
        boolean primo=true;
    
        // se o numero for menor ou igual a 1 ele n pode ser numero primo, ent já descartamos a possibilidadade     
        if(numero <=1){
            primo=false;
        }else {
    
        //Enquanto i for menor ou igual à metade do número...
    //(Porque nenhum número é divisível por algo maior que a sua metade, exceto ele mesmo.)
    
            while (i<= numero/2){
                if(numero % i == 0){
                    primo=false;
    
    //se n existir esse break ele vai fazer até mó cota e n precisamos disso, precisamos de 1 só
    
                 break;

                }   //o i vai somar até achar um numero que divide a variavel numero, sendo esse numero menor que a metade da variavel numero 
            i++;
            }
            if(primo){  //como a var primo é boolean, se for vdd mostra que é um numero primo 
                System.out.println("Seu numero eh primo: "+ numero );
            }else{      //se n for verdade ele mostra esta mensagem 
                System.out.println("seu numero nao eh primo:" + numero);
            }
                
        }*/
    
    
    
    /*
            Scanner read = new Scanner(System.in);    
        System.out.println("Escreva o numero que quer fatorar: ");
        int numero = read.nextInt();

        int resultado = 1;
        
    //o numero serve para ser o que diminui na fatorial ex:
    //  var numero = 5; ent sempre que o while correr ele vai diminuir 1 
    //quando chegar no 0 ele para e passa o resultado final para o print     

        while (numero > 1) {
            //resultado vale 1, ent resultado recebe 1 * numero; 
            //a partir dessa multiplicação o numero diminui e o 1 vira o resultado da multiplicação anterior
            
            resultado = resultado * numero; //ou resultado*= numero 
            numero--;
        }

        System.out.println("Seu valor fatorado é: " + resultado);
        read.close();
        */
    
    /*
    //esse random é uma extenção similar ao scanner, só n precisa do (System.in)
            Scanner read = new Scanner(System.in);
            Random random = new Random();

        int numeroSecreto = random.nextInt(101) ; // Gera número entre 1 e 100
        int tentativa;

        System.out.println("Tente adivinhar o número entre 1 e 100!");
        
        //começo da parte mais logica!!
        
        do {
            System.out.print("Digite sua tentativa: ");
            tentativa = read.nextInt();
                
            //se o valor inserido na var tentativa for menor que o aleatório criado pela maquina cai no while 
            if (tentativa < numeroSecreto) {
                System.out.println("Muito baixo! Tente novamente.");
            } else 
             //se o valor inserido na var tentativa for maior que o aleatório criado pela maquina cai no while 
                if (tentativa > numeroSecreto) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                //ultimo else serve para confirmar ent se n for nenhuma dos dois ultimos casos cai aq no correto     
                System.out.println("Parabéns! Você acertou o número.");
            }
         //este while ta junto com o "do" ent sempre que o numero for um diferente do outro ele vai mandar fazer dnv 
    
        } while (tentativa != numeroSecreto);

        read.close();*/
    
        Scanner read = new Scanner(System.in);
        int numero, soma = 0, maior=0, menor=0;
        //boolean vai servir para o maior e o menor receber o primeiro valor 
        boolean parar = true;
        //while true == vai acontecer independente de qualquer coisa
        while(true){
        System.out.println("digite novamente ate digitar -1: ");
        numero = read.nextInt();
            //se numero for == -1 para o break precisa estar lá se n fica infinito 
        if (numero == -1){
            break;
        }
            soma+=numero;
            //se parar for true ele faz o if, no fim deste if trocamos o parar para false para ir a proxima parte 
            if(parar){
                //como o primeiro numero é o maior e o menor colocamos ele nos dois 
                menor = numero;
                maior = numero;
                parar=false;
            }else {//a partir deste else fica mais tranquilo, vamos fazer a parte de comparação 
                if(menor>numero){ //se menor for maior que o numero novo, o numero toma o lugar do menor antigo 
                    menor =numero;
                }
                if(maior<numero){//se maior for menor que o numero novo, o numero toma o lugar do maior antigo 
                    maior =numero;
                }       
            }
        }/////////Esta fora do while já 
           if(parar){//se o parar continuar true ele vai dar esta resposta final 
                     //lembrando que o parar só vai estar true o primeiro numero for -1
               System.out.println("nenhum numero foi digitado");
           } else { //aq é se ele percorrer todo o codigo que fizemos 
               System.out.println("O maior numero foi o: "+maior );
               System.out.println("O menor numero foi o: "+menor);
               System.out.println("A soma dos numeros foi: "+ soma);
           }
        
    }
}