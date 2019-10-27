/** A stack abstract data type that contains Strings. */
public class StringStack {
	private String[] stringStack;
	private int pointer;
	// TODO add variables for data here

	/**
	* Constructor for creating a new StringStack with a certain capacity.
	* @param capacity the maximum number of strings the stack can hold
	*/
	public StringStack(int capacity) {
		this.stringStack = new String[capacity];
		this.pointer= 0;
		// TODO implement this
	}

	/**
	* Puts the given String on top of the stack (if there is enough space).
	* @param s the String to add to the top of the stack
	* @return false if there was not enough space in the stack to add the string;
	*         otherwise true
	*/
	public boolean push(String s) {

		if (this.pointer == (this.stringStack).length){
			return false;
		}
		this.stringStack[this.pointer]= s;
		this.pointer+=1;
		return true;
	}

	/**
	* Removes the String on top of the stack from the stack and returns it.
	* @return the String on top of the stack, or null if the stack is empty.
	*/
	public String pop() {
		String toReturn;
		if (this.pointer==0){
			return null;
		}
		toReturn=(this.stringStack)[this.pointer-1];
		this.stringStack[this.pointer-1]=null;
		this.pointer-=1;
		return toReturn;

	
	}

	/**
	* Returns the number of Strings in the stack.
	* @return the number of Strings in the stack
	*/
	public int count() {
		return this.pointer;
	
	}
}
