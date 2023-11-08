# Programa de Gerenciamento de Animais
Este é um programa Java que permite ao usuário criar e gerenciar animais virtuais, dando-lhes nome, classe, família e idade. Os animais virtuais podem realizar ações como comer, correr, dormir e morrer. O programa utiliza a classe Animais para representar os animais virtuais e oferece um menu interativo para o usuário interagir com o animal.

## Visão Geral
O programa consiste em duas classes principais: `App` e `Animais`.

### Classe Animais
A classe Animais é usada para representar os animais virtuais. Cada animal tem os seguintes atributos:

* `nome`: Nome do animal.
* `classe`: Classe do animal (exemplo: gato, cachorro, etc.).
* `familia`: Família do animal.
* `idade`: Idade do animal.
* `estado`: Indica se o animal está vivo (true) ou morto (false).
* `peso`: Peso do animal (varia de 0 a 100).
* `forca`: Força do animal (varia de 0 a 100).

A classe Animais possui dois construtores. O primeiro construtor permite a inicialização de todos os atributos do animal, enquanto o segundo construtor permite a inicialização de alguns atributos com valores padrão.

A classe `Animais` também oferece métodos para acessar os atributos do animal e implementa os seguintes métodos:

* `nasceu()`: Retorna uma descrição do animal, incluindo seu nome, classe, família, força, calorias e idade.
* `morrer()`: Define o estado do animal como morto (false) e zera sua força.
* `comer()`: Aumenta o peso do animal em 10 e diminui sua força em 2.
* `correr()`: Diminui a força e o peso do animal em 5.
* `dormir()`: Aumenta a força do animal em 10 e diminui seu peso em 2.

### Classe App

A classe `App` contém o método `main` que é o ponto de entrada do programa. Ela permite que o usuário crie um novo animal virtual, defina suas características iniciais e interaja com o animal por meio de um menu interativo. O menu oferece as seguintes opções:

1. Comer
2. Correr
3. Dormir
4. Morrer
O programa valida a entrada do usuário e executa a ação escolhida no animal virtual. O usuário pode interagir com o animal até que escolha a opção "Morrer", momento em que o programa exibe "GAME OVER!".

## Utilização
Para executar o programa, siga estas etapas:

1. Compile o código Java.
2. Execute a classe `App` para iniciar o programa.
3. Siga as instruções no console para criar um novo animal virtual e interagir com ele. 

Certifique-se de fornecer valores válidos ao criar o animal e durante as interações para evitar erros.

## Conclusão

Este programa Java permite ao usuário criar e gerenciar animais virtuais, oferecendo a capacidade de definir suas características e interagir com eles. É um exemplo simples de programação orientada a objetos e interação com o usuário em Java.
