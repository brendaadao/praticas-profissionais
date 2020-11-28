function pau(){
    var requestURL = 'https://mdn.github.io/learning-area/javascript/oojs/json/superheroes.json';
    var request = new XMLHttpRequest();
    request.open('GET', requestURL);
    request.responseType = 'json';
    request.send();

    request.onload = function() {
    var superHeroes = request.response;
    populateHeader(superHeroes);
    showHeroes(superHeroes);

    log.info(superHeroes);
}
}