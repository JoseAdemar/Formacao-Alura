function sortear() {
  fazSorteio();
}

function reiniciar() {
  limpaCampos();
  bloquearBotao();
}

function obterNumeroAleatorio(min, max) {
  return Math.floor(Math.random() * (max - min + 1)) + min;
}

function fazSorteio() {
  let quantidade = parseInt(document.querySelector("#quantidade").value);
  let de = parseInt(document.querySelector("#de").value);
  let ate = parseInt(document.querySelector("#ate").value);

  let sorteados = [];
  let numero;

  for (i = 0; i < quantidade; i++) {
    numero = obterNumeroAleatorio(de, ate);
    while (sorteados.includes(numero)) {
      numero = obterNumeroAleatorio(de, ate);
    }
    sorteados.push(numero);
  }

  document.querySelector("#resultado .texto__paragrafo").innerHTML = `Números sorteados: ${sorteados}`;

  desbloquearBotao();
}

function desbloquearBotao() {
   document.querySelector(".container__botao-desabilitado").className = 'container__botao';
}

function limpaCampos() {
    document.querySelector('#quantidade').value = '';
    document.querySelector("#de").value = '';
    document.querySelector("#ate").value = '';
    document.querySelector("#resultado .texto__paragrafo").innerHTML = 'Números sorteados:  nenhum até agora';
}

function bloquearBotao() {
    document.querySelector("#btn-reiniciar").className = 'container__botao-desabilitado';
}