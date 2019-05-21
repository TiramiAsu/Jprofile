var xhttp = new XMLHttpRequest();

function queryUser() {
    var method = "GET";
    var id = document.getElementById("readid").value;
    var path = "/Jprofile/casei/rest/user/" + id;

    doRun(xhttp, method, path);
    console.log(path);
    xhttp.open(method, path, true);
    xhttp.send();
}

function queryUsers() {
    var method = "GET";
    var path = "/Jprofile/casei/rest/users"

    doRun(xhttp, method, path);
    console.log(path);
    xhttp.open(method, path, true);
    xhttp.send();
}

function createUser() {
    var method = "POST";
    var path = "/Jprofile/casei/rest/user/";
    var args = "createname=" + document.getElementById("createname").value;

    doRun(xhttp, method, path);
    console.log(path);

    xhttp.open(method, path, true);
    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhttp.send(args);
}

function updateUser() {
    var method = "PUT";
    var path = "/Jprofile/casei/rest/user/" + document.getElementById("updateid").value;
    var args = "updatename=" + document.getElementById("updatename").value;

    doRun(xhttp, method, path);
    console.log(path);

    xhttp.open(method, path, true);
    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhttp.send(args);
}

function deleteUser() {
    var method = "DELETE";
    var path = "/Jprofile/casei/rest/user/" + document.getElementById("deleteid").value;

    doRun(xhttp, method, path);
    console.log(path);

    xhttp.open(method, path, true);
    xhttp.send();
}

function doRun(xhttp, method, path) {
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            console.log(this.responseText);
            document.getElementById("req_result").innerText = this.responseText;
        }
    };
    document.getElementById("req_method").innerText = "(" + method + ")";
    document.getElementById("req_url").innerText = path;
}

