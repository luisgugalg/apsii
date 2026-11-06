# Pizzaria Objetolândia — Fábrica Abstrata

Atividade em Java baseada nas páginas impressas 129 a 134 de *Use a Cabeça! Padrões de Projetos*, de Eric Freeman e Elisabeth Freeman. No PDF da atividade, essas páginas correspondem às posições 124 a 129.

## Como executar

Com o JDK 8 ou superior instalado, abra o terminal na pasta extraída que contém este README e execute os comandos abaixo.

```sh
mkdir build
javac -encoding UTF-8 -d build -sourcepath src src/pizzaria/PizzaTestDrive.java
java -cp build pizzaria.PizzaTestDrive
```

`PizzaTestDrive` faz pedidos de queijo, vegetariana, mariscos e calabresa em Nova York e Chicago. O programa imprime as etapas do pedido e os ingredientes de cada pizza.

| Pizza de mariscos | Ingredientes |
| --- | --- |
| Nova York | Massa fina, molho marinara, queijo parmesão e mariscos frescos |
| Chicago | Massa grossa, molho de tomate, queijo muçarela e mariscos congelados |

## Como o código aplica os padrões

- **Método Fábrica**. `PizzaStore.orderPizza()` coordena o pedido. Cada loja implementa `createPizza()` para escolher a classe da pizza e passar sua fábrica regional ao construtor.
- **Fábrica Abstrata**. `PizzaIngredientFactory` define os métodos de criação de massa, molho, queijo, vegetais, calabresa e mariscos. `NYPizzaIngredientFactory` e `ChicagoPizzaIngredientFactory` fornecem as versões regionais desses ingredientes.

As duas lojas reutilizam `CheesePizza`, `VeggiePizza`, `ClamPizza` e `PepperoniPizza`. Cada classe pede à fábrica os ingredientes de sua receita. Por exemplo, `ClamPizza` chama `createClam()` nas duas regiões e recebe mariscos frescos ou congelados conforme a fábrica que a loja forneceu.

## Referências

- *Use a Cabeça! Padrões de Projetos*, capítulo sobre Factory. As pp. 129–134 orientam a atividade, as pp. 114–115 mostram o fluxo de `PizzaStore` e a p. 147 traz a solução do exercício da fábrica de Chicago.
- As receitas das pizzas vegetariana e de calabresa seguem os exemplos do repositório que acompanha o livro. [VeggiePizza](https://raw.githubusercontent.com/bethrobson/Head-First-Design-Patterns/master/src/headfirst/designpatterns/factory/pizzaaf/VeggiePizza.java) · [PepperoniPizza](https://raw.githubusercontent.com/bethrobson/Head-First-Design-Patterns/master/src/headfirst/designpatterns/factory/pizzaaf/PepperoniPizza.java)
