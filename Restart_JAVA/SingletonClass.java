package Restart_JAVA;

class CAR{
    static CAR obj;
     String carName;
    private CAR(){
    }

    static CAR createObject(String name){
        if(obj==null){
            obj=new CAR();
            obj.carName=name;
        }
        return obj;
    }

}

public class SingletonClass {
    public static void main(String[] args) {
        CAR car1=CAR.createObject("BMW");
        CAR car2=CAR.createObject("BMW2");// car2 object is nothing it same refer to car1 Object

        System.out.println(car1.carName +" "+ car2.carName);
    }
    
}
