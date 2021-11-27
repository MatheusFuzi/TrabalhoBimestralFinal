# TrabalhoBimestralFinal

1. O que é e para que serve o throw no Java? 
 - O Throw em java serve para estourar exceptions. Quando se deseja tratar uma determinada atividade ou rotina para que, ao estourar algum erro no sistema, ao invés dele parar completamente, somente paralisar, avisar o usuário e retornar de onde paralisou em java utilizamos o throw como instrução para tal ação.
2. Em que situações deve-se usar o finally?
 - O Finally, resumidamente, é utilizado junto com o Try & Catch, nos tratamentos de exceções. Finally, serve para que, após as verificações do try, o sistema o execute independentemente se ele chegou entrar no catch ou não, portanto, é a instrução final e será executada independentemente das circunstâncias.
3. Quando devemos usar o throws? Qual a sua finalidade? 
  - A instrução Throws serve para autorizar uma classe ou método a estourar exceções de determinado tipo. Ou seja, ele quem autoriza uma classe ou método chamar o throw, explicado na primeira pergunta.
4. Considere uma classe Calculator. Esta classe deve ser abstrata e implementar as operações básicas (sum, subtraction, division e multiplication). Utilizando o conceito de herança crie uma Calculadora Científica que implemente os seguintes cálculos: raiz quadrada e a potência. use a classe Math do pacote java.lang. 

 [Resposta](trab4bim/Calculator/src/main/java/br/com/unipar/calculator/)
 
5. 5) Considere uma classe chamada BankingAccount, e duas classes filhas desta, CheckingAccount e SavingsAccount. 
BankingAccount -> Conta 
CheckingAccount -> ContaCorrente 
SavingsAccount -> ContaPoupanca 
Na classe BankingAccount existem os seguintes métodos: 
- extractByPeriod(Date initialDate, Date finalDate), que pode lançar uma Exception (Caso uma das datas sejam nulas). 

- getBankBalanceByDate(Date date) (saldo da Conta no dia informado, também lança exceção caso a data seja nula.) 

- cashOut(Double value) (Sacar Dinheiro, Deve Lançar exceção caso o valor do saque seja menor do que zero ou maior do que o saldo + limite cheque especial, caso em conta corrente.) 

- cashDeposit(Double value) (Depositar Dinheiro, Deve Lançar Exceção caso o valor do depósito seja menor do que zero.) 
Também existe o método abaixo, que deve ser adicionado em CheckingAccount. - getOverdraftLimit() -> retorna o limite do especial para as contas correntes 
Escreva e represente as classes de acordo com o que foi informado nas descrições acima. Implemente as funcionalidades propostas. Também escreva exceções personalizadas para cada ação. 
 -[Resposta parcial](trab4bim/Banking/src/main/java/br/com/unipar/banking/)
6. 6) Crie uma classe chamada Pessoa. 
Uma pessoa possui um nome e uma idade. 
• Crie 2 construtores: 1 que recebe o nome e a idade como parâmetros de entrada e um que não recebe parâmetros e inicializa os atributos com um valor padrão (“indefinido” para Strings e 0 para inteiros).

• Crie os métodos de acesso para os atributos (GET e SET). 
7) Crie uma classe Amigo, que herda Pessoa, e possui uma data de aniversário. 
• Crie um construtor que não recebe parâmetros de entrada, e inicializa o atributo com um valor padrão (“indefinido”, por exemplo). 

• Crie os métodos de acesso para o atributo data de nascimento. 
8) Crie uma classe Conhecido, que herda Pessoa, e possui um e-mail. 
• Crie um construtor que não recebe parâmetros de entrada, e inicializa o e-mail com um valor padrão (“indefinido”, por exemplo). 

• Crie os métodos de acesso para este atributo. 
9) Crie agora, uma classe Agenda, que possui pessoas (em um array) e dois atributos que controlam: a quantidade de amigos e a quantidade de conhecidos. 
• Crie um construtor que recebe por parâmetro a quantidade de pessoas que a agenda terá, e inicializa o array de Pessoa. 
Neste construtor, inicialize todas as posições do array criando ALEATORIAMENTE um Conhecido ou um Amigo 
(utilize o comando: 1 + (int) (Math.random() * 2) para sortear valores entre 1 e 2. Se o valor encontrado for 1, crie um Amigo. Se o valor encontrado for 2, crie um Conhecido). 
• Crie os métodos GET para todos os atributos da classe Agenda. 
• Crie um método chamado addInformacoes, que não recebe parâmetros de entrada. Para cada Pessoa na agenda, peça para o usuário digitar (via teclado) as informações cabíveis para cada tipo de Pessoa, e acesse os métodos SET para atribuir as informações. 
• Crie um método chamado imprimeAniversarios(), que imprime os aniversários de todos os amigos que estão armazenados na agenda. 
• Crie um método chamado imprimeEmail(), que imprime os e-mails de todos os conhecidos que estão armazenados na agenda. 
10) Crie uma classe de teste para a Agenda. 
• Peça para o usuário informar (via teclado) quantas pessoas ele deseja colocar na agenda, e crie uma Agenda com esta informação. 

