/**
* Initializes all of the data
* @author Zoe Bingham
*/

/* Drop all of the tables to make sure that there is a clean start to the DB */
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS beverages;
DROP TABLE IF EXISTS mixes;
DROP TABLE IF EXISTS beverage_content;

/* Create the beverages table */
CREATE TABLE beverages(
    id SERIAL,
    beverage_type VARCHAR(50),
    ingredients VARCHAR(300),
    color VARCHAR(7)
);

/* Create the mixes table */
CREATE TABLE mixes(
    id SERIAL,
    rating INT,
    user_id INT
)

/* Create the beverage_content table */
CREATE TABLE beverage_content(
    mix_id INT,
    beverage_id INT,
    percent DECIMAL
)

/* Users */
CREATE TABLE users(
    id SERIAL,
    username VARCHAR(15)
)