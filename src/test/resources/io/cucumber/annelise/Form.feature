# language: pt

Funcionalidade: Acessar o site Tricentis e preencher o formulario

Cenario: Preencho o formulario
Dado que eu estou no site
E preencho a aba "Enter Vehicle Data" e clico em next
E preencho a aba "Enter Insurant Data" e clico em next
E preencho a aba "Enter Product Data" e clico em next
E preencho a aba "Select Price Option" e clico em next
E preencho a aba "Send Quote" e clico em Send
Entao visualizo a mensagem "Sending e-mail success!" na tela