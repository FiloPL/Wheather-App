package fil.core;


import lombok.extern.slf4j.Slf4j;


@Slf4j
public class ExceptionLogger{
    
    public static void logException(Exception e, Class c){
        System.out.println("Exception has occurred in "+c.getName());
        System.out.println("\t"+e.getMessage());
        StringBuilder stackTrace = new StringBuilder();
        for (StackTraceElement item: e.getStackTrace())
            stackTrace.append("\t").append(item.toString()).append("\n");
    
        log.error(c.getName()+": "+e.getMessage()+"\n"+stackTrace);
        
    }
    
}
