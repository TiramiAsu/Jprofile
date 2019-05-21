var xhttp = new XMLHttpRequest();

function jqueryUser() {
    var method = "GET";
    var id = document.getElementById("readid").value;
    var path = "/Jprofile/casei/jaxrs/user/" + id;

    doRun(xhttp, method, path);
    console.log(path);
    xhttp.open(method, path, true);
    xhttp.send();
}

function jqueryUsers() {
    var method = "GET";
    var path = "/Jprofile/casei/jaxrs/user/all";

    doRun(xhttp, method, path);
    console.log(path);
    xhttp.open(method, path, true);
    xhttp.send();
}

function jcreateUser() {
    var method = "POST";
    var path = "/Jprofile/casei/jaxrs/user/";
    var args = "createname=" + document.getElementById("createname").value;

    doRun(xhttp, method, path);
    console.log(path);

    xhttp.open(method, path, true);
    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhttp.send(args);
}

function jupdateUser() {
    var method = "PUT";
    var path = "/Jprofile/casei/jaxrs/user/" + document.getElementById("updateid").value;
    var args = "updatename=" + document.getElementById("updatename").value;

    doRun(xhttp, method, path);
    console.log(path);

    xhttp.open(method, path, true);
    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhttp.send(args);
}

function jdeleteUser() {
    var method = "DELETE";
    var path = "/Jprofile/casei/jaxrs/user/" + document.getElementById("deleteid").value;

    doRun(xhttp, method, path);
    console.log(path);

    xhttp.open(method, path, true);
    xhttp.send();
}

function doRun(xhttp, method, path) {
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            console.log(this.responseText);
            document.getElementById("jresult").innerText = this.responseText;
        }
    };
    document.getElementById("jreq_method").innerText = "(" + method + ")";
    document.getElementById("jreq_url").innerText = path;
}

