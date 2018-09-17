

function box1() {
     var x1 = document.getElementById("box1");
    var x2 = document.getElementById("box2");
    var x3 = document.getElementById("box3");
    if (x1.style.display === "none") {
        x3.style.display = "none";
        x2.style.display = "none";
        x1.style.display = "block";
    }
}
function box2() {
      var x1 = document.getElementById("box1");
    var x2 = document.getElementById("box2");
    var x3 = document.getElementById("box3");
    if (x2.style.display === "none") {
       x3.style.display = "none";
        x1.style.display = "none";
        x2.style.display = "block";
    }
}
function box3() {
     var x1 = document.getElementById("box1");
    var x2 = document.getElementById("box2");
    var x3 = document.getElementById("box3");
    if (x3.style.display === "none") {
         x1.style.display = "none";
        x2.style.display = "none";
        x3.style.display = "block";
    }
}

function payshw() {
    alert("fd");
     var x = document.getElementById("pay3");
    if (x.style.display === "none") {
        x.style.display = "block";
    }else{
        x.style.display = "none";
    }
}