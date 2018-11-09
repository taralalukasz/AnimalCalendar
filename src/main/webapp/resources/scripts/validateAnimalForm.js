
function validateForm() {
    var x = document.forms["animalForm"]["name"].value;
    if (x == "") {
        document.getElementById("animal_form_message").style.display="block";
        return false;
    }
    if (x.length > 12) {
        document.getElementById("animal_form_message").style.display="block";
        return false;
    }
}