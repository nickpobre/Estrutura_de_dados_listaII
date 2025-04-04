// Conceitos Básicos:
// 1. Escreva um programa que imprima "Olá, Mundo!" na tela.
// 2. Crie um programa que calcule a soma de dois números inteiros e exiba o resultado.
// 3. Implemente um programa que determine se um número é par ou ímpar.
// 4. Faça um programa que leia o raio de um círculo e calcule sua área.
// 5. Crie um programa que solicite o nome do usuário e o cumprimente.
// Estruturas de Controle:
// 6. Escreva um programa que imprima os números de 1 a 10 usando um loop for.
// 7. Implemente um programa que calcule a média de uma lista de números.
// 8. Crie um programa que exiba os números primos de 1 a 100.
// 9. Faça um programa que conte a quantidade de vogais em uma string.
// 10. Escreva um programa que imprima a sequência de Fibonacci com N termos, onde N é fornecido pelo usuário.
// Arrays e Listas:
// 11. Crie um programa que encontre o valor máximo em um array de inteiros.
// 12. Implemente um programa que verifique se um array está ordenado de forma crescente.
// 13. Escreva um programa que calcule a média dos valores em uma lista.
// 14. Escreva um programa que receba um array de números inteiros e imprima os elementos sem repetição.
// 15. Crie um programa que inverta a ordem dos elementos em um array.
// Orientação a Objetos:
// 16. Implemente uma classe "Pessoa" com atributos como nome, idade e método para exibir os dados.
// 17. Crie uma classe "Círculo" com métodos para calcular área e circunferência.
// 18. Escreva uma classe "Conta Bancária" com métodos para depositar, sacar e verificar saldo.
// 19. Faça uma classe "Livro" com atributos como título, autor e método para exibir informações.
// 20. Implemente uma classe "Carro" com atributos para marca, modelo e métodos para acelerar e frear.
// Pilhas
// 21. Escreva um programa que utilize uma pilha para inverter os caracteres de uma string. A ideia é empilhar os
// caracteres da string original e, em seguida, desempilhá-los para formar a string invertida.
// 22. Crie um simulador simples de histórico de navegação de um navegador web. Use uma pilha para armazenar as
// URLs visitadas, implementando a funcionalidade de avançar e voltar nas páginas visitadas.
// 23. Escreva uma função que transforma uma expressão da forma in-fixa para a forma pós-fixa
// 24. Desenvolva um programa que simule um sistema de reserva de assentos em um teatro. Use uma pilha para
// controlar os assentos disponíveis.
// 25. Crie um aplicativo de lista de tarefas onde os usuários podem adicionar, remover e marcar tarefas como
// concluídas. Use uma pilha para implementar a lista.
// Fila
// 26. Crie um programa que simule uma fila de impressão. Os usuários podem adicionar documentos para impressão,
// que são processados um por um na ordem em que foram adicionados.
// 27. Elabore um programa que simule uma fila de atendimento em um banco ou em um serviço de suporte. Os
// clientes podem entrar na fila e são atendidos em ordem.
// 28. Crie um sistema que gerencie a fila de espera de um restaurante. Os clientes entram na fila para conseguir uma
// mesa e são chamados quando uma mesa fica disponível.
// 29. Elabore um sistema de suporte técnico onde as chamadas dos clientes são enfileiradas. Implemente prioridades
// para algumas chamadas e processe-as de acordo.
// 30. Desenvolva um sistema de gerenciamento de fila em um parque de diversões com diferentes tipos de ingressos
// (ex: VIP, padrão). Implemente diferentes filas para diferentes prioridades.

import java.util.Scanner;

