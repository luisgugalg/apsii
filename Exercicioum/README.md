# Exercicio 1 - Agenda de Aniversarios

Solução da atividade usando Java.

## Classes

- `AgendaDeAniversarios`: interface com os métodos da agenda.
- `MinhaAgendaDeAniversarios`: classe concreta que guarda a lista de aniversariantes.
- `Aniversariante`: representa uma pessoa aniversariante.
- `DataAniversario`: representa o dia e o mês do aniversário.

## Diagrama

```mermaid
classDiagram
    AgendaDeAniversarios <|.. MinhaAgendaDeAniversarios
    MinhaAgendaDeAniversarios "1" --> "0..*" Aniversariante
    Aniversariante "1" --> "1" DataAniversario

    class AgendaDeAniversarios {
        <<interface>>
        +adicionarAniversariante(String nome, int dia, int mes) void
        +obterAniversariantesDoDia(int dia, int mes) ArrayList~String~
        +removerAniversariante(String nomeAniversariante) void
    }

    class MinhaAgendaDeAniversarios

    class Aniversariante {
        -String nome
        -DataAniversario dataAniversario
    }

    class DataAniversario {
        -int dia
        -int mes
    }
```
