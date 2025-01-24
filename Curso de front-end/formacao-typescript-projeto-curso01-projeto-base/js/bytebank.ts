let saldo = 3500;

const elementSaldo = document.querySelector('.saldo-valor .valor');
 if (elementSaldo) {
    elementSaldo.textContent = saldo.toString();
 }

const elementoFormulario = document.querySelector('.block-nova-transacao form') as HTMLFormElement;
elementoFormulario.addEventListener("submit", function (event) {
    event.preventDefault(); //Evita da página ser recarregada após submeter o formulário

    if (!elementoFormulario.checkValidity()) {
        alert("Por favor, preencha todos os campos da transação!");
        return;
    }

    const inputTipoTransacao = elementoFormulario.querySelector("#tipoTransacao") as HTMLSelectElement;
    const inputValor = elementoFormulario.querySelector("#valor") as HTMLInputElement;
    const inputData = elementoFormulario.querySelector("#data") as HTMLInputElement;

    let tipoTransacao: string = inputTipoTransacao.value;
    let valor: number = inputValor.valueAsNumber;
    let data : Date = new Date (inputData.value);

    if (tipoTransacao === "Depósito") {
        saldo += valor;
    } else if (tipoTransacao === "Transferência" || tipoTransacao === "Pagamento de Boleto") {
        saldo -= valor;
    } else {
        alert("Tipo de transação é inválido!");
        return;
    }

    if (elementSaldo) {
        elementSaldo.textContent = saldo.toString();
    }

    const novaTransacao = {
        tipoTransacao: tipoTransacao,
        valor: valor,
        data: data
    }

    console.log(novaTransacao);
    elementoFormulario.reset();
});