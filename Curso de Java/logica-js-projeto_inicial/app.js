alert("Bem-vindo ao nosso jogo número secreto");
let numeroMaximo = 5000;
let numeroSecreto = parseInt(Math.random() * numeroMaximo + 1);
let chute = 0;
let tentativas = 0;

while (chute != numeroSecreto) {
    tentativas++;
    chute = prompt(`Escolha um número entre 1 e ${numeroMaximo}`);

    if (numeroSecreto == chute) {
        const mensagemComUmaTentativa = (`Você descobriu o número secreto ${numeroSecreto} com ${tentativas} tentativa`);
        const mensagemComMaisDeUmaTentativa = (`Você descobriu o número secreto ${numeroSecreto} com ${tentativas} tentativas`);
        tentativas > 1 ? alert(mensagemComMaisDeUmaTentativa) : alert(mensagemComUmaTentativa);
    } else if (chute > numeroSecreto) {
        alert(`O número secreto é menor que ${chute}`);
    } else if (chute < numeroSecreto) {
        alert(`O número secreto é maior do que ${chute}`);
    }
}

