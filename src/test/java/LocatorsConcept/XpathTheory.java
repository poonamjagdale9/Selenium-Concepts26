package LocatorsConcept;

public class XpathTheory {
    public static void main(String args[]){
        /* 2 types of Xpath
        // Absolute xpath (full xpath) always starts from root node
        Ex: /html/body/div[6]/header/div[2]/div[2]/form/input

        // Relative xpath(parcial xpath) we use atributes- it will directly jump to the element
        EX: //*[@name="search"]   //input[@id='small-searchterms']

        Difference between Absolute & Relative xpath
        1. Absolute xpath starts with / ------ represent root node
          Relative xpath strats with //

          2. Absolute xpath does not use any atrribute
             Relative xpath works with attributes
           3. Absolute xpath traverse through each node till it finds element
           Relative xpath directly jumps and find the elements by using attributes


        //Xpath is address of the element on the DOM */

        /* Relative xpath / Partial xpath
        1. Automatically
        2. Manually (own xpath)
        Syntax
        //tagname[@attribute='value']
        //*[attribute='value']   --- mainly work with the attribute

        //img[@title="Show products in category Electronics"]

         */

        // handling dynamic attributes
        //*[id= 'start' or id='stop']
        //*[contains(@id,'st')]
        //*[starts-with(@id,'st')]

        // name=xyz001   xyz002   xyz0003  xyz004
        //*[contains(@name, 'xyz')]
        //*[contains(@name,'00')]
        //*[starts-with(@name, 'xyz')]

        //name 001xyz   002xyz  003xyz
        //*[contains(@name,'00')]
        //*[contains(@name, 'xyz')]
        //*[starts-with(@name, '00')]

        // name=101xyz 201xyz 301xyz 401xyz
        // we can use only contains
        // //*[contains(@name, 'xyz')]
        // //*[contains(@name, '01')]

        // Chained xpath
        // //div[@id='logo']/a/img





    }
}
