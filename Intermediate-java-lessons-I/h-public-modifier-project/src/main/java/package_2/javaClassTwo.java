package package_2;

import package_1.atributes_methods2;/*as we are in a different package we've to import 
                                     the one inwhich the data is*/

public abstract class javaClassTwo {

    public static void main(String[] args) {
        atributes_methods2 mess = new atributes_methods2();
        //mess. //Uncomment mess and add a dot and see if the values are suggested.
    }
    /*Here if we uncomment mess. we'll se that also it suggest the varibles we've declared, it
 doesn't matter if it's the same package or not, we import the package and the public ones
 will be usefull */
}
