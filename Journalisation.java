import java.text.SimpleDateFormat;
import java.util.Date;

public class Journalisation
{
    private static Journalisation uniqueInstance=null; // Singleton
    private String log;
    public Journalisation()
    {
        log = new String();
    }
    public static Journalisation getInstance(){
        if (uniqueInstance==null)
            synchronized(Journalisation.class){
                if (uniqueInstance==null){
                    uniqueInstance=new Journalisation();}

            }
        return uniqueInstance;
    }
    public void ajouterLog(String log)
    {
// On ajoute également la date du message.
        Date d = new Date();
        SimpleDateFormat dateFormat = new
                SimpleDateFormat("dd/MM/yy HH'h'mm");
        this.log+="["+dateFormat.format(d)+"] "+log+"\n";
    }
    // Méthode qui retourne tous les messages de log.
    public String afficherLog()
    {
        return log;
    }


}
