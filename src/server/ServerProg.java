package server;
import java.io.*;
import java.net.*;

public class ServerProg {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(6666);
        Socket soc = server.accept(); //listening from client

        DataInputStream din = new DataInputStream(soc.getInputStream());
        DataOutputStream dout = new DataOutputStream(soc.getOutputStream());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ser;
        String cli;

        while(true){

            cli = din.readUTF();
            System.out.println("Client says: " + cli);

            if(cli.equals("exit")){
                break;
            }

            //reading the data from input
            System.out.println("Enter Data for Client : ");
            ser = br.readLine();

            dout.writeUTF(ser);//to write data into socket
            dout.flush();//send the data to client(reciever)

        }

    }
}
