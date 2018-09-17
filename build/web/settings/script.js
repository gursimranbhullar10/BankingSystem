function profile() {
     var x1 = document.getElementById("profile");
     var x2 = document.getElementById("security");
    if (x1.style.display === "none") {
        x2.style.display = "none";
        x1.style.display = "block";
    }else{
        x1.style.display = "none";
    }
}
function security() {
     var x1 = document.getElementById("profile");
     var x2 = document.getElementById("security");
    if (x2.style.display === "none") {
        x1.style.display = "none";
        x2.style.display = "block";
    }else{
        x2.style.display = "none";
    }
}
function passbox(){
    var x1=document.getElementById("passbox");
    var x2=document.getElementById("quesbox");
    if (x1.style.display === "none") {
        x2.style.display = "none";
        x1.style.display = "block";
    }else{
        x1.style.display = "none";
    }
}
function quesbox(){
    var x1=document.getElementById("passbox");
    var x2=document.getElementById("quesbox");
     if (x2.style.display === "none") {
        x1.style.display = "none";
        x2.style.display = "block";
    }else{
        x2.style.display = "none";
    }
}
function dropbox(){
    var x1=document.getElementById("dropcontent");
    if (x1.style.display === "none") {
       
        x1.style.display = "block";
    }else{
        x1.style.display = "none";
    }
}