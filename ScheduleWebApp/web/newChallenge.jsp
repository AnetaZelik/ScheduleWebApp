<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New challenge</title>
    </head>
    <body>
        <h1>Add new challenge</h1>
        <form method = "post" action = "saveChallenge">
            Challenge name:<br/>
            <input type = "text" name="challengeName"/>
            Challenge duration:<br/>
            <input type = "text" name="challengeDuration"/>
            Challenge category:<br/>
            <input type = "text" name="challengeCategory"/>
            <input type="submit" name="Save challenge"/>            
        </form>
        <a href="index.html">Back to menu</a>
    </body>
</html>
