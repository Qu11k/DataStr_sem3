package datastr;
public class MyHeap <Ttype> {
private myNode<Ttype> rootNode = null;
private myNode<Ttype> lastNode = null;
private int howManyElements=0;
public int getHowManyElements() {
	return howManyElements;
}
//get funkcijas netaisam blokiem lai lietotajs netiek klat
//set funkcijas netisam jo nelaujam lietotajam mainit
public boolean isEmpty() {
	return (howManyElements==0);
}
public boolean isFull() {
	
}

}
