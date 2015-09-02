package oca.exception;

class Plane {
	static String s = "-";
	public static void main(String[] args) {
		new Plane().s1();
		System.out.println(s);
	}
	
    void s1() {
    	try { 
    		s2(); 
    	}
    	catch (Exception e) {
    		s += "c"; 
    	}
    }
    
    void s2() throws Exception {
    	s3(); 
    	s += "2";
    	System.out.println("s2:"+s);
    	s3(); 
    	s += "2b";
    	System.out.println("s2:"+s);
    }
    
    void s3() throws Exception {
    	throw new Exception();
    }
}