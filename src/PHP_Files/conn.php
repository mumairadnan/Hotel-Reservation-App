<?php
    // Database connection details
    $host = "localhost";
    $username = "umair";
    $password = "simplepass";
    $database = "hotel_reservation_application";

    // Establish a connection to the database
    $con = mysqli_connect($host, $username, $password, $database);

    // Check if the connection was successful
    if (!$con) {
        die("Connection failed: " . mysqli_connect_error());
    }

    // Set the character set to UTF-8
    mysqli_set_charset($con, "utf8");

    echo "Connected successfully!";
?>
