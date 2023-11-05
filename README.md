# Simulação virtual
Esse codigo é uma simulação de bichinho virtual. No qual se cria um bichinho virtual com algumas características e que possui um estado inicial. Depois que “nascer”, ele poderá executar quatro ações: comer, dormir, correr e morrer. O jogo só termina quando o bichinho morrer, encerrando o programa.

 Seja um conjunto de animais que possui as características comuns: nome, classe, família, idade, estado (vivo = true e morto = false), caloria (0 a 100) e força (0 a 100). Estes animais podem fazer as seguintes ações:

* nascer: pergunta os dados do animal (nome, classe e família). O animal recebe 10 de força e caloria, 0 na idade e true como estado;

* morrer: coloca 0 na força e false como estado;

* comer: caso o animal não esteja cheio e/ou morto, insere 10 no estado caloria e retira 2 de força;

* correr: caso o animal não esteja morto ou exausto (caloria = 0), retira 5 do estado força e 5 do estado caloria;

* dormir: caso o animal não esteja morto, insere 10 no estado força e retira 2 do estado caloria.
