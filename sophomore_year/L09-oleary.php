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

    $q = "insert into courses (dept, course_num, title) values ('CMPT, 306, 'Internetworking')";
    $r = mysql_query($q);
    
    if($r)
    {
        echo "<h3> 3.The insert worked!</h3>";;
    }
    else
    {
        echo "Error";
    }

    // Displaying updated table
    "<h3> 4.Display the UPDATED courses table:</h3>";
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

    // Making the student section my name for row 1
    "<h3> 5.Updating a record</h3>";
    
    // Checking that it was updated
    "<h3> 6.The update worked!</h3>";

    // Displaying the final updated table
    "<h3> 7.Display the updated courses table:</h3>";
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

    // Final part
    echo "\n" . "This is the end of ths assignment.";
    echo "(C) A O'Leary, 2022";
?>

