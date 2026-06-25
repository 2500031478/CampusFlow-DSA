function findRoute() {

    let source =
        document.getElementById(
            "source"
        ).value;

    let destination =
        document.getElementById(
            "destination"
        ).value;

    if(source === "" || destination === "") {

        alert("Enter Source and Destination");
        return;
    }

    document.getElementById(
        "routeResult"
    ).innerHTML =

    "<h3>Shortest Route</h3>" +
    "<p>" +
    source +
    " ➜ " +
    destination +
    "</p>" +
    "<p>Distance: 500 meters</p>";
}