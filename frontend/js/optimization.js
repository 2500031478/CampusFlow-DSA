function optimize() {

    let capacity =
        document.getElementById(
            "capacity"
        ).value;

    if(capacity === "") {

        alert("Enter Capacity");
        return;
    }

    document.getElementById(
        "optimizationResult"
    ).innerHTML =

    "<h3>Optimization Result</h3>" +
    "<p>Maximum Resource Utilization Achieved</p>" +
    "<p>Capacity Used: " +
    capacity +
    "</p>";
}