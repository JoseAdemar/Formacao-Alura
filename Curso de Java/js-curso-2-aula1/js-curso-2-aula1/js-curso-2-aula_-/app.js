let tentativas = 1;
let listaDeNumerosSorteados = [];
let limiteNumero = 3;

function exibirTextoNaTela(tag, texto) {
    let campo = document.querySelector(tag);
    campo.innerHTML = texto;
}

function exibirMensagemInicial() {
    exibirTextoNaTela('h1', 'Jogo do número secreto');
    exibirTextoNaTela('p', 'Escolha um número entre 1 e 10');
}

exibirMensagemInicial();

function gerarNumeroAleatorio() {
    let numeroEscolhido = parseInt(Math.random() * limiteNumero + 1);
    let quantidadeDeElementosNaLista = listaDeNumerosSorteados.length;

    if (quantidadeDeElementosNaLista == limiteNumero) {
listaDeNumerosSorteados    }

    if (listaDeNumerosSorteados.includes(numeroEscolhido)) {
         return gerarNumeroAleatorio();
    } else {
        listaDeNumerosSorteados.push(numeroEscolhido);
        console.log(listaDeNumerosSorteados);
        return numeroEscolhido;
    }
}

function verificarChute() {
    // let chute = document.querySelector('input').value;
    let chute = document.querySelector('.container__input').value;
    if (numeroSecreto == chute) {
        exibirTextoNaTela('h1', 'Você acertou 🏆');
        let palavraTentativa = tentativas > 1 ? 'tentativas' : 'tentativa';
        exibirTextoNaTela('p', `Você descobriu o número secreto com ${tentativas} ${palavraTentativa}`);
        document.getElementById('reiniciar').removeAttribute('disabled');
    } else {
        if (chute > numeroSecreto) {
            exibirTextoNaTela('p', 'O número é menor');
        } else {
            exibirTextoNaTela('p', 'O número é maior');
        }
        tentativas++;
        limparCampo();
    }
}

let numeroSecreto = gerarNumeroAleatorio();

function limparCampo() {
    chute = document.querySelector('input');
    chute.value = '';
}

function reiniciarJogo() {
    numeroSecreto = gerarNumeroAleatorio();
    limparCampo();
    tentativas = 1;
    exibirMensagemInicial();
    document.getElementById('reiniciar').setAttribute('disabled', true);
}

/*function temChuteRepetido() {
    let chute = document.querySelector('.container__input').value;
    listaDeNumerosSorteados.push(chute);
    let numeroSecretoAleatorio = gerarNumeroAleatorio();
    temChute = false;
    if (listaDeNumerosSorteados.includes(numeroSecretoAleatorio)) {
           while(numeroSecretoAleatorio == chute){
            numeroSecretoAleatorio = gerarNumeroAleatorio();
           }
           numeroSecreto = numeroSecretoAleatorio;
           listaDeNumerosSorteados.push(numeroSecreto);
           limparCampo();
        return temChute = true;
    } else {
        limparCampo();
        numeroSecreto = numeroSecretoAleatorio;
        listaDeNumerosSorteados.push(numeroSecreto);
    }
    console.log(listaDeNumerosSorteados);
    return temChute;
}*/

