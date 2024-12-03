package java_1203.singleton;

public class SingletoneLogger {
    //생성자를 private로 설정/ 외부에서 새로운 인스턴스 생성금지

    private static SingletoneLogger instance;
    private SingletoneLogger(){


    }

    public static SingletoneLogger getInstance() {
        if(instance == null){ //아직 객체가 생성되지 않았으면
            synchronized(SingletoneLogger.class){
                if(instance == null){
                    instance = new SingletoneLogger();
                    //객체가 없으면 하나 생성
                }
            }
        }
        return instance;
    }
    public void log(String message){
        System.out.println("Log : " + message);
    }
}