• Imprima na tela a quantidade de amigos e de conhecidos na agenda. 
• Adicione informações à agenda.
• Imprima todos os aniversários dos amigos presentes na agenda. 
• Imprima todos os e-mails dos conhecidos armazenados na agenda.

 [Resposta parcial](trab4bim/Person/src/main/java/br/com/unipar/person/)
 
 11. 11) Crie uma classe abstrata Conta Bancaria que contém como atributos o numero da conta e o saldo, e como métodos abstratos sacar e depositar que recebem um parâmetro do tipo double 
12) Crie as classes Conta Corrente e Conta Poupança que herdam da Conta Bancaria. A primeira possui um atributo taxaDeOperação que é descontado sempre que um saque e um depósito são feitos. A segunda possui um atributo limite que dá crédito a mais para o correntista caso ele precise sacar mais que o saldo. Neste caso, o saldo pode ficar negativo desde que não ultrapasse o limite. Contudo isso não pode acontecer na classe Conta Poupanca. 
13) Crie uma interface Imprimível que declara um método mostrarDados. 
14) Faça as classes Conta Corrente e Conta Poupança implementarem a interface e na implementação do método mostre os atributos de cada conta. 
15) Crie uma classe Relatório que possui um método gerarRelatório que receba um objeto imprimível e executa o método mostrarDados do objeto. 
16) Crie uma classe executável na qual você instância duas contas (uma de cada tipo),credita algum valor para elas e efetua um saque (obs: no objeto conta poupança, faça um saque maior que o saldo atual). Crie um objeto relatório e execute o método gerar relatório para cada conta criada. 
17) Incremente a classe Conta Bancaria com o método transferir que recebe o parâmetro o valor (double) e um objeto conta bancária e transfere o valor desejado da conta atual para cada conta informada. Use os métodos sacar e depositar para isso. 
18) Crie uma classe Banco que possui um arraylist de contas bancárias e implemente os métodos inserir, remover e procurarConta. O primeiro e o segundo recebem um objeto conta (que pode ser corrente ou poupança) e o insere e remove no 
arraylist, respectivamente. O terceiro recebe um inteiro como parâmetro representando o número da conta e retorna um objeto conta bancária, caso essa conta exista no arraylist, ou null, caso contrário. 
19) Faça a classe banco implementar a interface imprimível, onde a implementação de método consiste em executar método mostrar dados de cada conta. 
20) Crie outra classe executável que instancie um banco e ofereça o seguinte menu para o usuário:
1. Criar conta: o usuário informa se é conta poupança ou corrente e os dados da conta. O objeto correspondente é criado e inserido no banco através do método inserir. Exibir uma mensagem de sucesso. 
2. Selecionar conta: o usuário informa o número da conta. Se a conta existir,mostra o menu abaixo. Caso contrário, mostra mensagem de conta inexistente. 
3. Remover conta: o usuário informa o número da conta. Se a conta existe, então ela é excluída e uma mensagem de sucesso é informada. Caso contrário, uma mensagem de conta inexistente é informada. 
4. Gerar relatório: Mostra os dados de todas as contas cadastradas no banco. 
5. Finalizar: terminar a aplicação. 
Se o usuário escolher a opção 2 mostre o seguinte menu: 
a) Depositar: recebe um valor e deposita na conta. 
b) Sacar: recebe um valor e tenta sacar da conta. 
c) Transferir: recebe um valor e o número de outra conta. Caso a conta exista, transfere o valor de uma conta para a outra. Caso contrário, informar mensagem de conta inexistente. 
d) Gerar relatório: mostra os dados da conta selecionada. 
e) Retornar ao menu anterior: exibe o menu anterior (opções 1 a 5). 
 
 [Resposta Parcial](trab4bim/BankAccount/src/main/java/br/com/unipar/bankaccount/)
