function login() {

    let role =
        document.getElementById("role").value;

    let username =
        document.getElementById("username").value;

    let password =
        document.getElementById("password").value;

    if (username === "" || password === "") {

        alert("Please Enter Username and Password");

        return;
    }

    // Save role for other pages
    localStorage.setItem("role", role);
    localStorage.setItem("username", username);

    if (role === "admin") {

        alert("Admin Login Success");

        window.location.href =
            "admin-dashboard.html";
    }

    else if (role === "faculty") {

        alert("Faculty Login Success");

        window.location.href =
            "faculty-dashboard.html";
    }

    else {

        alert("Student Login Success");

        window.location.href =
            "student-dashboard.html";
    }

}