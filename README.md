# MiXR
> ![MiXR logo](https://github.com/CodingCapybaras/MiXR/blob/main/diagrams/MiXR%20Logo.jpg)
> 
###**About MiXR:**
> 
### MiXR is an application that promotes a space for sharing love of alcoholic beverages and the mixing of these beverages.

**How to Use MiXR:**
> In order to run MiXR on your local machine, you must have the node package manager installed. 
> 1. Clone this repository
> 2. Add node_modules to the MiXR/MiXR directory.
> 3. Run the command ```npm start```
> 4. Log in and get mixing!

**Resources used in Development of MiXR:**
> Java, SQL, Figma, React, MongoDB.

**UML for classes used in Development**
> The model of our program is based around beverage and mix objects. Beverage objects are created when a beverage is obtained from the database through the Translastion.java. That beverage object can be used to make mixes of different beverages. When a mix is made, the user must specify one or more beverages that they wish to add to the mix with the relative amount. When a user creates a mix, a method called Translation.addMix(HashMap<int percent, Beverage>, int userID) will be added to the database. The mixes can be retrieved when a user is scrolling through a feed of mixes, or when a user views another users mixes.
> ![uml](https://github.com/CodingCapybaras/MiXR/blob/main/diagrams/MiXR%20UML%20class%20diagram.jpeg)
