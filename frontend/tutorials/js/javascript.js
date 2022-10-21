// let studentName = "Eda";
// let studentSurname = "Cansu";
// let studentTech = 5;
// let studentTech2 = 4.9878;
// let isTurkish = true;

// console.log(typeof studentName)

// || -> option+eksi

/*  Math floor ödev sonucuuu*/

// let num1 = prompt("Sayı giriniz")
// let num2 = prompt("Sayı giriniz")

// console.log(Math.min(num1, num2))
// console.log(Math.max(num1,num2))
// console.log(Math.sqrt(Math.max(num1,num2)))
// console.log(Math.ceil(Math.sqrt(Math.max(num1,num2))))
// console.log(Math.abs(Math.min(num1, num2)))
// console.log(Math.pow(Math.min(num1, num2), Math.max(num1,num2)))

// function fibonacciGenerator (n) {
//     //Do NOT change any of the code above 👆

//         //Write your code here:

//         let fib = [];
//         if (n === 1) {
//             fib = [0]
//         }
//          else if (n === 2) {
//             fib = [0,1]
//         }
//          else {
//             fib = [0, 1]
//             for (let i = 2; i < n; i++) {
//                 fib.push(fib[fib.length - 2] + fib[fib.length - 1]);
//             }

//         }
//         //Return an array of fibonacci numbers starting from 0.
//         return fib
//     //Do NOT change any of the code below 👇
//     }

//     console.log(fibonacciGenerator (5))


// function birinci (number) {
//     console.log(Math.pow(number, 2))
// }

// function ikinci (callback) {
//    callback(5)
// }

// ikinci(birinci)


// let data10 = () => {
//     let userData = prompt("Lütfen bir şey yazınız")
//     let value = document.getElementById("paragID");
//     value.innerHTML = "<b>" + userData + "</b>";
// document.getElementById("paragID").innerText = "<b>" + userData + "</b>";
// }

// data10();
// let evValue = document.getElementById("deneme_id")
// let eventListenerData = document.getElementById("deneme_id").addEventListener("click", () => {alert("Doğa Harikası")}, false)
// let eventListenerData2 = document.getElementById("deneme_id").addEventListener("click", function () {alert("Doğa Harikası")}, false)

let dataAllExamples = () => {
    let value = Number(prompt("bir sayı gitiniz"));
    let counter = 0, sum = 0;
    let oddCounter = 0, oddSum = 0;
    let evenCounter = 0, evenSum = 0;
    for (let i = 1; i <= value; i++) {
        if (i === 7)
            continue;
        if (i > 100)
            break;
        if (i <= 1) {
            alert("başlanguç sayısından küçük sayı giremezsiniz")
            break;
        }


        counter++;
        sum += i;
        if (i % 2 == 0) {
            evenCounter++;
            evenSum += i;
        } else {
            oddCounter++;
            oddSum += i;
        }

    }

    document.writeln("<br/>" + counter + " tane sayı var.")
    document.writeln("<br/>" + sum + " genel toplam")

    document.writeln("<br/>" + oddCounter + " tane tek sayı var.")
    document.writeln("<br/>" + oddSum + " tek toplam")

    document.writeln("<br/>" + evenCounter + " tane çift sayı var.")
    document.writeln("<br/>" + evenSum + " çift toplam")

}

dataAllExamples();

