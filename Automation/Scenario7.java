public class Scenario7
{
	//Find out the total number of substrings
	
	public static void main(String[] args) {
		String s = "You come home and welcome them.";
		String ss = "ome";
		
		
		//Passing the length of the string ss = 3
		//it will calculate as 3(3+1)/2 = 3(4)/2 = 12/2 = 6
		//so it will print 6
		//which means {o,m,e,ome,om,me}
		System.out.println(getCountofNonEmptySubString(ss.length()));  
		
		//reference link
		//https://stackoverflow.com/questions/12418590/finding-substrings-of-a-string#:~:text=Thus%20the%20number%20of%20all,n%2B1)%20%2F%202%20.
		String spaceRemoved = s.replaceAll("\\s","");
		System.out.println(spaceRemoved);
		System.out.println("Length : "+ spaceRemoved.length());
		//26(26+1)/2 = 26(27)/2 = 702/2 = 351
		System.out.println(getCountofNonEmptySubString(spaceRemoved.length())); 
	}
	
	private static int getCountofNonEmptySubString(int n) {
		return n*(n+1)/2;
	}
}