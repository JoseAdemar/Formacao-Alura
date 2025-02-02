var saldo = 3500;
var elementSaldo = document.querySelector('.saldo-valor .valor');
if (elementSaldo) {
    elementSaldo.textContent = saldo.toString();
}
var elementoFormulario = document.querySelector('.block-nova-transacao form');
elementoFormulario.addEventListener("submit", function (event) {
    event.preventDefault(); //Evita da página ser recarregada após submeter o formulário
    if (!elementoFormulario.checkValidity()) {
        alert("Por favor, preencha todos os campos da transação!");
        return;
    }
    var inputTipoTransacao = elementoFormulario.querySelector("#tipoTransacao");
    var inputValor = elementoFormulario.querySelector("#valor");
    var inputData = elementoFormulario.querySelector("#data");
    var tipoTransacao = inputTipoTransacao.value;
    var valor = inputValor.valueAsNumber;
    var data = new Date(inputData.value);
    if (tipoTransacao === "Depósito") {
        saldo += valor;
    }
    else if (tipoTransacao === "Transferência" || tipoTransacao === "Pagamento de Boleto") {
        saldo -= valor;
    }
    else {
        alert("Tipo de transação é inválido!");
        return;
    }
    if (elementSaldo) {
        elementSaldo.textContent = saldo.toString();
    }
    var novaTransacao = {
        tipoTransacao: tipoTransacao,
        valor: valor,
        data: data
    };
    console.log(novaTransacao);
    elementoFormulario.reset();
});