public class lista_java {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================Menu===========================");
        System.out.println("Escolha uma opção:");
        System.out.println("1. Conceitos Básicos");
        System.out.println("2. Estruturas de Controle");
        System.out.println("3. Arrays e Listas");
        System.out.println("4. Orientação a Objetos");
        System.out.println("5. Pilhas");
        System.out.println("6. Fila");
        System.out.println("0. Sair");
        System.out.println("=========================================================");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        switch (opcao) {
            case 1:
                // Olá, Mundo!
                System.out.println("Olá, Mundo!");
                
                // Soma de dois números inteiros
                System.out.print("Digite o primeiro número: ");
                int num1 = scanner.nextInt();
                System.out.print("Digite o segundo número: ");
                int num2 = scanner.nextInt();
                int soma = num1 + num2;
                System.out.println("A soma é: " + soma);

                // Par ou ímpar
                System.out.print("Digite um número: ");
                int numero = scanner.nextInt();
                if (numero % 2 == 0) {
                    System.out.println("O número " + numero + " é par.");
                } else {
                    System.out.println("O número " + numero + " é ímpar.");
                }

                // Área do círculo
                System.out.print("Digite o raio do círculo: ");
                double raio = scanner.nextDouble();
                double area = Math.PI * Math.pow(raio, 2);
                System.out.println("A área do círculo é: " + area);

                // Cumprimento
                scanner.nextLine();
                System.out.print("Digite seu nome: ");
                String nome = scanner.nextLine();
                System.out.println("Olá, " + nome + "!");
                break;
            case 2:
                // Números de 1 a 10 usando loop for
                System.out.println("Números de 1 a 10:");
                for (int i = 1; i <= 10; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();

                // Média de uma lista de números
                System.out.print("Digite a quantidade de números para calcular a média: ");
                int quantidade = scanner.nextInt();
                int somaNumeros = 0;
                for (int i = 0; i < quantidade; i++) {
                    System.out.print("Digite o número " + (i + 1) + ": ");
                    somaNumeros += scanner.nextInt();
                }
                double media = (double) somaNumeros / quantidade;
                System.out.println("A média é: " + media);

                // Números primos de 1 a 100
                System.out.println("Números primos de 1 a 100:");
                for (int i = 2; i <= 100; i++) {
                    boolean primo = true;
                    for (int j = 2; j <= Math.sqrt(i); j++) {
                        if (i % j == 0) {
                            primo = false;
                            break;
                        }
                    }
                    if (primo) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();

                // Contar vogais em uma string
                scanner.nextLine();
                System.out.print("Digite uma string: ");
                String str = scanner.nextLine();
                int contadorVogais = 0;
                for (char c : str.toCharArray()) {
                    if ("aeiouAEIOU".indexOf(c) != -1) {
                        contadorVogais++;
                    }
                }
                System.out.println("A quantidade de vogais na string é: " + contadorVogais);

                // Sequência de Fibonacci
                System.out.print("Digite o número de termos da sequência de Fibonacci: ");
                int n = scanner.nextInt();
                int a = 0, b = 1;
                System.out.println("Sequência de Fibonacci:");
                for (int i = 0; i < n; i++) {
                    System.out.print(a + " ");
                    int proximo = a + b;
                    a = b;
                    b = proximo;
                }
                System.out.println();
                break;
            case 3:
                // Valor máximo em um array de inteiros
                System.out.print("Digite o tamanho do array: ");
                int tamanho = scanner.nextInt();
                int[] numeros = new int[tamanho];
                for (int i = 0; i < tamanho; i++) {
                    System.out.print("Digite o número " + (i + 1) + ": ");
                    numeros[i] = scanner.nextInt();
                }
                int maximo = numeros[0];
                for (int i = 1; i < tamanho; i++) {
                    if (numeros[i] > maximo) {
                        maximo = numeros[i];
                    }
                }
                System.out.println("O valor máximo é: " + maximo);

                // Verificar se um array está ordenado
                boolean ordenado = true;
                for (int i = 1; i < tamanho; i++) {
                    if (numeros[i] < numeros[i - 1]) {
                        ordenado = false;
                        break;
                    }
                }
                if (ordenado) {
                    System.out.println("O array está ordenado.");
                } else {
                    System.out.println("O array não está ordenado.");
                }

                // Calcular a média dos valores em uma lista
                double somaLista = 0;
                for (int num : numeros) {
                    somaLista += num;
                }
                double mediaLista = somaLista / tamanho;
                System.out.println("A média da lista é: " + mediaLista);

                // Elementos sem repetição
                System.out.print("Elementos sem repetição: ");
                for (int i = 0; i < tamanho; i++) {
                    boolean repetido = false;
                    for (int j = 0; j < i; j++) {
                        if (numeros[i] == numeros[j]) {
                            repetido = true;
                            break;
                        }
                    }
                    if (!repetido) {
                        System.out.print(numeros[i] + " ");
                    }
                }
                System.out.println();

                // Inverter a ordem dos elementos em um array
                System.out.print("Array invertido: ");
                for (int i = tamanho - 1; i >= 0; i--) {
                    System.out.print(numeros[i] + " ");
                }
                System.out.println();
                break;
            case 4:
                // Classe Pessoa
                class Pessoa {
                    String nome;
                    int idade;

                    void exibirDados() {
                        System.out.println("Nome: " + nome + ", Idade: " + idade);
                    }
                }

                Pessoa pessoa = new Pessoa();
                System.out.print("Digite o nome da pessoa: ");
                pessoa.nome = scanner.nextLine();
                System.out.print("Digite a idade da pessoa: ");
                pessoa.idade = scanner.nextInt();
                pessoa.exibirDados();

                // Classe Círculo
                class Circulo {
                    double raio;

                    double calcularArea() {
                        return Math.PI * Math.pow(raio, 2);
                    }

                    double calcularCircunferencia() {
                        return 2 * Math.PI * raio;
                    }
                }

                Circulo circulo = new Circulo();
                System.out.print("Digite o raio do círculo: ");
                circulo.raio = scanner.nextDouble();
                System.out.println("Área do círculo: " + circulo.calcularArea());
                System.out.println("Circunferência do círculo: " + circulo.calcularCircunferencia());

                // Classe Conta Bancária
                class ContaBancaria {
                    double saldo;

                    void depositar(double valor) {
                        saldo += valor;
                    }

                    void sacar(double valor) {
                        if (valor <= saldo) {
                            saldo -= valor;
                        } else {
                            System.out.println("Saldo insuficiente.");
                        }
                    }

                    void verificarSaldo() {
                        System.out.println("Saldo atual: " + saldo);
                    }
                }

                ContaBancaria conta = new ContaBancaria();
                conta.depositar(1000);
                conta.sacar(500);
                conta.verificarSaldo();

                // Classe Livro
                class Livro {
                    String titulo;
                    String autor;

                    void exibirInformacoes() {
                        System.out.println("Título: " + titulo + ", Autor: " + autor);
                    }
                }

                Livro livro = new Livro();
                System.out.print("Digite o título do livro: ");
                livro.titulo = scanner.nextLine();
                System.out.print("Digite o autor do livro: ");
                livro.autor = scanner.nextLine();
                livro.exibirInformacoes();

                // Classe Carro
                class Carro {
                    String marca;
                    String modelo;

                    void acelerar() {
                        System.out.println(marca + " " + modelo + "acelerando.");
                    }

                    void frear() {
                        System.out.println(marca + " " + modelo + " freando.");
                    }
                }

                Carro carro = new Carro();
                System.out.print("Digite a marca do carro: ");
                carro.marca = scanner.nextLine();
                System.out.print("Digite o modelo do carro: ");
                carro.modelo = scanner.nextLine();
                carro.acelerar();
                carro.frear();
                break;
            case 5:
                // 21. Escreva um programa que utilize uma pilha para inverter os caracteres de uma string. A ideia é empilhar os
                // caracteres da string original e, em seguida, desempilhá-los para formar a string invertida.
                
                // 22. Crie um simulador simples de histórico de navegação de um navegador web. Use uma pilha para armazenar as
                // URLs visitadas, implementando a funcionalidade de avançar e voltar nas páginas visitadas.
                
                
            case 0:
                System.out.println("Saindo do programa...");
                break;
            default:
                break;
        }
        scanner.close();
    }
}