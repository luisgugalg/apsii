# Atividade Pato

Exemplo do padrão Strategy em Java, com comportamentos de voo e de som separados da classe abstrata `Duck`.

O projeto contém os pacotes `apresentação`, `patos`, `quacks` e `voos`, com os dez arquivos da atividade. Usa Java 8 e codificação UTF-8.

No Eclipse, importe esta pasta em **File > Import > General > Existing Projects into Workspace** e execute `apresentação.MiniPatinhoNaLagoa` com **Run As > Java Application**.

O programa cria um `MallardDuck` e demonstra sua apresentação, seu som, seu voo e seu nado. Os métodos `setFlyBehavior` e `setQuackBehavior` permitem substituir os comportamentos durante a execução.
