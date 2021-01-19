let n = gets();
let lis = gets().split(' ');
let increment = 0;

for (let mlt = 0; mlt <= 3; mlt++) {
    
    lis.forEach(li => {
        
        if(li % (mlt + 2) == 0) {
            
            increment++;
            
        }
    
    })
    
    console.log(`${increment} Multiplo(s) de ${mlt + 2}`)
    increment = 0;

}