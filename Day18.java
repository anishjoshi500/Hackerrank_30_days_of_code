public class Solution {
        Queue<Character> q = new LinkedList<>();
        Deque<Character> s = new ArrayDeque<>();
	    
	    public void enqueueCharacter(char ch) {
	        q.add(ch);
	    }
	    public char dequeueCharacter() {
	        return q.remove();
	    }
        
        
        public void pushCharacter(char ch) {
	        s.push(ch);
	    }
	    
	    public char popCharacter() {
	        return s.pop();
	    }
