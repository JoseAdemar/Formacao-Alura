function tocaSomPom() {
    const listaDeSom = document.querySelectorAll('.som');
    for (let i = 0; i< listaDeSom.length; i++){
        listaDeSom[i].play();
    }
}

document.querySelector('.tecla_pom').onclick = tocaSomPom;

const listaDeTeclas = document.querySelectorAll('tecla');

for (let i = 0; i< listaDeTeclas.length; i++){
    listaDeTeclas[i].onclick = tocaSomPom[0];
}

