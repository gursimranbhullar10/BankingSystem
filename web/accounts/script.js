function accntA() {

    var x = document.getElementById("accountA");
    
    if (x.style.display === "none") {
        x.style.display = "block";
    } else {
        x.style.display = "none";
    }
}
function accntB() {

    var x = document.getElementById("accountB");
    if (x.style.display === "none") {
        x.style.display = "block";
    } else {
        x.style.display = "none";
    }
}
function accntC() {

    var x = document.getElementById("accountC");
    if (x.style.display === "none") {
        x.style.display = "block";
    } else {
        x.style.display = "none";
    }
}
function accntD() {

    var x = document.getElementById("accountD");
    if (x.style.display === "none") {
        x.style.display = "block";
    } else {
        x.style.display = "none";
    }
}
function detailsA() {

    var x1 = document.getElementById("accountAH");
    var x2 = document.getElementById("accountBH");
    var x3 = document.getElementById("accountCH");
    var x4 = document.getElementById("accountDH");
    var x = document.getElementById("accountAD");
    if (x.style.display === "none") {
        x1.style.display = "none";
        x2.style.display = "none";
        x3.style.display = "none";
        x4.style.display = "none";
        x.style.display = "block";
    } else {
        x.style.display = "none";
    }
}
function detailsB() {

    var x1 = document.getElementById("accountAH");
    var x2 = document.getElementById("accountBH");
    var x3 = document.getElementById("accountCH");
    var x4 = document.getElementById("accountDH");
    var x = document.getElementById("accountBD");
    if (x.style.display === "none") {

        x1.style.display = "none";
        x2.style.display = "none";
        x3.style.display = "none";
        x4.style.display = "none";
        x.style.display = "block";
    } else {
        x.style.display = "none";
    }
}
function detailsC() {

    var x1 = document.getElementById("accountAH");
    var x2 = document.getElementById("accountBH");
    var x3 = document.getElementById("accountCH");
    var x4 = document.getElementById("accountDH");
    var x = document.getElementById("accountCD");
    if (x.style.display === "none") {
        x1.style.display = "none";
        x2.style.display = "none";
        x3.style.display = "none";
        x4.style.display = "none";
        x.style.display = "block";
    } else {
        x.style.display = "none";
    }
}
function detailsD() {
    var x1 = document.getElementById("accountAH");
    var x2 = document.getElementById("accountBH");
    var x3 = document.getElementById("accountCH");
    var x4 = document.getElementById("accountDH");
    var x = document.getElementById("accountDD");
    if (x.style.display === "none") {
        x1.style.display = "none";
        x2.style.display = "none";
        x3.style.display = "none";
        x4.style.display = "none";
        x.style.display = "block";
    } else {
        x.style.display = "none";
    }
}
function summary(){

    var x1 = document.getElementById("accountAH");
    var x2 = document.getElementById("accountBH");
    var x3 = document.getElementById("accountCH");
    var x6 = document.getElementById("accountDH");
    var x = document.getElementById("accountCD");
    var x4 = document.getElementById("accountAD");
    var x5 = document.getElementById("accountBD");
    var x7 = document.getElementById("accountDD");
    
        x1.style.display = "block";
        x2.style.display = "block";
        x3.style.display = "block";
        x6.style.display = "block";
        x.style.display = "none";
        x4.style.display = "none";
        x5.style.display = "none";
        x7.style.display = "none";
    abc();
}
function abc(){
        var x1 = document.getElementById("chqngno").innerHTML;
        var x2 = document.getElementById("invstno").innerHTML;
        var x3 = document.getElementById("crdtno").innerHTML;
        var x4 = document.getElementById("svngno").innerHTML;
        var accA = document.getElementById("accountAH");
        var accB = document.getElementById("accountBH");
        var accC = document.getElementById("accountCH");
        var accD = document.getElementById("accountDH");
        if(x1==0){
            accA.style.display = "none";
            accB.style.top="22%";
            accC.style.top="54%";
            accD.style.top="86%";
        }
        if(x2==0){
            accB.style.display = "none";
            accC.style.top="54%";
            accD.style.top="86%";
        }
        if(x3==0){
            accC.style.display = "none";
            accD.style.top="86%";
        }
      if(x4==0){
            accD.style.display = "none";
        }
  
}