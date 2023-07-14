function nameValidation(name) {
    let pattern = /^([a-z][A-Z]*)+ ([a-z][A-Z]*)/
    return pattern.test(name)
};

function emailValidation(email) {
    const pattern = /^[a-z][a-z.0-9]*@usa.edu.co/
    return pattern.test(email)
    
};

function newPasswordValidation(password,confirmed_password) {
    if (password===confirmed_password) {
        return true;

    }
    else 
        return false;
    
};