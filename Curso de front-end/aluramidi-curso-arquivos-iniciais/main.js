function tocaSom(idElementoAudio) {
    document.querySelector(idElementoAudio).play();
}

const listaDeTeclas = document.querySelectorAll('.tecla');
let contador = 0;

// Forma 01
/*for (let i = 0; i < listaDeTeclas.length; i++){
    const tecla = listaDeTeclas[i];
    const sonDoInstrumento = tecla.classList[1];
    const idAudio = `#som_${sonDoInstrumento}`;
    tecla.onclick = function() {
        tocaSom(idAudio);
    };
}*/

//Forma 02
while(contador < listaDeTeclas.length) {
    const tecla = listaDeTeclas[contador];
    const sonDoInstrumento = tecla.classList[1];
    const idAudio = `#som_${sonDoInstrumento}`;
    tecla.onclick = function() {
        tocaSom(idAudio);
    };

    contador++;
}

