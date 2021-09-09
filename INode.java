package bst;

public interface INode<k> {
	k getKey();
	void setKey();
	
	INode<k> getNext();
	void setNext(INode<k> next);
}
