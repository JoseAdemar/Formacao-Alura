function tocaSom(selectorAudio) {
    const elemento = document.querySelector(selectorAudio);
    if (elemento === null) {

    } if (elemento && elemento.localName === 'audio') {
        elemento.play();
    } else {
        alert('Elemento não encontrado ou seletor inválido')
    }
}

const listaDeTeclas = document.querySelectorAll('.tecla');
//let contador = 0;

// Forma 01
for (let i = 0; i < listaDeTeclas.length; i++) {
    const tecla = listaDeTeclas[i];
    const sonDoInstrumento = tecla.classList[1];
    const idAudio = `#som_${sonDoInstrumento}`;
    tecla.onclick = function () {
        tocaSom(idAudio);
    }

    tecla.onkeydown = function (evento) {
        console.log(evento)
        if (evento.code === 'Space' || evento.code === 'Enter') {
            tecla.classList.add('ativa');
        }
    }

    tecla.onkeyup = function () {
        tecla.classList.remove('ativa');
    }
}

//Forma 02
/*
while(contador < listaDeTeclas.length) {
    const tecla = listaDeTeclas[contador];
    const sonDoInstrumento = tecla.classList[1];
    const idAudio = `#som_${sonDoInstrumento}`;
    tecla.onclick = function() {
        tocaSom(idAudio);
    };

    contador++;
}
*/
