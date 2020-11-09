import java.util.Base64;
import java.util.HashMap;
import java.util.Optional;

public class DumbEncryptionService {

    public DumbEncryptionService(){}

    public String encrypt(String content){
        return Base64.getEncoder().encodeToString(content.getBytes());
    }

    public String decrypt(String content){
        return new String(Base64.getDecoder().decode(content.getBytes()));
    }
}
