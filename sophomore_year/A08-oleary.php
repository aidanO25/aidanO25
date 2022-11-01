<!DOCTYPE html>
<!--A08 Fizz-Buzz Table-->
<!--October 25th, 2022 Aidan Oleary-->
<html lang="en">

<head>
    <title> Assignment 8 - Aidan O'Leary </title>
    <meta charset="utf-8">
</head>

<style>
    h1
    {
        color: blue;
    }
    h2
    {
        color: red;
    }
    table
    {
        background-color: color:black;
        border-collapse: collapse; border: 1px solid black;
        font-family: arial; font-weight: normal;

    }
    th
    {
        background-color: grey;
        color: white;
    }
    td
    {
        background-color: lightgreen;
    }
    .fizz
    {
        background-color: lightblue;
    }
    .buzz
    {
        background-color: pink;
    }

</style>

<body>
    <header>
        <h1> Assignment 8 - Aidan O'Leary </h1>
        <h2> this PHP program creates a FIZZ/BUZZ table!</h2>

        <hr>
    </header>

    <main>

        <table border="3px" cellpadding="4" cellspacing="50">
        <tr>   
        <th>Numbers</th>
        <th>Fizz</th>
        <th>Buzz</th>
        </tr>


            <?php
                
                for($i = 0; $i <= 50; $i++)
                {
                    echo "<tr>";
                    echo "<td>" . $i . "</td>";
                    if($i % 3 == 0)
                    {
                        echo "<td class=fizz>" . FIZZ . "</td>";
                    }
                    else
                    {
                        echo "<td>";
                        echo "</td>";
                    }
                    if($i % 5 == 0)
                    {
                        echo "<td class=buzz>" . BUZZ . "</td>";
                    }
                    else
                    {
                        echo "<td>";
                        echo "</td>";
                    }
                    echo "</tr>";
                }
            ?>
        </table>

    </main>

    <footer>
        <hr>
        <small> (C) A O'Leary, 2022 </small>
    </footer>

</body>
</html>


        