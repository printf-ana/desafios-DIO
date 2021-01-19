let qnt = parseInt(gets())
let entrada = gets()
let trimada = entrada.replace(/\s/g,',').trim().split(',');

var min = trimada[0]
var posicao = 0

for (let i = 1; i < qnt; i++) {

    if (parseFloat(min) > parseFloat(trimada[i])) {
    
        min = trimada[i]
        posicao = i
  
    }

}

console.log("Menor valor:", min)
console.log("Posicao:", posicao)