<?php
    // headers
    echo "<h1>Assignment 9 - O'Leary</h1>";
    echo "<hr>";
    echo "\n"."We first call connect_db.php to connect to site_db";
    require "connect_db.php";
    echo "<br>";

    // Printing each row in the sql table courses
    echo "<h3> 1.Display the courses table:</h3>";
    $q = "SELECT * FROM COURSES";
    $r = mysqli_query ($dbc, $q);

    if($r)
    {
        while ($row = mysqli_fetch_array( $r, MYSQLI_NUM))
        {
            echo "<br> 🔘 " . $row[0] . " " . $row[1] . " " . $row[2]
            . " " . $row[3] . " " . $row[4];
        }
    }


    // Adding another row to sql table courses
    echo "<h3> 2.Adding another course to the table:</h3>";

    $q = "INSERT INTO COURSES (dept, course_num, title) VALUES ('CMPT', 307, 'Internetworking')";
    $r = mysqli_query ($dbc, $q);

    if($r)
    {
        echo "<h3> 3.The insert worked!</h3>";
    }
    else
    {
        echo "<h3> 3.Duplicate entry '4' for key 'courses.Primary'</h3>";
    }

    // Displaying updated courses table
    echo "<h3> 4.Displaying UPDATED courses table:</h3>";

    $q = "SELECT * FROM COURSES";
    $r = mysqli_query ($dbc, $q);

    if($r)
    {
        while ($row = mysqli_fetch_array( $r, MYSQLI_NUM))
        {
            echo "<br> 🔘 " . $row[0] . " " . $row[1] . " " . $row[2]
            . " " . $row[3] . " " . $row[4];
        }
    }

    // Updating row 1 to have the student section have my name
    echo "<h3> 5.Updating a record:</h3>";

    $q = "UPDATE COURSES SET student = 'AidanO' WHERE recnum=1";
    $r = mysqli_query ($dbc, $q);

    if($r)
    {
        echo "<h3> 6.The update worked!</h3>";
    }

    // Displaying the updated table
    echo "<h3> 7.Displaying UPDATED courses table:</h3>";

    $q = "SELECT * FROM COURSES";
    $r = mysqli_query ($dbc, $q);

    if($r)
    {
        while ($row = mysqli_fetch_array( $r, MYSQLI_NUM))
        {
            echo "<br> 🔘 " . $row[0] . " " . $row[1] . " " . $row[2]
            . " " . $row[3] . " " . $row[4] . "<br>";
        }
    }


    // Final part
    echo "<br> This is the end of ths assignment.";
    echo "(C) A O'Leary, 2022";
?>

