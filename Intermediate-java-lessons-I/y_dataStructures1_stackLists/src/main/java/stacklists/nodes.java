/*This will be the starting point */
package stacklists;

/*This class will create new nodes after the user's introduction of different values */
public class nodes{

/*All the nodes have two fields => information and a pointer to the next node (except last node)*/
   public int info;
    public nodes nextNode;
/* when the user saves a value we'll receive by this builder, it will save user's different nodes*/
    public nodes(int value){
        info = value;/*Values will be user's input and it will save in node's info */
        nextNode= null;//Pointer start's not pointing to anyone
    }
}
