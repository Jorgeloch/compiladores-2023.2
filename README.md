# COMPILADORES

Projeto de compiladores utilizando `sableCC` para criação de um compilador para a linguagem `cida`.

## Instruções

### Para rodar o sableCC

- tendo o `sableCC` instalado:
- no diretório contendo o arquivo `<nome>.sable`, executar o seguinte comando

```sh
java -jar [path]/sablecc-3.7/lib/sablecc.jar [nome do arquivo].sable
```

- dessa forma, você irá executar o `sableCC` sobre o arquivo fonte, gerando o projeto em `java` responsável por gerar o compilador
- na sequencia, basta executar o seguinte comando:

```sh
javac -d ../../bin Main.java analysis/*.java lexer/*.java node/*.java && mv lexer/lexer.dat ../../bin/calculadora/lexer
```

- assim, seu compilador estará compilado e basta ir para o diretorio bin e executar o seguinte comando:

```sh
java [nome].Main
```
