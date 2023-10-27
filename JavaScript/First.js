let str = "This is random String";
let words = str.split(" ");

for(let i=0;i<words.length;i++) {

    let curr = words[i];

    let temp = "";

    for(let j=curr.length-1;j>=0;j--) {
        temp+=curr[j];
    }

    words[i] = temp;
}

let reverStr = words.join(" ");

console.log(reverStr);