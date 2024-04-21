package SingletonPattern;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

    class LoggerService {
     private static LoggerService instance;

     private LoggerService() {
     }

     public static LoggerService getInstance() {
         if(instance == null){             // LazyLoading
         instance = new LoggerService();
         }
         return instance;
     }

     public void log(String str) {
       System.out.println(str);
     }
 }
class Client{

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       LoggerService obj = LoggerService.getInstance();
       obj.log("Singleton class implementation");
        }
    }
