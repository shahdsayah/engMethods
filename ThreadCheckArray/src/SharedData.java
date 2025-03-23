import java.util.ArrayList;
import java.util.List;

/**
 * SharedData class contains : List named array, boolean array named WinArray, boolean private
 * variable named flag, and a constant value. 
 */

public class SharedData 
{
	private List<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	
	public SharedData(List<Integer> array, int b) {
		
		this.array = new ArrayList<>();
		this.b = b;
	}
	/**
	 *  getWinArray: function that returns boolean array that represents the win condition
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}
	/**
	 * setWinArray: function that sets boolean array that represents the win condition
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}
	/**
	 * getArray: function that returns a list of integers
	 */
	public List<Integer> getArray() 
	{
		return array;
	}
	/**
	 * getB: a function that returns the constant b
	 */
	public int getB() 
	{
		return b;
	}
	/**
	 * getFlag: a function that returns the variable flag.
	 */
	public boolean getFlag() 
	{
		return flag;
	}
	/**
	 * getFlag: a function that sets the variable flag
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
