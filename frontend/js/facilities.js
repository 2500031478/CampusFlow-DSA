function addFacility() {

    let facility =
        document.getElementById(
            "facilityName"
        ).value;

    if(facility === "") {
        alert("Enter Facility Name");
        return;
    }

    let li =
        document.createElement("li");

    li.innerText = facility;

    document.getElementById(
        "facilityList"
    ).appendChild(li);

    document.getElementById(
        "facilityName"
    ).value = "";
}