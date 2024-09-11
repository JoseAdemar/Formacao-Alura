function alterarStatus(id) {
    let gameClicado = document.getElementById(`game-${id}`);
    let imagem = gameClicado.querySelector('.dashboard__item__img');
    let botao = gameClicado.querySelector('.dashboard__item__button');

    if (botao.className == 'dashboard__item__button') {
        botao.className = 'dashboard__item__button dashboard__item__button--return';
        imagem.className = 'dashboard__item__img dashboard__item__img--rented';
        botao.textContent = 'Devolver';
    } else {
        botao.className = 'dashboard__item__button';
        imagem.className = 'dashboard__item__img';
        botao.textContent = 'Alugar';
    }
}
