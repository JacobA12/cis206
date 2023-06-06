Please note, this prompt is used for c++, java and the python courses. Notes are given for
which parts you will need to pay attention to.

The following data will be used for this project

Mountain                     Country             Elevation
Chimborazo                   Ecuador             20,549 ft
Matterhorn                   Switzerland         14,692 ft
Olympus                      Greece (Macedonia)  9,573 ft
Everest                      Nepal               29,029 ft
Mount Marcy - Adirondacks    United States       5,344 ft
Mount Mitchell - Blue Ridge  United States       6,684 ft
Zugspitze                    Switzerland         9,719 ft

Write a program that will include the following:
   * 1. A class that will store mountain details which will included the following:

                  * Member for the name, (make it private for java or c++)
                  * Member for the country, (make it private for java or c++)
                  * Member for the elevation, (make it private for java or c++)
                  * Setters and getters for all the data members. (Make them public for java or c++)

                  * A member function call toMeters that will take the elevation and convert the value
                   from feet to meters and return the converted value. The relationship for feet to
                   meters is 1 meter per 3.2808 feet

   * 2. In the main function of the Main class(for java, main function for c++ and a main function
         for python with the __name__=="__main__" structure) , create 7 instances of Mountain
         objects and put the mountain data from the table above.

   * 3. Put the mountain objects in an appropriate data structure.
   * 4. Write a method called minElevation in the (Main class for java, main module for python,
         or the file that has main for c++) that will return the minimum elevation.
    5. Iterate over the data structure that contains the Mountain objects and print out the
         Mountain details similar to the table above, with the addition of the elevation in feet and
         in meters.
    6. Programmatically print out the elevation and name of the shortest mountain (do not hard
         code this)

Note:
Make sure that you put the header comments in this assignment.
