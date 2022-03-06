# MiXR
> ![MiXR logo](https://github.com/CodingCapybaras/MiXR/blob/main/diagrams/MiXR%20Logo.jpg)
> 

## **About MiXR**
### MiXR is an application that promotes a space for sharing love of alcoholic beverages and the mixing of these beverages.

**How to Use MiXR:**
> In order to run MiXR on your local machine, you must have the node package manager installed. 
> 1. Clone this repository
> 2. Add node_modules to the MiXR/MiXR directory.
> 3. Run the command ```npm start```
> 4. Log in and get mixing!

**Resources used in Development of MiXR:**
> Java: used to implement OOP to implement logic in MiXR
> SQL: Gave access to data of beverages being used in order to make a drink mix. So everything including calories, ingredients, and proof is calculated by the data given.
> Figma: Helped design our logo, UI/UX, and was the core of our designs for the objects we created
> React: frontend for MiXR, helped optimize our performance by using VirtualDOM
> MongoDB: provided a backend for MiXR

**UML for classes used in Development**
> The model of our program is based around beverage and mix objects. Beverage objects are created when a beverage is obtained from the database through the Translastion.java. That beverage object can be used to make mixes of different beverages. When a mix is made, the user must specify one or more beverages that they wish to add to the mix with the relative amount. When a user creates a mix, a method called Translation.addMix(HashMap<int percent, Beverage>, int userID) will be added to the database. The mixes can be retrieved when a user is scrolling through a feed of mixes, or when a user views another users mixes.
> ![uml](https://github.com/CodingCapybaras/MiXR/blob/main/diagrams/MiXR%20UML%20class%20diagram.jpeg)

### Inspiration
We decided to make something fun that involve users interacting with beverages and experimenting to get a beverage perfect for them! So wanted to make a fun program that would attract user involvement with beverages they love to enjoy.

### What it does
MiXR is a program that allows users to become their own bartender and experiment with mixing drinks while giving them more in-depth information than they would get by just mixing drinks randomly. They can also estimate the cost of how much it would cost to mix their custom drinks as well as share and save drinks made by them and others through a social page.

## Accomplishments that we're proud of
In terms of design, I believe the overall look of most of the main pages is clean and flows well while also allowing for ease of access. There are many aspects that permit for easy changes to be made to the UI/UX if needed, as well as for any additional information that might need to be added in the future if necessary.

## What we learned
Many of us learned from this experience that planning, communication, and coordination are essential to be successful. We found that these methods were especially important since our team is composed of members with very different backgrounds. Through our collaboration, we were able to learn more about different tools that we could use for different parts of an application. For example, many of the members were unfamiliar with Figma--a prototyping design tool-- and needed to understand the capabilities of this tool in order to understand what the rest of the group could do.

## What's next for MiXR
We believe that there's a lot of potential for MiXR to expand. We think this is something that could also be created into a mobile app so that users can request their favorite creations at restaurants by quickly sharing them with the bartenders or other staff through use of a QR code or something similar.  
