function bookResource() {

    let resource =
        document.getElementById(
            "resource"
        ).value;

    if(resource === "") {

        alert("Enter Resource Name");
        return;
    }

    let li =
        document.createElement("li");

    li.innerText =
        resource + " Booked Successfully";

    document.getElementById(
        "bookingList"
    ).appendChild(li);

    document.getElementById(
        "resource"
    ).value = "";
}