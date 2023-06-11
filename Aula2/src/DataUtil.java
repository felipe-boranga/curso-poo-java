import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {
    public static String conventerData(Date data) {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYY HH:mm");
        return formatador.format(data);
    }
}