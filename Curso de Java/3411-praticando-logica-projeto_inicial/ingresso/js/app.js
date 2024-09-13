function comprar() {
        let escolha = document.getElementById('tipo-ingresso').value;
        let quantidade = parseInt(document.getElementById('qtd').value);

    if (escolha == 'pista') {
       comprarPista(quantidade);
    } else if (escolha == 'superior'){
        comprarPistaSuperior(quantidade);
    } else if (escolha == 'inferior'){
       comprarPistaInferior(quantidade);
    } 
}
  
function comprarPista(quantidade) {
    let pista = parseInt(document.getElementById('qtd-pista').textContent);
    if (quantidade > pista || quantidade < 0){
        alert('Não temos essa quantidade de ingressos disponíveis');
        document.getElementById('qtd').value = 0;
       
    } else {
        document.getElementById('qtd-pista').textContent = pista - quantidade;
        alert('Compra efetuada com sucesso!')
        document.getElementById('qtd').value = 0;
    }
}

function comprarPistaSuperior(quantidade) {
    let cadeiraSuperior = parseInt(document.getElementById('qtd-superior').textContent);
    if (quantidade > cadeiraSuperior || quantidade < 0){
        alert('Não temos essa quantidade de ingressos disponíveis');
        document.getElementById('qtd').value = 0;
    } else {
        document.getElementById('qtd-superior').textContent = cadeiraSuperior - quantidade;
        alert('Compra efetuada com sucesso!');
        document.getElementById('qtd').value = 0;
    }
}

function comprarPistaInferior(quantidade) {
    let cadeiraInferior = parseInt(document.getElementById('qtd-inferior').textContent);
    if (quantidade > cadeiraInferior || quantidade < 0){
        alert('Não temos essa quantidade de ingressos disponíveis');
        document.getElementById('qtd').value = 0;
        
    } else {
        document.getElementById('qtd-inferior').textContent = cadeiraInferior - quantidade;
        alert('Compra efetuada com sucesso!');
        document.getElementById('qtd').value = 0;
    }
}
                