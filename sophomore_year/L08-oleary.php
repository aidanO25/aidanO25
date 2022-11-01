<!DOCTYPE html>
<!--Lab 08 our first PHP file-->
<!--October 21st, 2022 Aidan Oleary-->
<html lang="en">

<head>
    <title> My First PHP File </title>
    <meta charset="utf-8">
</head>

<body>
    <header>
        <h1> My First HTML File </h1>
    </header>

    <main>
        <?php
            echo "<p> Hello world!";
            echo "<p> This text was dynamically created by PHP ";
            
            echo "<br>";

            echo "<h2> step 1: Arrays </h2>";

            $months[] = 'January';
            $months[] = 'February';
            $months[] = 'March';

            echo "<br> 0 - $months[0]";
            echo "<br> 1 - $months[1]";
            echo "<br> 2 - $months[2]";

            $months[6]='July';
            echo "<br> 6 - $months[6]";

            $courses=array('SD2', 'Data Comm', 'Bio 101');
            echo "<br> $courses[0]";

            echo "<br>";

            for($i = 0; $i < 3; $i++)
            {
                echo "<br> " . $i . " " . $friends[$i];
            }


            include "connect_db.php";
        ?>

    </main>

    <footer>
        <small> (C) A O'Leary, 2022 </small>
    </footer>

</body>
</html>


        