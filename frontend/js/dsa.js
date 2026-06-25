function visualize() {

    let algorithm =
        document.getElementById(
            "algorithm"
        ).value;

    document.getElementById(
        "visualResult"
    ).innerHTML =

    "<h3>Algorithm Selected</h3>" +
    "<p>" + algorithm + "</p>" +
    "<p>Visualization Loaded Successfully</p>";
}