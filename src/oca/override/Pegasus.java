package oca.override;

class Horse {
    public String identifyMyself() {
        return "I am a horse.";
    }
}

interface Flyer {
    public String identifyMyself();
}

interface Mythical {
    public String identifyMyself();
}

public class Pegasus extends Horse implements Flyer, Mythical {
    public static void main(String... args) {
        Pegasus myApp = new Pegasus();
        System.out.println(myApp.identifyMyself());
    }
    
    public static String identifyMyself(){
    	return "I m implements";
    }
}
