function geUserByEmail(email) {
    // TODO call api rest using email
    
};
function createUser(user) {
    let name = document.getElementById("txtName").value;
    let email = document.getElementById("txtEmail").value;
    let password = document.getElementById("txtPassword").value;
    let confirmedPassword = document.getElementById("txtConfirmedPassword")

    if (nameValidation(name)) {
        if (emailValidation(email)) {
            if (newPasswordValidation(password,confirmedPassword)) {
                //TODO validate email does not exist in DB
                //TODO call api to create user 
            } else {
                alert("Las contraseñas no son iguales.Verifique de nuevo por favor ")
            }
        } else {
            alert("El email no tiene el formato correcto")
        }
    } else {
        alert("El nombre no tiene el formato correcto")
    }

};


function validateLogin() {
    let email = document.getElementById("txtEmail").value;
    let password = document.getElementById("txtPassword").value;
    console.log(email)
    console.log(password)

    if (emailValidation(email)) {
        // TODO CALL API USING AJAX
    }
    else{
        alert("El formato Email no es valido")
    }
    
};