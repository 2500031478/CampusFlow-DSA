function scheduleEvent() {

    let eventName =
        document.getElementById(
            "eventName"
        ).value;

    if(eventName === "") {

        alert("Enter Event Name");
        return;
    }

    let li =
        document.createElement("li");

    li.innerText =
        eventName + " Scheduled";

    document.getElementById(
        "scheduleList"
    ).appendChild(li);

    document.getElementById(
        "eventName"
    ).value = "";
}