import java.net.*;
class TcpPortScanner {
   public static void main(String []args) {
      for (int port = 1; port <= 65000; port++) {
         try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress("192.168.157.131", port), 10);
            socket.close();
            System.out.println("Port " + port + " is open");
        } catch (Exception ex) { }
}}
