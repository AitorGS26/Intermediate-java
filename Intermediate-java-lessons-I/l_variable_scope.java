/*The scop of a variable defines it's use, it idicaten in which sections the variable will be available
 * Out of this, the variable won't be usable.
 * 
 * The types of scopes we can use are the following:
 * 
 * local => They only have use inside the method, also the parameter of the method is only for the method
   locally. You have to init with =0; or something like that.
 * global => those are the ones that for the class that have been created and depending on the access modifiers
   they will be only give access for one class ore more. you dont have to init it.
 * static => Theyare for the class they're created for only, they allow using them depending on the acces modifier it has.
 */
public class l_variable_scope {

    static int staticVariable;//this depends on the acces modifier.
    int globalVariable; //this is global

    void mymethod(int parameter) {
        int localVariable = 0;
        //The parameter is also local inside the method.
    }
}
