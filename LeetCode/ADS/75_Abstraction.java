abstract class Device{
    abstract void turnOn();
    
    abstract void turnOff();
    
    void displayType(){
        System.out.println("Electronic Device");
    }
}

class Television extends Device{	
    void turnOn(){
        System.out.println("Tv is ON");
    }

    void turnOff(){
        System.out.println("Tv is OFF");
    }
}

class Main{
    public static void main(String[] args){
        Device myTV = new Television();
        myTV.turnOn();
        myTV.turnOff();
    }
}


