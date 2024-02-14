function prime() {
    let x = parseInt(document.getElementById("inputs").value);
    let f = 0;
    let i = 2;
    let sq = Math.sqrt(x)
    for (i = 2; i <= sq; i++) {
        if (x % i === 0) {
            f = 1;
            break;
        }
    }

    if (f === 1) {
        console.log("0.00");
    } else {
        console.log(sq.toFixed(2));
    }
}
