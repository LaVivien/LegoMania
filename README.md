# Lego Mania

## Part 1

Create a Swing GUI application that displays the following graphics of red and blue lego blocks. The tower is always built from bottom row to top row, left to right in each row.

![Alt text](https://github.com/lavivien-ds-algo/stackBlackoutMath/blob/master/blackout-math.jpg?raw=true "Title")

Write a class named Legos1 extending the JFrame class with the following specifications.

a. Declare the integer type instance variables startX, startY, legoWidth, and legoHeight. The first two values represent the top-left coordinates of the first red block in the bottom row. The next two values are the width and height of each block.

b. Declare another integer instance variable, baseLength. This represents the number of blocks in the bottom row.

c. In the constructor, specify the appropriate window title using your lastName and assign the above instance variables with the values 20, 300, 50, 20, and 10, respectively.

d. In the paint method, using nested loops, fill the pattern from the bottom row all the way to the top. Notice that the number of blocks decreases by one for each row. Use the baseLength variable to control the loops.

e. In the main method, create the application object, set its size to 550 by 325 and its visibility to true to test the above graphics. Note: For each block, use the fillRoundRect method of the Graphics object. Use a value of 2 for arcWidth and arcHeight.

## Part 2 

Modify part1 assuming that now you have a bucket of lego blocks with various colors. Write a newclass Legos2 in the same package for this part. Use an array of Color objects and initialize the array with the colors:
```
Color.red, Color.blue, Color.yellow,
Color.green, Color.pink,Color.black, Color.magenta,
Color.orange, and Color.cyan.
```
For picking the next color for the block, use a java.util.Random object and generate a random integer using the nextInt method. Use the length of the colors array as an argument (do not hard code the array length).

Since the colors are picked at random, the output varies for each invocation. A sample output is shown below.

![Alt text](https://github.com/lavivien-ds-algo/stackBlackoutMath/blob/master/blackout-math.jpg?raw=true "Title")

## part 3

Modify part2 and write the Legos3 version so that the same color is not picked consecutively. A sample output is shown below.

![Alt text](https://github.com/lavivien-ds-algo/stackBlackoutMath/blob/master/blackout-math.jpg?raw=true "Title")