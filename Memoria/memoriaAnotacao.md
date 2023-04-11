# Memória em java
|Nome| 
|---|
|[Heap](#heap) |
|[Área dos métodos](#área-dos-métodos) | 
|[Pilhas da JVM](#pilhas-da-jvm)|
|[Pilha de métodos nativa](#pilha-de-métodos-nativa)|
|[Registro de contador de programa](#registro-de-contador-de-programa)|

## Heap
- O heap é uma mémoria comportilhada no tempo de excução e que guarda o objeto na memoria. É instancializada durante a inicialização da máquina virtual
- Essa memória é alocada para todas asinstancias de classes e vetores
- Pode ser fixa ou dinâmica, dependendo das configurações do sistema
- A JVM provem ao usuário o controle para inicializar ou variar o tamnho do heap por requirimento. Quando uma nova palavra é usada, é dado ao objeto um espaço no heap, mas a referência do mesmo existe nas pilhas
- Existe apenas um e único heap por processo de uma JVM em funcionamento

## Área dos métodos
- É a parte lógica da área do heap sendo criada na inicialização da maquina virtual
- Essa memória é alocada para estrutura de classes, dado de métodos e dados de campos do construtor. Pode ser também, fixa ou dinâmica dependendo da configuração do sistema
- Pode ser de tamanho fixo ou expandida se requisitado pela computação

## Pilhas da JVM
- Uma pilha criada ao mesmo tempo que uma thread é criada, usada para guardar dados e resultados parciais os quais serão nescessários enquanto retornar valor para um método e para performar ligação dinâmica
- Pode ser de tamanho fixo ou dinâmico. O tamnho da pilha pode ser esxolhido de forma independente quando criada
- A memmória não precisa ser contíguo

## Pilha de métodos nativa
- Chamado de pilha C, método nativo de pilha que não é escrita em Java. Essa memória é alocada para cada thread criada. Seu tamanho pode ser fixa ou dinâmica

## Registro de contador de programa
- Cada thread da JVM que carrega a tarefa de um método especifico tem um contador de programada (PC) associado a ele. O método não nativo tem um PC que guarda o endereço da instrução JVM disponível onde num método nativo o valor do PC seja indifinido. Esse registro é capaz de guardar o endereço de retorno ou o ponteiro especifíco em plataformas especificas
