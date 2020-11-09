import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.ThreadLocalRandom;

/**
 * A tiny server that responds to GET requests from HTTP clients.
 */
public class HttpServer {

    private final DumbEncryptionService dumbEncryptionService;

    HttpServer(){
        this.dumbEncryptionService = new DumbEncryptionService();
    }

    public void launchServer(int port) throws IOException {

        ServerSocket socket = new ServerSocket(port);

        while(true){

            /**
             *  TODO 1) accept socket to get client
             *
             *  TODO 2) get InputStream from client and read request  e.g. "GET /message HTTP/1.1"
             *
             *  TODO 3) use extracted request message and encrypt with DumbEncryptionService
             *
             *  TODO 4) get OutputStream from client and write response with content from repo,
             *          don`t forget to flush stream ;)
             *
             *  "HTTP/1.1 200 OK\r\n"
             *  "Server: TinyHttpServer\r\n"
             *  "\r\n"
             *  "REPOCONTENT..."
             *
              */
        }

    }

    public static void main(String[] args) {

        HttpServer httpServer;

        // TODO 5) create new HttpServer and a random port (ThreadLocalRandom.current())
        // TODO 6) launch it with the random port

        // TODO 7) Test ist with a client e.g. a browser -> http://localhost:random-port/message

    }

}
