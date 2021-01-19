let wineNumber = gets();
let wineTesters = gets().split(' ');
let correctAnswers = 0;

let correctAnswersList = wineTesters.filter(correctAnswers => correctAnswers.includes(wineNumber));
correctAnswers = correctAnswersList.length;

console.log(correctAnswers);